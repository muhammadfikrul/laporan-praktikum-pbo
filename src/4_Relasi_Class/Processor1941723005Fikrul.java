package com.mycompany.muhammad.relasiclass.percobaan1;

/**
 *
 * @author muham
 */
public class Processor1941723005Fikrul {

    private String merk;
    private double cache;

    public Processor1941723005Fikrul() {
    }

    public Processor1941723005Fikrul(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public String getMerk() {
        return merk;
    }

    public double getCache() {
        return cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %2f\n", cache);
    }
}
