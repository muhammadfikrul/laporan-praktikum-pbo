/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.DBHelper1941723005Fikrul;
import backend.Buku1941723005Fikrul;
import backend.Kategori1941723005Fikrul;

/**
 *
 * @author muham
 */
public class TestBackendBuku1941723005Fikrul {

    public static void main(String[] args) {
        Kategori1941723005Fikrul novel = new Kategori1941723005Fikrul().getByIdFikrul(1);
        Kategori1941723005Fikrul referensi = new Kategori1941723005Fikrul().getByIdFikrul(2);
        Buku1941723005Fikrul buku1 = new Buku1941723005Fikrul(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1941723005Fikrul buku2 = new Buku1941723005Fikrul(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1941723005Fikrul buku3 = new Buku1941723005Fikrul(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        // test insert
        buku1.saveFikrul();
        buku2.saveFikrul();
        // test update
        buku2.setJudulFikrul("Aljabar Linier");
        buku2.saveFikrul();
        // test delete
        buku3.deleteFikrul();
        // test select all
        for (Buku1941723005Fikrul b : new Buku1941723005Fikrul().getAllFikrul()) {
            System.out.println("Kategori: " + b.getKategoriFikrul().getNamaFikrul() + ", Judul: " + b.getJudulFikrul());
        }
        // test search
        for (Buku1941723005Fikrul b : new Buku1941723005Fikrul().searchFikrul("timun")) {
            System.out.println("Kategori: " + b.getKategoriFikrul().getNamaFikrul() + ", Judul: " + b.getJudulFikrul());
        }
    }

}
