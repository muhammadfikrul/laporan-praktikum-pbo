/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.muhammad.relasiclass.percobaan2;

/**
 *
 * @author muham
 */
public class MainPercobaan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil1941723005Fikrul m = new Mobil1941723005Fikrul();
        m.setBiaya(350000);
        m.setMerk("Toyota");
        m.setNama("Avanza");

        Sopir1941723005Fikrul s = new Sopir1941723005Fikrul();
        s.setNama("John Doe");
        s.setBiaya(200000);

        Pelanggan1941723005Fikrul p = new Pelanggan1941723005Fikrul();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);

        System.out.println("Biaya Total = " + p.hitungBiayaTotal());

        System.out.println(p.getMobil().getMerk());
        System.out.println(p.getMobil().getNama());
    }

}
