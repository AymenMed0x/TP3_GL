package org.emp.gl.messages;

public class HashSimple extends MessageDecorator {

    public HashSimple(IMessage message) {
        super(message);
        this.setMessage(message.getMessage());

    }

    @Override
    public void setMessage(String message) {
        messageInstance.setMessage(message + "  " + message.hashCode());
    }

}
