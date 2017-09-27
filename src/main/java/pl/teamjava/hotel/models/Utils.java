package pl.teamjava.hotel.models;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {

    public static String shaHash(String message){
        try {
            MessageDigest sha2 = MessageDigest.getInstance("SHA-256");

            byte[] bytesOfMessage = message.getBytes();
            byte[] bytesOfCryptoMessage = sha2.digest(bytesOfMessage);

            StringBuilder stringBuilder = new StringBuilder();

            for(int i = 0; i < bytesOfCryptoMessage.length; i++){
                stringBuilder.append(Integer.toHexString(0xFF & bytesOfCryptoMessage[i]));
            }

            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
