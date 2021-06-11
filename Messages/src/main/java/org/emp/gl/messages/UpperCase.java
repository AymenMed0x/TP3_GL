package org.emp.gl.messages;

public class UpperCase extends MessageDecorator{

    public UpperCase(IMessage message) {
        super(message);
        //TODO Auto-generated constructor stub
        this.setMessage(message.getMessage());
    }

    
    @Override
    public
    void setMessage(String message){
        
        messageInstance.setMessage(message.toUpperCase());
    }
    


    



    
}
