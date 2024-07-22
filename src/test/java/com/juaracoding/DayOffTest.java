package com.juaracoding;

import com.juaracoding.pages.DayOffPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constant;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class DayOffTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static DayOffPage dayOffPage = new DayOffPage();

    public DayOffTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin telah login")
    public void admin_telah_login(){
        driver.get(Constant.URL);
        driver.manage().window().maximize();
        loginPage.setEmailPassword("admin@hadir.com", "admin@hadir");
        loginPage.clickSubmitButton();
        extentTest.log(LogStatus.PASS, "Admin telah login");
    }

    @When("Navigasi ke halaman management day off")
    public void navigasi_ke_halaman_management_day_off(){
        dayOffPage.goToMenuManagement();
        dayOffPage.setPageDayOff();
        extentTest.log(LogStatus.PASS, "Navigasikan ke menu Management dan sub-menu Day Off");
    }

    @Then("Verifikasi tampilan data day off")
    public void verifikasi_tampilan_data_day_off(){
        try {
            Assert.assertTrue(dayOffPage.isDayOffPageLoaded(), "Halaman Day Off tidak dimuat");
            Utils.getScreenshot(driver, "DayOffPageLoaded");
        } catch (IOException e) {
            e.printStackTrace();
        }
        extentTest.log(LogStatus.PASS, "Verifikasi tampilan data Day Off");
    }
}
