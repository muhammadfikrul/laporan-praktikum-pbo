package com.mycompany.jobsheet6.percobaan5;

public class Staff1941723005 extends Karyawan1941723005 {

    public int lembur, potongan;

    public Staff1941723005() {
    }

    public Staff1941723005(int lembur, int potongan, String nama, String alamat, int umur, String jk, int gaji) {
        super(nama, alamat, umur, jk, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    public void tampilDataStaffFikrul() {
        super.tampilDataKaryawanFikrul();
        System.out.println("Lembur = " + lembur);
        System.out.println("Potongan = " + potongan);
        System.out.println("Total Gaji = " + (gaji + lembur - potongan));
    }
}
