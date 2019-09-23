package com.mycompany.relasiclass.percobaan4;

/**
 *
 * @author muham
 */
public class MainPercobaan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Penumpang1941723005Fikrul p = new Penumpang1941723005Fikrul("12345", "Mr. Krab");
        Gerbong1941723005Fikrul gerbong = new Gerbong1941723005Fikrul("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
        
        Penumpang1941723005Fikrul p1 = new Penumpang1941723005Fikrul("67890", "Budi");
        Gerbong1941723005Fikrul gerbong1 = new Gerbong1941723005Fikrul("A", 10);
        gerbong1.setPenumpang(p1, 1);
        System.out.println(gerbong.info());
    }

}
