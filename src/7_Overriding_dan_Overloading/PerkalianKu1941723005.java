/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jobsheet7.latihan;

/**
 *
 * @author muham
 */
public class PerkalianKu1941723005 {

    void perkalianFikrul(int a, int b) {
        System.out.println(a * b);
    }

    void perkalianFikrul(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String args[]) {

        PerkalianKu1941723005 objek = new PerkalianKu1941723005();

        objek.perkalianFikrul(24, 25);
        objek.perkalianFikrul(34, 23, 56);
    }
}
