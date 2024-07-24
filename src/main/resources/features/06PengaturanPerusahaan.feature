Feature: Pengaturan Perusahaan

  Scenario: Verifikasi tampilan pengaturan perusahaan
    Given Admin telah login dan navigasi ke halaman perusahaan pengaturan perusahaan
    When Admin verifikasi tampilan data pengaturan pengaturan perusahaan
    Then Semua data pengaturan perusahaan ditampilkan di halaman

  Scenario: Validasi tampilan edit data pengaturan perusahaan
    Given Admin klik titik tiga
    Then Validasi tombol edit
    Then Validasi tombol hapus