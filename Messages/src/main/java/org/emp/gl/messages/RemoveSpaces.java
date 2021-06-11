package org.emp.gl.messages;

public class RemoveSpaces extends MessageDecorator {

    public RemoveSpaces(IMessage message) {
        super(message);
        //TODO Auto-generated constructor stub
        this.setMessage(message.getMessage());

    }

    @Override
    public void setMessage(String message) {
        messageInstance.setMessage(message.replaceAll("\\s", ""));
    }

}
