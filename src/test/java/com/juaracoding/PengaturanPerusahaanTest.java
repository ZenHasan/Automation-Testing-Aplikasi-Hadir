package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.CompanyPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.PengaturanPerusahaanPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PengaturanPerusahaanTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static PengaturanPerusahaanPage pengaturanPerusahaanPage = new PengaturanPerusahaanPage();

    public PengaturanPerusahaanTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin telah login dan navigasi ke halaman perusahaan pengaturan perusahaan")
    public void admin_telah_login_dan_navigasi_ke_halaman_perusahaan_pengaturan_perusahaan(){
        driver.get(Constant.URL);
        driver.manage().window().maximize();
        loginPage.setEmailPassword("admin@hadir.com", "admin@hadir");
        loginPage.clickSubmitButton();
        extentTest.log(LogStatus.PASS, "Admin telah login dan navigasi ke halaman perusahaan pengaturan perusahaan");
    }

    @When("Admin verifikasi tampilan data pengaturan pengaturan perusahaan")
    public void admin_verifikasi_tampilan_data_pengaturan_pengaturan_perusahaan() {
        DriverSingleton.delay(2);
        pengaturanPerusahaanPage.setAddCompany();
        pengaturanPerusahaanPage.setPagePengaturanPerusahaan();
        extentTest.log(LogStatus.PASS, "Admin verifikasi tampilan data pengaturan pengaturan perusahaan");
    }

    @Then("Semua data pengaturan perusahaan ditampilkan di halaman")
    public void semua_data_pengaturan_perusahaan_ditampilkan_di_halaman() {
        Assert.assertEquals(pengaturanPerusahaanPage.getTeksTampilan(),"Pengaturan Perusahaan");
        extentTest.log(LogStatus.PASS, "Semua data pengaturan perusahaan ditampilkan di halaman");
    }


    @Given("Admin klik titik tiga")
    public void admin_klik_titik_tiga() {
        pengaturanPerusahaanPage.klikTitikTigas();
        extentTest.log(LogStatus.PASS, "Admin klik titik tiga");
    }


    @Then("Validasi tombol edit")
    public void validasi_tombol_edit() {
        Assert.assertEquals(pengaturanPerusahaanPage.getTeksEdit(),"Edit");
        extentTest.log(LogStatus.PASS, "Validasi tombol edit");
    }


    @Then("Validasi tombol hapus")
    public void validasi_tombol_hapus() {
        Assert.assertEquals(pengaturanPerusahaanPage.getTeksDelete(),"Delete");
        extentTest.log(LogStatus.PASS, "Validasi tombol hapus");
    }
}
