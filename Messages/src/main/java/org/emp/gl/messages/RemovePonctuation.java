package org.emp.gl.messages;

public class RemovePonctuation extends MessageDecorator{

    public RemovePonctuation(IMessage message) {
        super(message);
        //TODO Auto-generated constructor stub

        this.setMessage(message.getMessage());
        
    }


    @Override
    public
    void setMessage(String message){
        messageInstance.setMessage(message.replaceAll("\\p{Punct}", ""));
    }




}