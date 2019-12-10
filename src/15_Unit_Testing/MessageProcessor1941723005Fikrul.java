/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author muham
 */
public class MessageProcessor1941723005Fikrul {

    private String sender, recipient, message;

    public String getSenderFikrul() {
        return sender;
    }

    public void setSenderFikrul(String sender) {
        this.sender = sender;
    }

    public String getRecipientFikrul() {
        return recipient;
    }

    public void setRecipientFikrul(String recipient) {
        this.recipient = recipient;
    }

    public String getMessageFikrul() {
        return message;
    }

    public void setMessageFikrul(String message) {
        this.message = message;
    }

    public String messageFormatFikrul(){
        String message = String.format("Hai %s, you have message from %s.\nThe message as follows : %s",
                this.recipient, this.sender, this.message);
        return message;
    }
    
    public void showMessageFikrul(){
        System.out.println(messageFormatFikrul());
    }
}
