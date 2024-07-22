Feature: Perjalanan Dinas

  Scenario: Verifikasi tampilan halaman perjalanan dinas
    Given Admin telah login dan navigasi ke halaman laporan perjalanan dinas
    When Admin verifikasi tampilan data perjalanan dinas

  Scenario: Verifikasi mencari data melalui tanggal pada halaman perjalanan dinas
    Given  Admin menginput tanggal mulai dan tanggal akhir pada perjalanan dinas
    And Admin mengklik tombol cari pada halaman perjalanan dinas
    Then Tampilan data perjalanan dinas berhasil di muat

  Scenario: Verifikasi mencari data melalui nama
    Given Admin menginput nama yang akan di cari pada perjalanan dinas
    And Admin mengklik tombol cari pada halaman perjalanan dinas
    Then Tampilan data perjalanan dinas berhasil di muat

  Scenario: Verifikasi ke halaman selanjutnya
    Given Halaman selanjutnya dan mengaprove user
    When Admin mereject user
    And Admin kembali ke halaman sebelumnya
    And Admin melihat dokumen yang di upload