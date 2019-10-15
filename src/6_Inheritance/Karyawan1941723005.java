package com.mycompany.jobsheet6.percobaan5;

public class Karyawan1941723005 {

    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan1941723005() {
    }

    public Karyawan1941723005(String nama, String alamat, int umur, String jk, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.jk = jk;
        this.gaji = gaji;
    }

    public void tampilDataKaryawanFikrul() {
        System.out.println("Nama = " + nama);
        System.out.println("Alamat = " + alamat);
        System.out.println("Umur = " + umur);
        System.out.println("Jenis Kelamin = " + jk);
        System.out.println("Gaji = " + gaji);
    }

}
