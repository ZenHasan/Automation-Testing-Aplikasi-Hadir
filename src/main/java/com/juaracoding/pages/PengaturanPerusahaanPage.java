package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PengaturanPerusahaanPage {
    private WebDriver driver;

    public PengaturanPerusahaanPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[normalize-space()='Perusahaan']")
    private WebElement menuAddCompany;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Pengaturan Perusahaan']")
    private WebElement pagePengaturanPerusahaan;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1kei35f']")
    private WebElement getTeksTampilanPengaturanPerusahaan;

    @FindBy(xpath = "//button[@aria-label='action']//*[name()='svg']//*[name()='g']//*[name()='circle'][1]")
    private WebElement titikTiga;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li")
    private WebElement getTeksEdit;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li[2]")
    private WebElement getTeksDelete;

    public void setAddCompany() {
        menuAddCompany.click();
    }

    public void setPagePengaturanPerusahaan(){
        pagePengaturanPerusahaan.click();
    }

    public String getTeksTampilan(){
        return getTeksTampilanPengaturanPerusahaan.getText();
    }

    public void klikTitikTigas(){
        titikTiga.click();
    }

    public String getTeksEdit(){
        return getTeksEdit.getText();
    }

    public String getTeksDelete(){
        return getTeksDelete.getText();
    }
}
