/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class MainPercobaan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai1941723005Fikrul masinis = new Pegawai1941723005Fikrul("1234", "Spongebob Squarepants"); 
        Pegawai1941723005Fikrul asisten = new Pegawai1941723005Fikrul("4567", "Patrick Star");  
        KeretaApi1941723005Fikrul keretaApi = new KeretaApi1941723005Fikrul("Gaya Baru", "Bisnis", masinis, asisten); 
        System.out.println(keretaApi.info()); 
    }
    
}
