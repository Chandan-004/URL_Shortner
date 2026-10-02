package model;

import java.time.LocalDateTime;

public class URLMapping{
    private final String shortCode;
    private final String originalUrl;
    private final LocalDateTime createdAt;
    private final LocalDateTime expiresAt;

    public URLMapping(String shortCode, String originalUrl, LocalDateTime createdAt, LocalDateTime expiresAt){
        this.shortCode=shortCode;
        this.originalUrl=originalUrl;
        this.createdAt=createdAt;
        this.expiresAt=expiresAt;
    }

    public String getOriginalUrl(){
        return this.originalUrl;
    }
    public String getShortCode(){
        return this.shortCode;
    }
    public LocalDateTime getCreatedAt(){
        return this.createdAt;
    }
    public LocalDateTime getExpiresAt(){
        return this.expiresAt;
    }

}