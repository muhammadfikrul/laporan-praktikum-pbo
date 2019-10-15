package com.mycompany.jobsheet6.percobaan3;

public class Tabung1941723005 extends Bangun1941723005 {

    protected int t;

    public void setSuperPhiFikrul(double phi) {
        super.phi = phi;
    }

    public void setSuperRFikrul(int r) {
        super.r = r;
    }

    public void setTFikrul(int t) {
        this.t = t;
    }

    public void volumeFikrul() {
        System.out.println("Volume Tabung adalah: " + (super.phi * super.r * super.r * this.t));
    }
}
