package com.mycompany.jobsheet6.percobaan5;

public class StaffTetap1941723005 extends Staff1941723005 {

    public String golongan;
    public int asuransi;

    public StaffTetap1941723005() {
    }

    public StaffTetap1941723005(String golongan, int asuransi) {
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    public StaffTetap1941723005(String golongan, int asuransi, int lembur, int potongan, String nama, String alamat, int umur, String jk, int gaji) {
        super(lembur, potongan, nama, alamat, umur, jk, gaji);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    public void tampilStaffTetapFikrul() {
        System.out.println("--------------Data Staff Tetap---------------");
        super.tampilDataStaffFikrul();
        System.out.println("Golongan = " + golongan);
        System.out.println("Jumlah Asuransi = " + asuransi);
        System.out.println("Gaji Bersih = " + (gaji + lembur - potongan - asuransi));
    }
}
