package com.mycompany.muhammad.relasiclass.percobaan2;

/**
 *
 * @author muham
 */
public class Sopir1941723005Fikrul {
    private String nama;
    private int biaya;
    
    public Sopir1941723005Fikrul(){
    }

    public Sopir1941723005Fikrul(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getBiaya() {
        return biaya;
    }
    
    public int hitungBiayaSopir(int hari) { 
        return biaya * hari; 
    }
}