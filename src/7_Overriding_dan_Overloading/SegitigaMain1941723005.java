/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author muham
 */
public class SegitigaMain1941723005 {

    public static void main(String[] args) {
        Segitiga1941723005 sg = new Segitiga1941723005();
        sg.totalSudut(150);
        sg.totalSudut(50, 45);
        sg.keliling(5, 10, 5);
        sg.keliling(5, 5);
        System.out.println("Total sudut :" + sg.totalSudut(140) + " derajat");
        System.out.println("Total sudut :" + sg.totalSudut(90, 45) + " derajat");
        System.out.println("keliling :" + sg.keliling(7, 3, 5));
        System.out.println(" C :" + sg.keliling(10, 5));
    }
}
