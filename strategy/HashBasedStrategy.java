package strategy;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashBasedStrategy implements ShortCodeGeneratorStrategy{
    @Override
    public String generate(String originalUrl){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest((originalUrl + System.nanoTime()).getBytes());
            StringBuilder hexString = new StringBuilder();

            for(int i=0; i<4; i++){
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch(NoSuchAlgorithmException e){
            throw new RuntimeException("Hash algorithm not available ", e);
        }
    }
}