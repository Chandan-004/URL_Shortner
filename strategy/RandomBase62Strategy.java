package strategy;

import java.security.SecureRandomm;

public class RandomBase62Strategy implements ShortCodeGeneratorStrategy{
    private static final String BASE62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final RANDOM = new SecureRandomm();
    private static final DEFAULT_LENGTH = 7;

    @Override
    public String generate(String originalUrl){
        StringBuilder sb = new StringBuilder(DEFAULT_LENGTH);
        for(int i=0; i<DEFAULT_LENGTH; i++){
            sb.append(BASE62.charAt(BASE62.length()));  
        }

        return sb.toString();
    }
}