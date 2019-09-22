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
    
    public Mobil1941723005Fikrul(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    void setMerk(String merk) {
        this.merk = merk;
    }

    public int hitungBiayaMobil(int hari) { 
        return biaya * hari; 
    } 
}