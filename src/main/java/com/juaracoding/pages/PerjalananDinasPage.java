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

    @FindBy(xpath = "//button[@title='Go to previous page']//*[name()='svg']")
    private WebElement previosPage;


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

    public void setPreviosPage(){
        previosPage.click();
    }

    public boolean isPerjalananDinasPageLoaded() {
        // Implement logic to verify if Koreksi page is loaded
        return true;
    }

    public boolean areFieldsCleared() {
        // Implement logic to verify if fields are cleared
        return startDateField.getText().isEmpty() && endDateField.getText().isEmpty();
    }

    public void clearDataDate(){
        startDateField.sendKeys(Keys.CONTROL + "a");
        startDateField.sendKeys(Keys.DELETE);

        endDateField.sendKeys(Keys.CONTROL + "a");
        endDateField.sendKeys(Keys.DELETE);
    }
}
