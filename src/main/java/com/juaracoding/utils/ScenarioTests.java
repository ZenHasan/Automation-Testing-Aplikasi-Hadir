package com.juaracoding.utils;

public enum ScenarioTests {
    //page company
    T1("Verifikasi tampilan data perusahaan"),
    T2("Verifikasi tampilan edit data perusahaan dengan kolom perusahaan kosong"),
    T3("Verifikasi tampilan edit data perusahaan dengan kolom nama perusahaan kosong dan kolom industri kosong"),
    //page Koreksi
    T4("Verifikasi tampilan halaman koreksi"),
    T5("Verifikasi mencari data melalui tanggal"),
    T6("Verifikasi mencari data melalui nama"),
    T7("Verifikasi aprove data"),
    T8("Verifikasi reject data"),
    //page Perjalanan Dinas
    T9("Verifikasi tampilan halaman perjalanan dinas"),
    T10("Verifikasi mencari data melalui tanggal pada halaman perjalanan dinas"),
    T11("Verifikasi mencari data melalui nama"),
    T12("Verifikasi ke halaman data selanjutnya dan sebelumnya"),
    //page DayOff
    T13("Verifikasi tampilan halaman Day Off"),
    //page Aturan Cuti
    T14("Verifikasi tampilan halaman aturan cuti"),
    T15("Verifikasi mencari data aturan cuti melalui nama"),
    T16("Verifikasi melihat user aturan cuti"),
    T17("Verifikasi menambahkan detail aturan cuti"),
    T18("Verifikasi mengedit user aturan cuti"),
    T19("Verikasi membalikan nama lagi"),
    T20("Verifikasi menghapus user aturan cuti"),
    T21("Verifikasi menambah aturan cuti"),
    T22("Verikasi menambah aturan cuti tanpa mengisi nama"),
    T23("Verikasi menambah aturan cuti tanpa mengisi tanggal"),
    T24("Verikasi menambah aturan cuti tanpa mengisi bulan"),
    //page Pengaturan Perusahaan
    T25("Verifikasi tampilan pengaturan perusahaan"),
    T26("Validasi tampilan edit data pengaturan perusahaan"),
    //page Logout User
    T27("Successfull login and logout user with valid credentials");


    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName(){
        return scenarioTestName;
    }
}
