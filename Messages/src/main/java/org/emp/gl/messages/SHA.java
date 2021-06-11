package org.emp.gl.messages;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class SHA extends MessageDecorator {

    public SHA(IMessage message) throws NoSuchAlgorithmException {
        super(message);
        //TODO Auto-generated constructor stub

        String result = messageSHA(message.getMessage());
        this.setMessage(message.getMessage() + "\n Le hash avec SHA :   " + result);

    }

    public static String messageSHA(String message) {
        try {

            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] messageDigest = md.digest(message.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashSHA = no.toString(16);
            while (hashSHA.length() < 32) {
                hashSHA = "0" + hashSHA;
            }
            return hashSHA;
        } 
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void setMessage(String message) {
        messageInstance.setMessage(message);
    }

}
