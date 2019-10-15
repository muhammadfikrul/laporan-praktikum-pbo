package com.mycompany.jobsheet6.percobaan5;

public class Manager1941723005 extends Karyawan1941723005 {

    public int tunjangan;

    public Manager1941723005() {
    }

    public void tampilDataManagerFikrul() {
        super.tampilDataKaryawanFikrul();
        System.out.println("Tunjanagan = " + tunjangan);
        System.out.println("Total Gaji = " + (super.gaji + tunjangan));
    }
}
