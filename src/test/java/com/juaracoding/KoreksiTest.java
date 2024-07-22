package com.juaracoding;

import com.juaracoding.pages.KoreksiPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constant;
import com.juaracoding.drivers.DriverSingleton;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import com.juaracoding.utils.Utils;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.io.IOException;

public class KoreksiTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static KoreksiPage koreksiPage = new KoreksiPage();

    public KoreksiTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin telah login dan navigasi ke halaman laporan Koreksi")
    public void admin_telah_login_dan_navigasi_ke_halaman_laporan_koreksi() {
        driver.get(Constant.URL);
        driver.manage().window().maximize();
        loginPage.setEmailPassword("admin@hadir.com", "admin@hadir");
        loginPage.clickSubmitButton();
        extentTest.log(LogStatus.PASS, "Admin login dan mengakses halaman laporan Koreksi");
    }

    @When("Admin verifikasi tampilan data koreksi")
    public void admin_verifikasi_tampilan_data_koreksi() {
        DriverSingleton.delay(2);
        koreksiPage.goToMenuLaporan();
        koreksiPage.PageKoreksi();
        extentTest.log(LogStatus.PASS, "Admin verifikasi tampilan data koreksi");
    }

    @Given("Admin menginput tanggal mulai dan tanggal akhir")
    public void admin_menginput_tanggal_mulai_dan_tanggal_akhir() {
        koreksiPage.setDate();
        DriverSingleton.delay(2);
        koreksiPage.clearDataDate();
        koreksiPage.setStartDate("Mar 1, 2024");
        DriverSingleton.delay(2);
        koreksiPage.setEndDate("Jun 5, 2024");
        DriverSingleton.delay(3);
        koreksiPage.clickSaveButton();
        extentTest.log(LogStatus.PASS, "Admin menginput tanggal mulai dan tanggal akhir");
    }

    @Given("Admin menginput nama yang akan di cari")
    public void admin_menginput_nama_yang_akan_di_cari(){
        DriverSingleton.delay(2);
        koreksiPage.setInputNama("Agung");
        extentTest.log(LogStatus.PASS,"menginput nama yang akan di cari");
    }

    @And("Admin mengklik tombol cari")
    public void admin_mengklik_tombol_cari() {
        DriverSingleton.delay(3);
        koreksiPage.clickCariButton();
        extentTest.log(LogStatus.PASS, "Admin mengklik tombol Cari");
    }

    @Then("Tampilan data koreksi berhasil di muat")
    public void tampilan_data_koreksi_berhasil_di_muat() {
        koreksiPage.clickResetButton();
        // Verifikasi halaman Koreksi berhasil dimuat
        try {
            Assert.assertTrue(koreksiPage.isKoreksiPageLoaded(), "Halaman Koreksi tidak dimuat");
            Utils.getScreenshot(driver, "KoreksiPageLoaded");
        } catch (IOException e) {
            e.printStackTrace();
        }
        extentTest.log(LogStatus.PASS, "Tampilan data koreksi berhasil di muat");
    }

    //approve and reject
    @Given("Admin ke halaman selanjutnya")
    public void admin_ke_halaman_selanjutnya(){
        DriverSingleton.delay(2);
        koreksiPage.setNextPage();
        extentTest.log(LogStatus.PASS,"halaman selanjunya");
    }

    @And("Admin mengapprove data")
    public void admin_mengapprove_data() {
        koreksiPage.btnApproval();
//        koreksiPage.clickCariButton();
    }

    @Then("Tampilan data di approve")
    public void tampilan_data_di_approve(){
        try {
            Assert.assertTrue(koreksiPage.isKoreksiPageLoaded(), "Halaman Koreksi tidak dimuat");
            Utils.getScreenshot(driver, "KoreksiPageLoaded");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Given("Admin mengreject data")
    public void admin_mengreject_data(){
        koreksiPage.btnReject();
    }

    @And("Admin menginput asalan")
    public void admin_menginput_asalan() {
        koreksiPage.txtReject("ga ada alasan");
//        koreksiPage
    }

    @Then("Tampilan data di reject")
    public void tampilan_data_di_reject(){
        try {
            Assert.assertTrue(koreksiPage.isKoreksiPageLoaded(), "Halaman Koreksi tidak dimuat");
            Utils.getScreenshot(driver, "KoreksiPageLoaded");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//    @When("User memasukkan Tanggal Mulai {string} dan Tanggal Akhir")
//    public void user_memasukkan_tanggal_mulai_dan_tanggal_akhir() {
//        koreksiPage.setStartDate();
//        koreksiPage.setEndDate();
//        extentTest.log(LogStatus.PASS, "User memasukkan Tanggal Mulai dan Tanggal Akhir");
//    }
//
//
//
//    @Then("Data dalam rentang tanggal yang ditentukan ditampilkan")
//    public void data_dalam_rentang_tanggal_yang_ditentukan_ditampilkan() {
//        // Verifikasi data ditampilkan
//        try {
//            Assert.assertTrue(koreksiPage.isDataDisplayed(), "Data dalam rentang tanggal tidak ditampilkan");
//            Utils.getScreenshot(driver, "DataDisplayed");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        extentTest.log(LogStatus.PASS, "Data dalam rentang tanggal yang ditentukan ditampilkan");
//    }
//
//    @When("User mengklik tombol Reset")
//    public void user_mengklik_tombol_reset() {
//        koreksiPage.clickResetButton();
//        extentTest.log(LogStatus.PASS, "User mengklik tombol Reset");
//    }
//
//    @Then("Semua bidang input dikosongkan")
//    public void semua_bidang_input_dikosongkan() {
//        // Verifikasi semua bidang input dikosongkan
//        try {
//            Assert.assertTrue(koreksiPage.areFieldsCleared(), "Bidang input tidak dikosongkan");
//            Utils.getScreenshot(driver, "FieldsCleared");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        extentTest.log(LogStatus.PASS, "Semua bidang input dikosongkan");
//    }
//
//    @When("Biarkan Tanggal Mulai dan Tanggal Akhir kosong")
//    public void biarkan_tanggal_mulai_dan_tanggal_akhir_kosong() {
//        koreksiPage.setStartDate();
//        koreksiPage.setEndDate();
//        extentTest.log(LogStatus.PASS, "Biarkan Tanggal Mulai dan Tanggal Akhir kosong");
//    }
//
//    @Then("Pesan validasi ditampilkan: {string}")
//    public void pesan_validasi_ditampilkan(String message) {
//        // Verifikasi pesan validasi
//        try {
//            Assert.assertEquals("Pesan validasi tidak sesuai", message, koreksiPage.getValidationMessage());
//            Utils.getScreenshot(driver, "ValidationMessage");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        extentTest.log(LogStatus.PASS, "Pesan validasi ditampilkan: " + message);
//    }
//
//    @When("User memasukkan rentang tanggal yang tidak valid")
//    public void user_memasukkan_rentang_tanggal_yang_tidak_valid() {
//        koreksiPage.setStartDate();
//        koreksiPage.setEndDate();
//        extentTest.log(LogStatus.PASS, "User memasukkan rentang tanggal yang tidak valid");
//    }
}
