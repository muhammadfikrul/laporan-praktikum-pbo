package com.mycompany.relasiclass.percobaan4;

/**
 *
 * @author muham
 */
public class Penumpang1941723005Fikrul {

    public String ktp;
    public String nama;

    public Penumpang1941723005Fikrul() {
    }

    public Penumpang1941723005Fikrul(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }
    
    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
