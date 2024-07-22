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


    public void goToMenuManagement(){
        menuManagement.click();
    }

    public void setPageDayOff(){
        pageDayOff.click();
    }
    public boolean isDayOffPageLoaded() {
        return pageDayOff.isDisplayed();
    }
}
