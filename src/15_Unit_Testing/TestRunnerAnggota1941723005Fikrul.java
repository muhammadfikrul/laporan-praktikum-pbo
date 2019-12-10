/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.runner.*;
import org.junit.runner.notification.*;
import unittest.database.AnggotaTest1941723005Fikrul;

/**
 *
 * @author muham
 */
public class TestRunnerAnggota1941723005Fikrul {

    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(AnggotaTest1941723005Fikrul.class);
        showMessageResultFikrul(mResult, AnggotaTest1941723005Fikrul.class.getSimpleName());
    }

    private static void showMessageResultFikrul(Result mResult, String className) {
        if (mResult.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", className, mResult.wasSuccessful());
        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
