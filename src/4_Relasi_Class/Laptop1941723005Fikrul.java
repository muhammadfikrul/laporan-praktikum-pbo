package com.mycompany.muhammad.relasiclass.percobaan1;

/**
 *
 * @author muham
 */
public class Laptop1941723005Fikrul {
    private String merk;
    private Processor1941723005Fikrul proc;

    public Laptop1941723005Fikrul() {
    }
    
    public Laptop1941723005Fikrul(String merk, Processor1941723005Fikrul proc) {
	this.merk = merk;
	this.proc = proc;
    }

    public void info() {
	System.out.println("Merk Laptop = " + merk);
	proc.info();
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void setProc(Processor1941723005Fikrul proc) {
        this.proc = proc;
    }

    public String getMerk() {
        return merk;
    }

    public Processor1941723005Fikrul getProc() {
        return proc;
    }
}