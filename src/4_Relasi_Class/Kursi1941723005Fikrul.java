package com.mycompany.relasiclass.percobaan4;

/**
 *
 * @author muham
 */
public class Kursi1941723005Fikrul {

    public String nomor;
    public Penumpang1941723005Fikrul penumpang;

    public Kursi1941723005Fikrul() {
    }

    public Kursi1941723005Fikrul(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public Penumpang1941723005Fikrul getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang1941723005Fikrul penumpang) {
        this.penumpang = penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
