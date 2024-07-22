package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.PerjalananDinasPage;
import com.juaracoding.utils.Constant;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class PerjalananDinasTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static PerjalananDinasPage perjalananDinasPage = new PerjalananDinasPage();

    public PerjalananDinasTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin telah login dan navigasi ke halaman laporan perjalanan dinas")
    public void admin_telah_login_dan_navigasi_ke_halaman_laporan_perjalanan_dinas() {
        driver.get(Constant.URL);
        driver.manage().window().maximize();
        loginPage.setEmailPassword("admin@hadir.com", "admin@hadir");
        loginPage.clickSubmitButton();
        extentTest.log(LogStatus.PASS, "Admin login dan mengakses halaman laporan Koreksi");
    }

    @When("Admin verifikasi tampilan data perjalanan dinas")
    public void admin_verifikasi_tampilan_data_perjalanan_dinas() {
        DriverSingleton.delay(2);
        perjalananDinasPage.goToMenuLaporan();
        perjalananDinasPage.setPagePerjalananDinas();
        extentTest.log(LogStatus.PASS, "Admin verifikasi tampilan data perjalanan dinas");
    }

    @Given("Admin menginput tanggal mulai dan tanggal akhir pada perjalanan dinas")
    public void admin_menginput_tanggal_mulai_dan_tanggal_akhir_pada_perjalanan_dinas() {
        perjalananDinasPage.setDate();
        DriverSingleton.delay(2);
        perjalananDinasPage.clearDataDate();
        perjalananDinasPage.setStartDate("Feb 1, 2024");
        perjalananDinasPage.setEndDate("Apr 28, 2024");
        DriverSingleton.delay(2);
        perjalananDinasPage.clickSaveButton();
        extentTest.log(LogStatus.PASS, "Admin menginput tanggal mulai dan tanggal akhir");
    }

    @Given("Admin menginput nama yang akan di cari pada perjalanan dinas")
    public void admin_menginput_nama_yang_akan_di_cari_pada_perjalanan_dinas(){
        DriverSingleton.delay(2);
        perjalananDinasPage.setInputNama("Husain");
        extentTest.log(LogStatus.PASS,"menginput nama yang akan di cari");
    }

    @And("Admin mengklik tombol cari pada halaman perjalanan dinas")
    public void admin_mengklik_tombol_cari_pada_halaman_perjalanan_dinas() {
        DriverSingleton.delay(3);
        perjalananDinasPage.clickCariButton();
        extentTest.log(LogStatus.PASS, "Admin mengklik tombol Cari");
    }

    @Then("Tampilan data perjalanan dinas berhasil di muat")
    public void tampilan_data_koreksi_berhasil_di_muat() {
        DriverSingleton.delay(3);
        perjalananDinasPage .clickResetButton();
        // Verifikasi halaman Koreksi berhasil dimuat
        try {
            Assert.assertTrue(perjalananDinasPage.isPerjalananDinasPageLoaded(), "Halaman Koreksi tidak dimuat");
            Utils.getScreenshot(driver, "KoreksiPageLoaded");
        } catch (IOException e) {
            e.printStackTrace();
        }
        extentTest.log(LogStatus.PASS, "Tampilan data koreksi berhasil di muat");
    }


    //verifikasi halaman selanjutnya dan melihat dokumen yang di upload
    @Given("Halaman selanjutnya dan mengaprove user")
    public void halaman_selanjutnya_dan_mengaprove_user(){
        DriverSingleton.delay(2);
        perjalananDinasPage.setNextPage();
    }

    @When("Admin mereject user")
    public void admin_mereject_user(){

    }

    @And("Admin kembali ke halaman sebelumnya")
    public void admin_kembali_ke_halaman_sebelumnya(){
    DriverSingleton.delay(2);
    perjalananDinasPage.setPreviosPage();
    }

    @And("Admin melihat dokumen yang di upload")
    public void admin_melihat_dokumen_yang_di_upload(){

    }
}
