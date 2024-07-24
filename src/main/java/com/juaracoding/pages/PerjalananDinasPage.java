package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerjalananDinasPage {
    private WebDriver driver;

    public PerjalananDinasPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//p[normalize-space()='Laporan']")
    private WebElement menuLaporan;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Perjalanan Dinas']")
    private WebElement pagePerjalananDinas;

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

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div[2]/div[1]/div/table/tbody/tr[2]/td[5]/h6/a/button")
    private WebElement viewDokument;

    @FindBy(xpath = "//button[@title='Go to next page']//*[name()='svg']")
    private WebElement nextPage;

    @FindBy(xpath = "//tbody/tr[3]/td[7]/div[1]/div[1]/button[1]//*[name()='svg']")
    private WebElement titikTiga;

    @FindBy(xpath = "/html/body/div[5]/div[3]/ul/li[1]")
    private WebElement approve;

    @FindBy(xpath = "//div[2]/button")
    private WebElement btnYa;

    @FindBy(xpath = "/html/body/div[7]/div[3]/div/form/div[2]/button[2]")
    private WebElement btnBatal;

    @FindBy(xpath = "//tbody/tr[4]/td[7]/div[1]/div[1]/button[1]//*[name()='svg']")
    private WebElement titikTiga2;

    @FindBy(xpath = "/html/body/div[6]/div[3]/ul/li[2]")
    private WebElement reject;

    @FindBy(xpath = "//*[@id=\"rejectReason\"]")
    private WebElement inputReject;


    @FindBy(xpath = "//button[@title='Go to previous page']//*[name()='svg']")
    private WebElement previosPage;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/h6[1]")
    private WebElement namaUser;

    @FindBy(xpath = "//h6[normalize-space()='04 Apr 2024']")
    private WebElement tanggal;



    public void goToMenuLaporan(){
        menuLaporan.click();
    }

    public void setPagePerjalananDinas(){
        pagePerjalananDinas.click();
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

    //terakhir
    public void setViewDokument(){
        viewDokument.click();
    }
    //

    public void setNextPage(){
        nextPage.click();
    }

    public void klikTitikTiga(){
        titikTiga.click();
    }

    public void klikApprove(){
        approve.click();
    }

    public void klikBtnYa(){
        btnYa.click();
    }

    public void klikBtnBatal(){
        btnBatal.click();
    }

    public void klikTitikTiga2(){
        titikTiga2.click();
    }

    public void klikReject(){
        reject.click();
    }

    public void setInputReject(String howReject){
        inputReject.sendKeys(howReject);
    }

    public void setPreviosPage(){
        previosPage.click();
    }

    public String getNamaUser(){
        return namaUser.getText();
    }

    public String getTanggal(){
        return tanggal.getText();
    }

    public void clearStartDataDate(){
        startDateField.sendKeys(Keys.CONTROL + "a");
        startDateField.sendKeys(Keys.DELETE);
    }

    public void clearEndDataDate(){
        endDateField.sendKeys(Keys.CONTROL + "a");
        endDateField.sendKeys(Keys.DELETE);
    }
}
