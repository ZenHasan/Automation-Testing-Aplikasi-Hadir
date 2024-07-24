package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LogoutUserPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogoutUserTest {
    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LogoutUserPage logoutUserPage = new LogoutUserPage();


    public LogoutUserTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("I am on the login page user")
    public void i_am_on_the_login_page_user(){
        driver.get(Constant.URLUser);
        driver.manage().window().maximize();
        extentTest.log(LogStatus.PASS, "I am on the login page user");
    }

    @When("I enter a valid email and password user")
    public void i_enter_a_valid_email_and_password_user(){
        DriverSingleton.delay(2);
        logoutUserPage.setEmail("zenhasan@gmail.com");
        logoutUserPage.setPassword("zenhasan");
        extentTest.log(LogStatus.PASS, "I enter a valid email and password user");
    }


    @And("I click the submit button user")
    public void i_click_the_submit_button_user() {
        logoutUserPage.clickSubmitButton();
        extentTest.log(LogStatus.PASS, "I click the submit button user");
    }

    @And("Logout in page user")
    public void logout_in_page_user() {
        logoutUserPage.logoutUser();
        extentTest.log(LogStatus.PASS, "Logout in page user");
    }


    @Then("I succesfully logout")
    public void i_succesfully_logout() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://staging-hadir.ptkta.com/apps/absent");
        extentTest.log(LogStatus.PASS, "I succesfully logout");
    }
}
