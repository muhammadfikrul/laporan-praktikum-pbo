package com.mycompany.jobsheet6.percobaan5;

public class Inheritance11941723005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager1941723005 M = new Manager1941723005();
        M.nama = "Vivin";
        M.alamat = "Jl. Vionila";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilDataManagerFikrul();

        Staff1941723005 S = new Staff1941723005();
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.tampilDataStaffFikrul();
    }

}
