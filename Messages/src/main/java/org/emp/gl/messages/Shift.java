/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.messages;

/**
 *
 * @author BOUMEDIRI
 */
public class Shift extends MessageDecorator {
    public Shift(IMessage message, int shift) {
        super(message);
        String encryptedMessage = shiftEncryption(message.getMessage(), shift);
        this.setMessage(encryptedMessage);

    }
    
    String shiftEncryption(String msg, int shift){
    String s = "";
    int len = msg.length();
    for(int x = 0; x < len; x++){
        char c = (char)(msg.charAt(x) + shift);
        if (c > 'z')
            s += (char)(msg.charAt(x) - (26-shift));
        else
            s += (char)(msg.charAt(x) + shift);
    }
    return s;
}

    @Override
    public void setMessage(String message) {
        messageInstance.setMessage(message);
    }
    
}
