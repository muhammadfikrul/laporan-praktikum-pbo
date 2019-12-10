/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author muham
 */
public class TestRunnerMessageProcessor1941723005Fikrul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1941723005Fikrul.class);
        showMessageResultFikrul(mResult, MessageProcessorTest1941723005Fikrul.class.getSimpleName());
    }

    private static void showMessageResultFikrul(Result mResult, String className) {
        if (mResult.wasSuccessful()) {
            System.out.format("The Rsult Test from : %s\n", className, mResult.wasSuccessful());
        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
