package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AturanCutiPage {
    private WebDriver driver;

    public AturanCutiPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[normalize-space()='Management']")
    private WebElement menuManagement;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Aturan Cuti']")
    private WebElement pageAturanCuti;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/div/p")
    private WebElement tampilanAturanCuti;

    @FindBy(xpath = "//input[@name = 'search']")
    private WebElement inputNama;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnCari;

    @FindBy(xpath = "//p[normalize-space()='lebaran']")
    private WebElement teksLebaran;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement btnReset;

    @FindBy(xpath = "//button[normalize-space()='Tambahkan Aturan Cuti']")
    private WebElement btnTambah;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement inputTambahNama;

    @FindBy(xpath = "//input[@id='eligible_leave_total_month']")
    private WebElement inputTambahEligible;

    @FindBy(xpath = "//div[3]/div/div/input")
    private WebElement inputTambahTanggal;

    @FindBy(xpath = "//div[4]/div/div/input")
    private WebElement inputTambahBulan;

    @FindBy(xpath = "//input[@id='max_carry_forward']")
    private WebElement inputTambahMaksimalCuti;

    @FindBy(xpath = "//input[@id='carry_forward_total_month']")
    private WebElement inputTambahJumlahCuti;

    @FindBy(xpath = "//div[2]/button[2]")
    private WebElement btnTambahbtn;

    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/section/div/div/div/div/div/div")
    private WebElement getTeksBerhasilDitambah;

    @FindBy(xpath = "//p[@id='name-helper-text']")
    private WebElement getTeksNamaHarusDiisi;

    @FindBy(xpath = "//p[@id='mui-37-helper-text']")
    private WebElement getTeksTanggalHarusDiisi;

    @FindBy(xpath = "//p[@id='mui-38-helper-text']")
    private WebElement getTeksBulanHarusDiisi;


    //titiktiga
    @FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]//*[name()='svg']")
    private WebElement titikTiga;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[1]")
    private WebElement btnView;

    @FindBy(xpath = "//h4[@class='MuiTypography-root MuiTypography-h4 css-u7mda']")
    private WebElement teksDetail;

    @FindBy(xpath = "//button[normalize-space()='Tambahkan Detail Aturan Cuti']")
    private WebElement btnTambahDetail;

    @FindBy(xpath = "//input[@id='total_month_greater']")
    private WebElement inputMinimalBulanKerja;

    @FindBy(xpath = "//input[@id='total_leave']")
    private WebElement inputTotalCuti;

    @FindBy(xpath = "//div[2]/button[2]")
    private WebElement btnTambahkan;

    @FindBy(xpath = "//div[@class='MuiSnackbarContent-message css-1w0ym84']")
    private WebElement teksSuksesMembuatAturanCuti;

    @FindBy(xpath = "//button[@type='button'][24]")
    private WebElement btnTutup;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[2]")
    private WebElement btnEdit;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement editNamaAturanCuti;

    @FindBy(xpath = "//input[@id='eligible_leave_total_month']")
    private WebElement editEligible;

    @FindBy(xpath = "//div[3]/div/div/input")
    private WebElement editInputTanggal;

    @FindBy(xpath = "//div[4]/div/div/input")
    private WebElement editInputBulan;

    @FindBy(xpath = "//input[@id='max_carry_forward']")
    private WebElement editSisaCuti;

    @FindBy(xpath = "//input[@id='carry_forward_total_month']")
    private WebElement editJumlahBulanSisaCuti;

    @FindBy(xpath = "//div[2]/button[2]")
    private WebElement editBtnSimpan;

    @FindBy(xpath = "//section/div/div/div")
    private WebElement getEditBerhasilDiperbarui;

    @FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[3]")
    private WebElement btnDelete;

    @FindBy(xpath = "//div[2]/button[2]")
    private WebElement deleteBtnHapus;

    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/section/div/div/div/div")
    private WebElement getDeleteBerhasilDihapus;


    @FindBy(xpath = "//button[@title='Go to next page']//*[name()='svg']")
    private WebElement btnNextPage;

    @FindBy(xpath = "//button[@title='Go to previous page']//*[name()='svg']")
    private WebElement btnPrevious;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement btnPadding;


    public void klikMenuManagement(){
        menuManagement.click();
    }

    public void klikPageAturanCuti(){
        pageAturanCuti.click();
    }

    public String getAturanCuti(){
        return tampilanAturanCuti.getText();
    }

    public void setNama(String namaAturan){
        this.inputNama.sendKeys(namaAturan);
    }

    public void klikCari(){
        btnCari.click();
    }

    public String getTeksLebaran(){
        return teksLebaran.getText();
    }

    public void klikReset(){
        btnReset.click();
    }

    public void klikTambah(){
        btnTambah.click();
    }

    public void inputTambahNama(String tambahNama){
        this.inputTambahNama.sendKeys(tambahNama);
    }

    public void inputTambahEligible(String tambahEligible){
        this.inputTambahEligible.sendKeys(tambahEligible);
    }

    public void clearTambahEligible(){
        inputTambahEligible.sendKeys(Keys.CONTROL + "a");
        inputTambahEligible.sendKeys(Keys.DELETE);
    }

    public void inputTambahTanggal(String tambahTanggal){
        this.inputTambahTanggal.sendKeys(tambahTanggal);
    }

    public void clearTambahTanggal(){
        inputTambahTanggal.sendKeys(Keys.CONTROL + "a");
        inputTambahTanggal.sendKeys(Keys.DELETE);
    }

    public void inputTambahBulan(String tambahBulan){
        this.inputTambahBulan.sendKeys(tambahBulan);
    }

    public void clearTambahBulan(){
        inputTambahBulan.sendKeys(Keys.CONTROL + "a");
        inputTambahBulan.sendKeys(Keys.DELETE);
    }

    public void inputTambahMaksimalCuti(String tambahMaksimalCuti){
        this.inputTambahMaksimalCuti.sendKeys(tambahMaksimalCuti);
    }

    public void clearTambahMaksimalCuti(){
        inputTambahMaksimalCuti.sendKeys(Keys.CONTROL + "a");
        inputTambahMaksimalCuti.sendKeys(Keys.DELETE);
    }

    public void inputTambahJumlahCuti(String tambahJumlahCuti){
        this.inputTambahJumlahCuti.sendKeys(tambahJumlahCuti);
    }

    public void clearTambahJumlahCuti(){
        inputTambahJumlahCuti.sendKeys(Keys.CONTROL + "a");
        inputTambahJumlahCuti.sendKeys(Keys.DELETE);
    }

    public void klikBtnTambahBtn(){
        btnTambahbtn.click();
    }

    public String getTeksBerhasilMenambahkan(){
        return getTeksBerhasilDitambah.getText();
    }

    public String getTeksNamaHarusDiIsi(){
        return getTeksNamaHarusDiisi.getText();
    }

    public String getTeksTanggalHarusDiIsi(){
        return getTeksTanggalHarusDiisi.getText();
    }

    public String getTeksBulanHarusDiIsi(){
        return getTeksBulanHarusDiisi.getText();
    }

    public void klikBtnTutup(){
        btnTutup.click();
    }

    //titiktiga
    public void klikTitikTiga(){
        titikTiga.click();
    }

    public void klikView(){
        btnView.click();
    }

    public String getTeksDetail(){
        return teksDetail.getText();
    }

    public void klikTambahkanDetail(){
        btnTambahDetail.click();
    }

    public void setInputMinmalBulanKerja(String minimalBulan){
        this.inputMinimalBulanKerja.sendKeys(minimalBulan);
    }

    public void clearMinimalBulan(){
        inputMinimalBulanKerja.sendKeys(Keys.CONTROL + "a");
        inputMinimalBulanKerja.sendKeys(Keys.DELETE);
    }

    public void setInputTotalCuti(String totalCuti){
        this.inputTotalCuti.sendKeys(totalCuti);
    }

    public void clearTotalCuti(){
        inputTotalCuti.sendKeys(Keys.CONTROL + "a");
        inputTotalCuti.sendKeys(Keys.DELETE);
    }

    public void klikTambahkan(){
        btnTambahkan.click();
    }

    public String getTeksSuksesMembuatAturanCuti(){
        return teksSuksesMembuatAturanCuti.getText();
    }

    public void klikEdit(){
        btnEdit.click();
    }

    public void inputEditNama(String namaEdit){
        this.editNamaAturanCuti.sendKeys(namaEdit);
    }

    public void clearEditNama(){
        editNamaAturanCuti.sendKeys(Keys.CONTROL + "a");
        editNamaAturanCuti.sendKeys(Keys.DELETE);
    }

    public void inputEditEligible(String eligibleEdit){
        this.editEligible.sendKeys(eligibleEdit);
    }

    public void clearEditEligible(){
        editEligible.sendKeys(Keys.CONTROL + "a");
        editEligible.sendKeys(Keys.DELETE);
    }

    public void inputEditTanggal(String tanggalEdit){
        this.editInputTanggal.sendKeys(tanggalEdit);
    }

    public void clearEditTanggal(){
        editInputTanggal.sendKeys(Keys.CONTROL + "a");
        editInputTanggal.sendKeys(Keys.DELETE);
    }

    public void inputEditBulan(String bulanEdit){
        this.editInputBulan.sendKeys(bulanEdit);
    }

    public void clearEditBulan(){
        editInputBulan.sendKeys(Keys.CONTROL + "a");
        editInputBulan.sendKeys(Keys.DELETE);
    }

    public void inputEditSisalCuti(String sisaCutiEdit){
        this.editSisaCuti.sendKeys(sisaCutiEdit);
    }

    public void clearEditSisaCuti(){
        editSisaCuti.sendKeys(Keys.CONTROL + "a");
        editSisaCuti.sendKeys(Keys.DELETE);
    }

    public void inputEditJumlahBulan(String jumlahBulanEdit){
        this.editJumlahBulanSisaCuti.sendKeys(jumlahBulanEdit);
    }

    public void clearEditJumlahBulan(){
        editJumlahBulanSisaCuti.sendKeys(Keys.CONTROL + "a");
        editJumlahBulanSisaCuti.sendKeys(Keys.DELETE);
    }

    public void klikEditBtnSimpan(){
        editBtnSimpan.click();
    }

    public String getBerhasilDiperbarui(){
        return getEditBerhasilDiperbarui.getText();
    }

    public void klikDelete(){
        btnDelete.click();
    }

    public void klikDeleteBtnHapus(){
        deleteBtnHapus.click();
    }

    public String getDeleteBerhasil(){
        return getDeleteBerhasilDihapus.getText();
    }

    /*//page//*/
    public void klikNextPage(){
        btnNextPage.click();
    }

    public void klikPreviousPage(){
        btnPrevious.click();
    }

    public void klikPadding(){
        btnPadding.click();
    }
}
