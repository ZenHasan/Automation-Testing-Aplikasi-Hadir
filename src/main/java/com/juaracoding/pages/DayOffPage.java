package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DayOffPage {
    private WebDriver driver;

    public DayOffPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[normalize-space()='Management']")
    private WebElement menuManagement;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Day Off']")
    private WebElement pageDayOff;

    @FindBy(xpath = "//h3[normalize-space()='Cuti Bersama']")
    private WebElement textCutiBersama;

    @FindBy(xpath = "//h3[normalize-space()='Liburan Nasional']")
    private WebElement textLiburanNasional;


    public void goToMenuManagement(){
        menuManagement.click();
    }

    public void setPageDayOff(){
        pageDayOff.click();
    }

    public String getTeksCutiBersama(){
        return textCutiBersama.getText();
    }

    public String getTeksLiburanNasional(){
        return textLiburanNasional.getText();
    }


}
