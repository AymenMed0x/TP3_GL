package org.emp.gl.messages;

public class MessageDecorator implements IMessage{

    public IMessage messageInstance ;


    MessageDecorator(IMessage messageinstence ){
        this.messageInstance=messageinstence;
    }

    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return messageInstance.getTitle();
    }

    @Override
    public String getSender() {
        // TODO Auto-generated method stub
        return messageInstance.getSender();
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return messageInstance.getMessage();
    }

    @Override
    public void setTitle(String title) {
        // TODO Auto-generated method stub
        messageInstance.setTitle(title);
        
    }

    @Override
    public void setSender(String sender) {
        // TODO Auto-generated method stub
         messageInstance.setSender(sender);
        
    }

    @Override
    public void setMessage(String message) {
         messageInstance.setMessage(message);
        
    }
@Override
public String toString() {
    // TODO Auto-generated method stub
    return messageInstance.toString();
}    
}
