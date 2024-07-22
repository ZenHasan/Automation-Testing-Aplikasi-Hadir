Feature: Koreksi Laporan

  Scenario: Verifikasi tampilan halaman koreksi
    Given Admin telah login dan navigasi ke halaman laporan Koreksi
    When Admin verifikasi tampilan data koreksi

  Scenario: Verifikasi mencari data melalui tanggal
    Given Admin menginput tanggal mulai dan tanggal akhir
    And Admin mengklik tombol cari
    Then Tampilan data koreksi berhasil di muat

  Scenario: Verifikasi mencari data melalui nama
    Given Admin menginput nama yang akan di cari
    And Admin mengklik tombol cari
    Then Tampilan data koreksi berhasil di muat

  Scenario: Verifikasi aprove data
    Given Admin ke halaman selanjutnya
    And Admin mengapprove data
    Then Tampilan data di approve

  Scenario: Verifikasi reject data
    Given Admin mengreject data
    And Admin menginput asalan
    Then Tampilan data di reject
