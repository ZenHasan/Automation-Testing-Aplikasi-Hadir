Feature: Aturan Cuti

  Scenario: Verifikasi tampilan halaman aturan cuti
    Given Admin telah login dan navigasi ke halaman management aturan cuti
    When Admin verifikasi tampilan data aturan cuti
    Then Semua data aturan cuti ditampilkan di halaman

  Scenario: Verifikasi mencari data aturan cuti melalui nama
    Given Admin menginput nama yang akan di cari pada aturan cuti
    When Admin mengklik tombol cari pada halaman aturan cuti
    Then Tampilan data nama user aturan cuti berhasil di muat

  Scenario:Verifikasi melihat user aturan cuti
    Given Admin memilih nama pada table aturan cuti yang akan dilihat lalu klik titik tiga
    And Admin mengklik tombol view
    Then Tampilan detail view aturan cuti

  Scenario:Verifikasi menambahkan detail aturan cuti
    Given Admin menambahkan detail aturan cuti
    And Menginput minimal bulan bekerja pada detail aturan cuti
    And Menginput total cuti pada detail aturan cuti
    Then Sukses membuat aturan cuti
    Then Tampilan detail view aturan cuti
    And Kembali ke halaman utama aturan cuti

  Scenario: Verifikasi mengedit user aturan cuti
    Given Admin memilih nama pada table aturan cuti yang akan di edit lalu klik titik tiga
    And Admin mengklik tombol edit
    And Admin mengisi kolom yang di perlukan
    And Admin mengklik tombol simpan
    Then Aturan cuti berhasil diperbarui dengan pesan sukses


  Scenario: Verifikasi menghapus user aturan cuti
    Given Admin memilih nama pada table aturan cuti yang akan dihapus lalu klik titik tiga
    And Admin mengklik tombol delete


  Scenario: Verifikasi menambah aturan cuti
    Given Admin mengklik tombol tambah baru
    When Admin menginput tambah aturan cuti pada kolom
    And Setelah mengisi kolom admin mengklik tombol tambah
    Then Aturan cuti berhasil di tambahkan

  Scenario: Verikasi menambah aturan cuti tanpa mengisi nama
    Given Buka halaman aturan cuti
    Given Admin mengklik tombol tambah baru
    When Admin menginput tambah aturan cuti pada kolom tanpa mengisi nama
    And Setelah mengisi kolom admin mengklik tombol tambah
    Then Tampilan nama harus di isi

  Scenario: Verikasi menambah aturan cuti tanpa mengisi tanggal
    Given Buka halaman aturan cuti
    Given Admin mengklik tombol tambah baru
    When Admin menginput tambah aturan cuti pada kolom tanpa mengisi tanggal
    And Setelah mengisi kolom admin mengklik tombol tambah
    Then Tampilan tanggal harus di isi

  Scenario: Verikasi menambah aturan cuti tanpa mengisi bulan
    Given Buka halaman aturan cuti
    Given Admin mengklik tombol tambah baru
    When Admin menginput tambah aturan cuti pada kolom tanpa mengisi bulan
    And Setelah mengisi kolom admin mengklik tombol tambah
    Then Tampilan bulan harus di isi




