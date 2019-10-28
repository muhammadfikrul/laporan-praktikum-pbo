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
        TahunKeberangkatan t1 = new TahunKeberangkatan("2020");
        BiayaHaji b1 = new BiayaHaji("150000000");
        PaketHaji p1 = new PaketHaji("Plus");

        AnggotaHaji a1 = new AnggotaHaji("351266112766", "Umar Mukhtar", b1, p1, t1);

        System.out.println(a1.info());
    }

}
