/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.muhammad.relasiclass.percobaan1;

/**
 *
 * @author muham
 */
public class MainPercobaan1 {

    public static void main(String args[]) {

        Processor1941723005Fikrul p = new Processor1941723005Fikrul("Intel i5", 3);
        Laptop1941723005Fikrul l = new Laptop1941723005Fikrul("Thinkpad", p);
        l.info();

        Processor1941723005Fikrul pl = new Processor1941723005Fikrul();
        pl.setMerk("Intel i5");
        pl.setCache(4);

        Laptop1941723005Fikrul l1 = new Laptop1941723005Fikrul();
        l1.setMerk("Thinkpad");
        l1.setProc(pl);
        l1.info();

    }
}
