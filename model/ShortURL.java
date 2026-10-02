package model

import java.time.LocalDateTime;
import java.util.UUID;

public class ShortURL{
    private final UUID id;
    private final String shortCode;
    private final String originalUrl;
    private final LocalDateTime createdAt;
    private final LocalDateTime expiresAt;
    private String status;

    public ShortURL(UUID id, String shortCode, String originalUrl, LocalDateTime createdAt, LocalDateTime expiresAt, String status){
        this.id = id;
        this.shortCode = shortCode;
        this.originalUrl = originalUrl;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
        this.status = status;
    }

    public Boolean isExpired(){
        return LocalDateTime.now().isAfter(this.expiresAt) || "Expired".equalsIgnoreCase(this.status);
    }

    public String getOriginalUrl(){
        return this.originalUrl;
    }
    public UUID getid(){
        return this.id;
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
    public String getStatus(){
        return this.status;
    }
    public String setStatus(String status){
        this.status = status;
    }
}