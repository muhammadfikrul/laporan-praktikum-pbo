package com.mycompany.jobsheet6.percobaan5;

public class StaffHarian1941723005 extends Staff1941723005 {

    public int jmlJamKerja;

    public StaffHarian1941723005() {

    }

    public StaffHarian1941723005(int jmlJamKerja, int lembur, int potongan, String nama, String alamat, int umur, String jk, int gaji) {
        super(lembur, potongan, nama, alamat, umur, jk, gaji);
        this.jmlJamKerja = jmlJamKerja;
    }

    public void tampilDataStaffHarianFikrul() {
        System.out.println("===============Data Staff Harian===============");
        super.tampilDataStaffFikrul();
        System.out.println("Jumlah Jam Kerja = " + jmlJamKerja);
        System.out.println("Gaji Bersih = " + (gaji * jmlJamKerja + lembur - potongan));

    }

}
