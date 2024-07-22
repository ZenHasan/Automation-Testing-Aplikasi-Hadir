package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.CompanyPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class CompanyTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static CompanyPage companyPage = new CompanyPage();

    public CompanyTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin telah login dan navigasi ke halaman perusahaan")
    public void admin_telah_login_dan_navigasi_ke_halaman_perusahaan() {
        driver.get(Constant.URL);
        driver.manage().window().maximize();
        loginPage.setEmailPassword("admin@hadir.com", "admin@hadir");
        loginPage.clickSubmitButton();
        extentTest.log(LogStatus.PASS, "Admin telah login dan navigasi ke halaman perusahaan");
    }

    @When("Admin verifikasi tampilan data perusahaan")
    public void admin_verifikasi_tampilan_data_perusahaan() {
        DriverSingleton.delay(2);
        companyPage.goToAddCompany();
        companyPage.pagePerusahaan();
        extentTest.log(LogStatus.PASS, "Verifikasi tampilan data perusahaan berhasil");
    }

    @When("Admin klik tombol edit perusahaan")
    public void admin_klik_tombol_edit_perusahaan() {
        DriverSingleton.delay(2);
        companyPage.setTitikTiga();
        companyPage.clickEditCompany();
        extentTest.log(LogStatus.PASS, "Klik tombol edit perusahaan");
    }

    @And("Admin mengisi nama perusahaan dan industri")
    public void admin_mengisi_nama_perusahaan_dan_industri() {
        companyPage.setCompanyName("PT.Apjakon");
        companyPage.setCompanyIndustry("Konsultan Dan Perizinan");
        extentTest.log(LogStatus.PASS, "Mengisi nama perusahaan dan industri");
    }

    @And("Admin menyimpan perubahan perusahaan")
    public void admin_menyimpan_perubahan_perusahaan() {
        companyPage.saveCompany();
        extentTest.log(LogStatus.PASS, "Menyimpan perubahan perusahaan");
    }

    @When("Admin mengisi nama perusahaan kosong dan mengisi industri")
    public void admin_mengisi_nama_perusahaan_kosong_dan_industri() {
        companyPage.setCompanyName("nama nama");
        companyPage.setCompanyIndustry("");
        companyPage.saveCompany();
        companyPage.clearNameIndustryCompany();
        extentTest.log(LogStatus.PASS, "Mengisi nama perusahaan kosong dan mengisi industri");
    }

    @When("Admin mengisi nama perusahaan dan industri kosong")
    public void admin_mengisi_nama_perusahaan_dan_industri_kosong(String companyName) {
        companyPage.setCompanyName("");
        companyPage.setCompanyIndustry("apa aja");
        companyPage.saveCompany();
        companyPage.clearNameIndustryCompany();
        extentTest.log(LogStatus.PASS, "Mengisi nama perusahaan dan industri kosong");
    }

    @When("Admin mengisi nama perusahaan kosong dan industri kosong")
    public void admin_mengisi_nama_perusahaan_kosong_dan_industri_kosong() {
        companyPage.setCompanyName("");
        companyPage.setCompanyIndustry("");
        companyPage.saveCompany();
        companyPage.clearNameIndustryCompany();
        extentTest.log(LogStatus.PASS, "Mengisi nama perusahaan kosong dan industri kosong");
    }
}
