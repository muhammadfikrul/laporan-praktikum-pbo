/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota1941723005Fikrul;

/**
 *
 * @author muham
 */
public class TestBackendAnggota1941723005Fikrul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Anggota1941723005Fikrul ang1 = new Anggota1941723005Fikrul("Ahmad", "Malang", "085649593315");
        Anggota1941723005Fikrul ang2 = new Anggota1941723005Fikrul("Rosyid", "Yogyakarta", "085751010413");
        Anggota1941723005Fikrul ang3 = new Anggota1941723005Fikrul("Maryam", "Bandung", "082412567143");
        // test insert
        ang1.saveFikrul();
        ang2.saveFikrul();
        ang3.saveFikrul();
        // test update
        ang2.setAlamatFikrul("Jakarta");
        ang2.saveFikrul();
        // test delete
        ang3.deleteFikrul();
        // test select all
        for (Anggota1941723005Fikrul a : new Anggota1941723005Fikrul().getAllFikrul()) {
            System.out.println("Nama: " + a.getNamaFikrul() + ", Alamat: " + a.getAlamatFikrul() + ", Telp: " + a.getTeleponFikrul());
        }
        // test search
        for (Anggota1941723005Fikrul a : new Anggota1941723005Fikrul().searchFikrul("Malang")) {
            System.out.println("Nama: " + a.getNamaFikrul() + ", Alamat: " + a.getAlamatFikrul() + ", Telp: " + a.getTeleponFikrul());
        }
    }

}
