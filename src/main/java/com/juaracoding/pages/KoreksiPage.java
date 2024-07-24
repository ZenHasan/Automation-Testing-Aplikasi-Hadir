package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KoreksiPage {
    private WebDriver driver;

    public KoreksiPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p[normalize-space()='Laporan']")
    private WebElement menuLaporan;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Koreksi']")
    private WebElement pageKoreksi;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputNama;

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-7 MuiGrid-grid-lg-8 css-kw2xn2']//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")
    private WebElement date;

    @FindBy(xpath = "//input[@placeholder='Early']")
    private WebElement startDateField;

    @FindBy(xpath = "//input[@placeholder='Continuous']")
    private WebElement endDateField;

    @FindBy(xpath = "//button[normalize-space()='save']")
    private WebElement saveButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement cariButton;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement resetButton;

    @FindBy(xpath = "//tbody/tr[3]/td[7]/h6[1]")
    private WebElement tanggal;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/h6[1]")
    private WebElement nama;

    @FindBy(xpath = "//button[@title='Go to next page']//*[name()='svg']")
    private WebElement nextPage;

    @FindBy(xpath = "//button[@title='Go to previous page']//*[name()='svg']")
    private WebElement previosPage;

    @FindBy(xpath = "//tbody/tr[1]/td[10]/div[1]/button[1]//*[name()='svg']")
    private WebElement aprroval;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div[2]/button[1]")
    private WebElement btnYa;

    @FindBy(xpath = "//div[@class='MuiSnackbarContent-message css-1w0ym84']")
    private WebElement pesanApproved;

    @FindBy(xpath = "//tbody/tr[2]/td[10]/div[1]/button[2]//*[name()='svg']")
    private WebElement reject;

    @FindBy(xpath = "//*[@id=\"rejectReason\"]")
    private WebElement inputReject;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div[2]/button[1]")
    private WebElement btnTolak;

    @FindBy(xpath = "//div[@class='MuiSnackbarContent-message css-1w0ym84']")
    private WebElement validationMessage;

    public void goToMenuLaporan(){
        menuLaporan.click();
    }

    public void PageKoreksi(){
        pageKoreksi.click();
    }

    public void setInputNama(String namaKoreksi){
        this.inputNama.sendKeys(namaKoreksi);
    }

    public void setDate(){
        date.click();
    }

    public void setStartDate(String startDate) {
        startDateField.sendKeys(startDate);
    }

    public void setEndDate(String endDate) {
        endDateField.sendKeys(endDate);
    }

    public void clickSaveButton(){
        saveButton.click();
    }

    public void clickCariButton() {
        cariButton.click();
    }

    public void clickResetButton() {
        resetButton.click();
    }

    public String getTanggal(){
        return tanggal.getText();
    }

    public String getNama(){
        return nama.getText();
    }

    public void setNextPage(){
        nextPage.click();
    }

    public void setPreviosPage(){
        previosPage.click();
    }

    public void btnApproval(){
        aprroval.click();
    }

    public void klikBtnYa(){
        btnYa.click();
    }

    public String getPesanApproved(){
        return pesanApproved.getText();
    }

    public void btnReject(){
        reject.click();
    }

    public void txtReject(String howReject){
        inputReject.sendKeys(howReject);
    }

    public String getValidationMessage() {
        return validationMessage.getText();
    }

    public void clearStartDate(){
        startDateField.sendKeys(Keys.CONTROL + "a");
        startDateField.sendKeys(Keys.DELETE);
    }

    public void clearEndDate(){
        endDateField.sendKeys(Keys.CONTROL + "a");
        endDateField.sendKeys(Keys.DELETE);
    }
}
