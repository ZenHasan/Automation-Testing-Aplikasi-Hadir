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
import io.cucumber.java.en.Then;
import org.testng.Assert;


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
        koreksiPage.clearStartDate();
        koreksiPage.setStartDate("Apr 1, 2024");
        koreksiPage.clearEndDate();
        koreksiPage.setEndDate("Apr 30, 2024");
        DriverSingleton.delay(2);
        koreksiPage.clickSaveButton();
        extentTest.log(LogStatus.PASS, "Admin menginput tanggal mulai dan tanggal akhir");
    }

    @Given("Admin menginput nama yang akan di cari")
    public void admin_menginput_nama_yang_akan_di_cari(){
        DriverSingleton.delay(2);
        koreksiPage.setInputNama("Agung Aji Nugraha");
        extentTest.log(LogStatus.PASS,"menginput nama yang akan di cari");
    }

    @And("Admin mengklik tombol cari")
    public void admin_mengklik_tombol_cari() {
        DriverSingleton.delay(2);
        koreksiPage.clickCariButton();
        extentTest.log(LogStatus.PASS, "Admin mengklik tombol Cari");
    }

    @Then("Tampilan data tanggal koreksi berhasil di muat")
    public void tampilan_data_tanggal_koreksi_berhasil_di_muat() {
        DriverSingleton.delay(2);
        koreksiPage.clickResetButton();
        Assert.assertEquals(koreksiPage.getTanggal(),"25 Apr 2024");
        extentTest.log(LogStatus.PASS, "Tampilan data koreksi berhasil di muat");
    }

    @Then("Tampilan data nama koreksi berhasil di muat")
    public void tampilan_data_nama_koreksi_berhasil_di_muat() {
        DriverSingleton.delay(2);
        koreksiPage.clickResetButton();
        Assert.assertEquals(koreksiPage.getNama(),"Agung Aji Nugraha");
        extentTest.log(LogStatus.PASS, "Tampilan data koreksi berhasil di muat");
    }

    //approve and reject
    @Given("Admin ke halaman selanjutnya")
    public void admin_ke_halaman_selanjutnya(){
        DriverSingleton.delay(2);
        koreksiPage.setNextPage();
        DriverSingleton.delay(3);
        koreksiPage.setPreviosPage();
        extentTest.log(LogStatus.PASS,"halaman selanjunya");
    }

    @And("Admin mengapprove data")
    public void admin_mengapprove_data() {
        DriverSingleton.delay(3);
        koreksiPage.btnApproval();
        koreksiPage.klikBtnYa();
        extentTest.log(LogStatus.PASS,"Admin mengapprove data");
    }

    @Then("Tampilan data di approve")
    public void tampilan_data_di_approve(){
        DriverSingleton.delay(2);
        Assert.assertEquals(koreksiPage.getPesanApproved(),"Berhasil menyetujui koreksi absen");
        extentTest.log(LogStatus.PASS,"data berhasil di approve");
    }

    @Given("Admin mengreject data")
    public void admin_mengreject_data(){
        DriverSingleton.delay(3);
        koreksiPage.btnReject();
        extentTest.log(LogStatus.PASS,"Admin mengreject data");
    }

    @And("Admin menginput asalan")
    public void admin_menginput_asalan() {
        DriverSingleton.delay(2);
        koreksiPage.txtReject("ga ada alasan");
        koreksiPage.klikBtnYa();
        extentTest.log(LogStatus.PASS,"Admin menginput asalan");
    }

    @Then("Tampilan data di reject")
    public void tampilan_data_di_reject(){
        Assert.assertEquals(koreksiPage.getValidationMessage(),"Berhasil menolak permintaan koreksi absen");
        extentTest.log(LogStatus.PASS,"Tampilan data di reject");
    }
}
