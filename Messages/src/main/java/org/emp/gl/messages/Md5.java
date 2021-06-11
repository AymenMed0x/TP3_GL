package org.emp.gl.messages;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class Md5 extends MessageDecorator {

    public Md5(IMessage message) throws NoSuchAlgorithmException {
        super(message);
        //TODO Auto-generated constructor stub

        String result = messageMD5(message.getMessage());
        this.setMessage(message.getMessage() + "\n Le hash avec MD5 :  " + result);

    }

    public static String messageMD5(String input) {
        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashMD5 = no.toString(16);
            while (hashMD5.length() < 32) {
                hashMD5 = "0" + hashMD5;
            }
            return hashMD5;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void setMessage(String message) {
        messageInstance.setMessage(message);
    }

}
