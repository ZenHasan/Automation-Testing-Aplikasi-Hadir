package com.juaracoding.utils;

public enum ScenarioTests {

    T1("Verifikasi tampilan data perusahaan"),
    T2("Verifikasi tampilan edit data perusahaan dengan kolom perusahaan kosong"),
    T3("Verifikasi tampilan edit data perusahaan dengan kolom nama perusahaan kosong dan kolom industri kosong"),
    T4("Verifikasi tampilan halaman koreksi"),
    T5("Verifikasi mencari data melalui tanggal"),
    T6("Verifikasi mencari data melalui nama"),
    T7("Verifikasi aprove data"),
    T8("Verifikasi reject data");

    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName(){
        return scenarioTestName;
    }
}
