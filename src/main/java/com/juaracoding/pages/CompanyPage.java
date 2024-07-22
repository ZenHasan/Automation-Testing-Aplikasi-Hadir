package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {
    private WebDriver driver;

    public CompanyPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[normalize-space()='Perusahaan']")
    private WebElement menuAddCompany;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Perusahaan']")
    private WebElement pagePerusahaan;

    @FindBy(xpath = "//button[@aria-label='action']//*[name()='svg']")
    private WebElement titikTiga;

    @FindBy(xpath = "//*[@id=\"card-actions-menu\"]/div[3]/ul/li[1]")
    private WebElement btnEditCompany;


    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement txtCompanyName;

    @FindBy(xpath = "//*[@id=\"industry\"]")
    private WebElement txtCompanyIndustry;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;

    @FindBy(xpath = "//button[@type='batal']")
    private WebElement btnCancel;

    @FindBy(xpath = "//div[contains(@class, 'alert-success')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[contains(@class, 'alert-error')]")
    private WebElement errorMessage;

    public void goToAddCompany() {
        menuAddCompany.click();
    }

    public void pagePerusahaan() {
        pagePerusahaan.click();
    }

    public void setTitikTiga() {
        titikTiga.click();
    }

    public void clickEditCompany() {
        btnEditCompany.click();
    }

    public void setCompanyName(String companyName) {
        txtCompanyName.clear();
        txtCompanyName.sendKeys(companyName);
    }

    public void setCompanyIndustry(String companyIndustry) {
        txtCompanyIndustry.clear();
        txtCompanyIndustry.sendKeys(companyIndustry);
    }

    public void saveCompany() {
        btnSave.click();
    }

    public void CancelSaveCompany(){
        btnCancel.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void clearNameIndustryCompany(){
        txtCompanyName.sendKeys(Keys.CONTROL+"a");
        txtCompanyName.sendKeys(Keys.DELETE);

        txtCompanyIndustry.sendKeys(Keys.CONTROL+"a");
        txtCompanyIndustry.sendKeys(Keys.DELETE);
    }
}
