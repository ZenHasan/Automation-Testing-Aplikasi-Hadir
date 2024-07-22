Feature: Company Management

  Scenario: Verifikasi tampilan data perusahaan
    Given Admin telah login dan navigasi ke halaman perusahaan
    When Admin verifikasi tampilan data perusahaan
    When Admin klik tombol edit perusahaan
    And Admin mengisi nama perusahaan dan industri
    And Admin menyimpan perubahan perusahaan

  Scenario: Verifikasi tampilan edit data perusahaan dengan kolom perusahaan kosong
    When Admin klik tombol edit perusahaan
    And Admin mengisi nama perusahaan kosong dan mengisi industri
    And Admin menyimpan perubahan perusahaan

  Scenario: Verifikasi tampilan edit data perusahaan dengan kolom nama perusahaan kosong dan kolom industri kosong
    And Admin mengisi nama perusahaan kosong dan industri kosong
    And Admin menyimpan perubahan perusahaan
