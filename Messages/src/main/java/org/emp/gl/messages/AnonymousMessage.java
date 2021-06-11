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
public class AnonymousMessage extends MessageDecorator {

    public AnonymousMessage(IMessage messageInstance) {
        super(messageInstance);
        this.setSender(messageInstance.getSender());
        this.setMessage(messageInstance.getMessage());
    }

    @Override
    public void setSender(String message) {
        messageInstance.setSender("Anonyme");
    }

}
