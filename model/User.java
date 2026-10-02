package model;

import java.time.LocalDateTime;
import java.util.*;

public class User{
    private final UUID userId;
    private final String name;
    private final String email;
    private final LocalDateTime createdAt;
    private String status;
    private final List<ShortURL> shortUrls;

    public User(UUID userId, String name, String email, LocalDateTime createdAt, String status){
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
        this.status = status;
        this.shortUrls = new ArrayList<>();
    }

    public ShortURL createShortUrl(String originalUrl, String shortCode, LocalDateTime expiresAt){
        ShortURL url = new ShortURL(
            UUID.randomUUID(),
            shortCode,
            originalUrl,
            LocalDateTime.now(),
            expiresAt,
            "ACTIVE"
        );

        this.shortUrls.add(url);
        return url;
    }

    public List<ShortURL> getUrls(){
        return Collections.unmodifiableList(shortUrls);
    }
    public UUID getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public String getStatus() { return status; }    

}