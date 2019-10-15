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
public class Segitiga1941723005 {

    private int segitiga;

    public int totalSudut(int sudutA) {
        int sudut = 180 - (sudutA);
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        int sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        int sudut = sisiA + sisiB + sisiC;
        return sudut;
    }

    public double keliling(int sisiA, int sisiB) {
        double keliling = Math.sqrt(Math.pow(sisiA, sisiA) + Math.pow(sisiB, sisiB));
        return keliling;
    }
}
