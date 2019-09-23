package com.mycompany.muhammad.relasiclass.percobaan2;

/**
 *
 * @author muham
 */
public class Mobil1941723005Fikrul {

    private String nama;
    private int biaya;
    private String merk;

    public Mobil1941723005Fikrul() {
    }

    public Mobil1941723005Fikrul(String nama, int biaya, String merk) {
        this.nama = nama;
        this.biaya = biaya;
        this.merk = merk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNama() {
        return nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public String getMerk() {
        return merk;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }

}
