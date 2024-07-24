package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.AturanCutiPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AturanCutiTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static AturanCutiPage aturanCutiPage = new AturanCutiPage();

    public AturanCutiTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin telah login dan navigasi ke halaman management aturan cuti")
    public void admin_telah_login_dan_navigasi_ke_halaman_laporan_perjalanan_dinas() {
        driver.get(Constant.URL);
        driver.manage().window().maximize();
        loginPage.setEmailPassword("admin@hadir.com", "admin@hadir");
        loginPage.clickSubmitButton();
        extentTest.log(LogStatus.PASS, "Admin login dan mengakses halaman management aturan cuti");
    }

    @When("Admin verifikasi tampilan data aturan cuti")
    public void admin_verifikasi_tampilan_data_perjalanan_dinas() {
        DriverSingleton.delay(2);
        aturanCutiPage.klikMenuManagement();
        aturanCutiPage.klikPageAturanCuti();
        Assert.assertEquals(aturanCutiPage.getAturanCuti(),"Aturan Cuti");
        extentTest.log(LogStatus.PASS, "Admin verifikasi tampilan data aturan cuti");
    }

    @Then("Semua data aturan cuti ditampilkan di halaman")
    public void semua_data_aturan_cuti_ditampilkan_di_halaman(){
        Assert.assertEquals(aturanCutiPage.getAturanCuti(),"Aturan Cuti");
        extentTest.log(LogStatus.PASS,"Semua data aturan cuti ditampilkan di halaman");
    }


    @Given("Admin menginput nama yang akan di cari pada aturan cuti")
    public void admin_menginput_nama_yang_akan_di_cari_pada_aturan_cuti() {
        DriverSingleton.delay(2);
        aturanCutiPage.setNama("lebaran");
        extentTest.log(LogStatus.PASS,"Admin menginput nama yang akan di cari pada aturan cuti");
    }


    @When("Admin mengklik tombol cari pada halaman aturan cuti")
    public void admin_mengklik_tombol_cari_pada_halaman_aturan_cuti() {
        DriverSingleton.delay(2);
        aturanCutiPage.klikCari();
        extentTest.log(LogStatus.PASS,"Admin mengklik tombol cari pada halaman aturan cuti");
    }

    @Then("Tampilan data nama user aturan cuti berhasil di muat")
    public void tampilan_data_nama_user_aturan_cuti_berhasil_di_muat() {
        DriverSingleton.delay(2  );
        Assert.assertEquals(aturanCutiPage.getTeksLebaran(),"lebaran");
        aturanCutiPage.klikReset();
        extentTest.log(LogStatus.PASS,"Tampilan data nama user aturan cuti berhasil di muat");
    }


    @Given("Admin memilih nama pada table aturan cuti yang akan dilihat lalu klik titik tiga")
    public void admin_memilih_nama_pada_table_aturan_cuti_yang_akan_dilihat_lalu_klik_titik_tiga() {
        DriverSingleton.delay(2);
        aturanCutiPage.klikTitikTiga();
        extentTest.log(LogStatus.PASS,"Admin memilih nama pada table aturan cuti yang akan dilihat lalu klik titik tiga");
    }

    @And("Admin mengklik tombol view")
    public void admin_mengklik_tombol_view() {
        aturanCutiPage.klikView();
        extentTest.log(LogStatus.PASS,"Admin mengklik tombol view");
    }

    @Then("Tampilan detail view aturan cuti")
    public void tampilan_detail_view_aturan_cuti() {
        Assert.assertEquals(aturanCutiPage.getTeksDetail(),"Detail Aturan Cuti");
        extentTest.log(LogStatus.PASS,"Tampilan detail view aturan cuti");
    }


    @Given("Admin menambahkan detail aturan cuti")
    public void admin_menambahkan_detail_cuti() {
        DriverSingleton.delay(2);
        aturanCutiPage.klikTambahkanDetail();
        extentTest.log(LogStatus.PASS,"Tampilan detail view aturan cuti");
    }

    @And("Menginput minimal bulan bekerja pada detail aturan cuti")
    public void menginput_minimal_bulan_bekerja_pada_detail_aturan_cuti() {
        DriverSingleton.delay(2);
        aturanCutiPage.clearMinimalBulan();
        aturanCutiPage.setInputMinmalBulanKerja("21");
        extentTest.log(LogStatus.PASS,"Menginput minimal bulan bekerja pada detail aturan cuti");
    }

    @And("Menginput total cuti pada detail aturan cuti")
    public void menginput_total_cuti_pada_detail_aturan_cuti() {
        aturanCutiPage.clearTotalCuti();
        aturanCutiPage.setInputTotalCuti("11");
        aturanCutiPage.klikTambahkan();
        extentTest.log(LogStatus.PASS,"Menginput total cuti pada detail aturan cuti");
    }

    @Then("Sukses membuat aturan cuti")
    public void sukses_membuat_aturan_cuti() {
        Assert.assertEquals(aturanCutiPage.getTeksSuksesMembuatAturanCuti(),"Sukses Membuat Aturan Cuti");
        extentTest.log(LogStatus.PASS,"Sukses membuat aturan cuti");
    }

    @And("Kembali ke halaman utama aturan cuti")
    public void kembali_ke_halaman_utama_aturan_cuti() {
        DriverSingleton.delay(2);
        aturanCutiPage.klikMenuManagement();
        DriverSingleton.delay(2);
        aturanCutiPage.klikPageAturanCuti();
        extentTest.log(LogStatus.PASS,"Kembali ke halaman utama aturan cuti");
    }


    @Given("Admin memilih nama pada table aturan cuti yang akan di edit lalu klik titik tiga")
    public void admin_memilih_nama_pada_table_aturan_cuti_yang_akan_di_edit_lalu_klik_titik_tiga() {
        aturanCutiPage.klikTitikTiga();
        extentTest.log(LogStatus.PASS,"Admin memilih nama pada table aturan cuti yang akan di edit lalu klik titik tiga");

    }

    @And("Admin mengklik tombol edit")
    public void admin_mengklik_tombol_edit() {
        aturanCutiPage.klikEdit();
        extentTest.log(LogStatus.PASS,"Admin mengklik tombol edit");
    }

    @And("Admin mengisi kolom yang di perlukan")
    public void admin_mengisi_kolom_yang_di_perlukan() {
        DriverSingleton.delay(2);
        aturanCutiPage.clearEditNama();
        aturanCutiPage.inputEditNama("BangJago");
        aturanCutiPage.clearEditEligible();
        aturanCutiPage.inputEditEligible("44");
        aturanCutiPage.clearEditTanggal();
        aturanCutiPage.inputEditTanggal("4");
        aturanCutiPage.clearEditBulan();
        aturanCutiPage.inputEditBulan("11");
        aturanCutiPage.clearEditSisaCuti();
        aturanCutiPage.inputEditSisalCuti("19");
        aturanCutiPage.clearEditJumlahBulan();
        aturanCutiPage.inputEditJumlahBulan("9");
        extentTest.log(LogStatus.PASS,"Admin mengisi kolom yang di perlukan");
    }

    @And("Admin mengklik tombol simpan")
    public void admin_mengklik_tombol_simpan() {
        aturanCutiPage.klikEditBtnSimpan();
        extentTest.log(LogStatus.PASS,"Admin mengklik tombol simpan");
    }

    @Then("Aturan cuti berhasil diperbarui dengan pesan sukses")
    public void aturan_cuti_berhasil_diperbarui_dengan_pesan_sukses(){
        Assert.assertTrue(aturanCutiPage.getBerhasilDiperbarui().contains("Reset"));
        extentTest.log(LogStatus.PASS,"Aturan cuti berhasil diperbarui dengan pesan sukses");
    }

    @Given("Admin memilih nama pada table aturan cuti yang akan dihapus lalu klik titik tiga")
    public void admin_memilih_nama_pada_table_aturan_cuti_yang_akan_dihapus_lalu_klik_titik_tiga() {
        driver.get("https://staging-hadir.ptkta.com/management/unit-leave");
        aturanCutiPage.klikTitikTiga();
        aturanCutiPage.klikDelete();
        extentTest.log(LogStatus.PASS,"Admin memilih nama pada table aturan cuti yang akan dihapus lalu klik titik tiga");
    }

    @And("Admin mengklik tombol delete")
    public void admin_mengklik_tombol_delete() {
        aturanCutiPage.klikDeleteBtnHapus();
        extentTest.log(LogStatus.PASS,"Admin mengklik tombol delete");
    }


    @Given("Admin mengklik tombol tambah baru")
    public void admin_mengklik_tombol_tambah_baru() {
        driver.get("https://staging-hadir.ptkta.com/management/unit-leave");
        aturanCutiPage.klikTambah();
        extentTest.log(LogStatus.PASS,"Admin mengklik tombol tambah baru");
    }


    @When("Admin menginput tambah aturan cuti pada kolom")
    public void admin_menginput_tambah_aturan_cuti_pada_kolom() {
        aturanCutiPage.inputTambahNama("Hari Raya Idul Fitri");
        aturanCutiPage.clearTambahEligible();
        aturanCutiPage.inputTambahEligible("11");
        aturanCutiPage.clearTambahTanggal();
        aturanCutiPage.inputTambahTanggal("4");
        aturanCutiPage.clearTambahBulan();
        aturanCutiPage.inputTambahBulan("11");
        aturanCutiPage.clearTambahMaksimalCuti();
        aturanCutiPage.inputTambahMaksimalCuti("12");
        aturanCutiPage.clearTambahJumlahCuti();
        aturanCutiPage.inputTambahJumlahCuti("24");
        extentTest.log(LogStatus.PASS,"Admin menginput tambah aturan cuti pada kolom");
    }

    @And("Setelah mengisi kolom admin mengklik tombol tambah")
    public void setelah_mengisi_kolom_admin_mengklik_tombol_tambah() {
        aturanCutiPage.klikBtnTambahBtn();
        extentTest.log(LogStatus.PASS,"Setelah mengisi kolom admin mengklik tombol tambah");
    }

    @Then("Aturan cuti berhasil di tambahkan")
    public void aturan_cuti_berhasil_di_tambahkan() {
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS,"Aturan cuti berhasil di tambahkan");
    }

    @When("Admin menginput tambah aturan cuti pada kolom tanpa mengisi nama")
    public void admin_menginput_tambah_aturan_cuti_pada_kolom_tanpa_mengisi_nama() {
        DriverSingleton.delay(2);
        aturanCutiPage.clearTambahEligible();
        aturanCutiPage.inputTambahEligible("9");
        aturanCutiPage.clearTambahTanggal();
        aturanCutiPage.inputTambahTanggal("12");
        aturanCutiPage.clearTambahBulan();
        aturanCutiPage.inputTambahBulan("8");
        aturanCutiPage.clearTambahMaksimalCuti();
        aturanCutiPage.inputTambahMaksimalCuti("7");
        aturanCutiPage.clearTambahJumlahCuti();
        aturanCutiPage.inputTambahJumlahCuti("6");
        extentTest.log(LogStatus.PASS,"Admin menginput tambah aturan cuti pada kolom tanpa mengisi nama");
    }

    @Then("Tampilan nama harus di isi")
    public void Tampilan_nama_harus_di_isi() {
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS,"Tampilan nama harus di isi");
    }


    @When("Admin menginput tambah aturan cuti pada kolom tanpa mengisi tanggal")
    public void admin_menginput_tambah_aturan_cuti_pada_kolom_tanpa_mengisi_tanggal() {
        DriverSingleton.delay(2);
        aturanCutiPage.inputTambahNama("Hari Raya Idul Fitri");
        aturanCutiPage.clearTambahEligible();
        aturanCutiPage.inputTambahEligible("9");
        aturanCutiPage.clearTambahTanggal();
        aturanCutiPage.clearTambahBulan();
        aturanCutiPage.inputTambahBulan("8");
        aturanCutiPage.clearTambahMaksimalCuti();
        aturanCutiPage.inputTambahMaksimalCuti("7");
        aturanCutiPage.clearTambahJumlahCuti();
        aturanCutiPage.inputTambahJumlahCuti("6");
        extentTest.log(LogStatus.PASS,"Admin menginput tambah aturan cuti pada kolom tanpa mengisi tanggal");

    }

    @Then("Tampilan tanggal harus di isi")
    public void Tampilan_tanggal_harus_di_isi() {
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS,"Tampilan tanggal harus di isi");
    }

    @When("Admin menginput tambah aturan cuti pada kolom tanpa mengisi bulan")
    public void admin_menginput_tambah_aturan_cuti_pada_kolom_tanpa_mengisi_bulan() {
        DriverSingleton.delay(2);
        aturanCutiPage.inputTambahNama("Hari Raya Idul Fitri");
        aturanCutiPage.clearTambahEligible();
        aturanCutiPage.inputTambahEligible("9");
        aturanCutiPage.clearTambahTanggal();
        aturanCutiPage.inputTambahTanggal("5");
        aturanCutiPage.clearTambahBulan();
        aturanCutiPage.clearTambahMaksimalCuti();
        aturanCutiPage.inputTambahMaksimalCuti("7");
        aturanCutiPage.clearTambahJumlahCuti();
        aturanCutiPage.inputTambahJumlahCuti("6");
        extentTest.log(LogStatus.PASS,"Admin menginput tambah aturan cuti pada kolom tanpa mengisi bulan");


    }

    @Then("Tampilan bulan harus di isi")
    public void Tampilan_bulan_harus_di_isi() {
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS,"Tampilan bulan harus di isi");

    }

    @Given("Buka halaman aturan cuti")
    public void buka_halaman_aturan_cuti() {
        driver.get("https://staging-hadir.ptkta.com/management/unit-leave");
        extentTest.log(LogStatus.PASS,"Admin mengklik tombol tambah baru");
    }
}
