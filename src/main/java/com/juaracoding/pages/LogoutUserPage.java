package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutUserPage {
    private WebDriver driver;

    public LogoutUserPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//img[@alt='menu']")
    private WebElement menuButton;

    @FindBy(xpath = "//button[normalize-space()='Logout']")
    private WebElement logoutButton;

    @FindBy(xpath = "https://staging-hadir.ptkta.com/absen/login")
    private WebElement getLinkLoginUSer;


    public void setEmail(String email){
        this.email.sendKeys(email);
    }

    public void setPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public void logoutUser(){
        DriverSingleton.delay(2);
        menuButton.click();
        DriverSingleton.delay(2);
        logoutButton.click();
    }

    public String getTeksLink(){
        return getLinkLoginUSer.getText();
    }
}
