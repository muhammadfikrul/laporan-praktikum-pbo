/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

/**
 *
 * @author muham
 */
public class TestBackend1941723005Fikrul {

    public static void main(String[] args) {
        Kategori1941723005Fikrul kat1 = new Kategori1941723005Fikrul("Novel", "Koleksi buku novel");
        Kategori1941723005Fikrul kat2 = new Kategori1941723005Fikrul("Referensi", "Buku referensi ilmiah");
        Kategori1941723005Fikrul kat3 = new Kategori1941723005Fikrul("Komik", "Komik anak-anak");
        // test insert
        kat1.saveFikrul();
        kat2.saveFikrul();
        kat3.saveFikrul();
        // test update
        kat2.setKeteranganFikrul("Koleksi buku referensi ilmiah");
        kat2.saveFikrul();
        // test delete
        kat3.deleteFikrul();
        // test select all
        for (Kategori1941723005Fikrul k : new Kategori1941723005Fikrul().getAllFikrul()) {
            System.out.println("Nama: " + k.getNamaFikrul() + ", Ket: " + k.getKeteranganFikrul());
        }
        // test search
        for (Kategori1941723005Fikrul k : new Kategori1941723005Fikrul().searchFikrul("ilmiah")) {
            System.out.println("Nama: " + k.getNamaFikrul() + ", Ket: " + k.getKeteranganFikrul());
        }
    }
}
