/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author muham
 */
public class MessageProcessorTest1941723005Fikrul {
    MessageProcessor1941723005Fikrul mProcessor;
    public MessageProcessorTest1941723005Fikrul(){
        mProcessor = new MessageProcessor1941723005Fikrul();
        mProcessor.setSenderFikrul("Ronaldo");
        mProcessor.setRecipientFikrul("Rafael");
        mProcessor.setMessageFikrul("Whats up bro?");
    }
    @Test
    public void testShowMassageFikrul(){
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormatFikrul());
    }
}
