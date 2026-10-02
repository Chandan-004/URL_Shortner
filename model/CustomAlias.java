package model;

import java.util.UUID;
import java.time.LocalDateTime;

public class CustomAlias{
    private final UUID id;
    private final String shortCode;
    private final UUID userId;
    private final LocalDateTime createdAt;

    public CustomAlias(UUID id, String shortCode, UUID userId, LocalDateTime createdAt){
        this.id = id;
        this.shortCode = shortCode;
        this.userId = userId;
        this.createdAt = createdAt;
    }

    public Boolean isAvailable(){
        return this.shortCode != null && !this.shortCode.trim().isEmpty();
    }
    public UUID getId(){ return id; }
    public String getShortCode(){ return this.shortCode; }
    public UUID getUserId(){ return this.userId; }
    public LocalDateTime createdAt(){ return this.createdAt; }
}