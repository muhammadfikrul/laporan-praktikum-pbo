package com.mycompany.relasiclass.percobaan4;

/**
 *
 * @author muham
 */
public class Gerbong1941723005Fikrul {

    private String kode;
    private Kursi1941723005Fikrul[] arrayKursi;

    public Gerbong1941723005Fikrul(String mKode, int jumlah) {
        this.kode = mKode;
        this.arrayKursi = new Kursi1941723005Fikrul[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi1941723005Fikrul(String.valueOf(i + 1));
        }
    }

    public String info() {
        String info = "";

        info += "Kode: " + kode + "\n";
        for (Kursi1941723005Fikrul kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
    
    public void setPenumpang(Penumpang1941723005Fikrul penumpang, int nomor) { 
        this.arrayKursi[nomor - 1].setPenumpang(penumpang); 
    } 
}
