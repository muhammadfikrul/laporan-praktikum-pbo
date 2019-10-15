/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jobsheet7.percobaan1;

/**
 *
 * @author muham
 */
public class Manager1941723005 extends Karyawan1941723005 {

    private double tunjangan;
    private String bagian;
    private Staff1941723005 st[];

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public Staff1941723005[] getSt() {
        return st;
    }

    public void setStaff(Staff1941723005[] st) {
        this.st = st;
    }

    public void viewStaffFikrul() {
        int i;
        System.out.println("--------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfoFikrul();
        }
        System.out.println("--------------------");
    }

    public void lihatInfoFikrul() {
        System.out.println("Manager :" + this.getBagian());
        System.out.println("NIP :" + this.getNip());
        System.out.println("Nama :" + this.getNama());
        System.out.println("Golongan :" + this.getGolongan());
        System.out.printf("Tunjangan :%.0f\n", this.getTunjangan());
        System.out.printf("Gaji :%.0f\n", this.getGaji());
        System.out.println("Bagian :" + this.getBagian());
    }

    @Override
    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}
