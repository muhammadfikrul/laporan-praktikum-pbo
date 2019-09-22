package com.mycompany.muhammad.relasiclass.percobaan2;

/**
 *
 * @author muham
 */
public class Pelanggan1941723005Fikrul {
    private String nama;
    private Mobil1941723005Fikrul mobil;
    private Sopir1941723005Fikrul sopir;
    private int hari;

    public Pelanggan1941723005Fikrul() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mobil1941723005Fikrul getMobil() {
        return mobil;
    }

    public void setMobil(Mobil1941723005Fikrul mobil) {
        this.mobil = mobil;
    }

    public Sopir1941723005Fikrul getSopir() {
        return sopir;
    }

    public void setSopir(Sopir1941723005Fikrul sopir) {
        this.sopir = sopir;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    
    public int hitungBiayaTotal() { 
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari); 
    } 
}
