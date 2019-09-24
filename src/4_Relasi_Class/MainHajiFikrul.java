/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class MainHajiFikrul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnggotaHaji a1 = new AnggotaHaji("351266112766", "Umar Mukhtar");
        TahunKeberangkatan a = new TahunKeberangkatan("2008", "plus");
        BiayaHaji da = new BiayaHaji("50000000");
        System.out.println(a.info());
    }
    
}
