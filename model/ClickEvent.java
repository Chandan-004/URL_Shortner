package model;

import java.util.*;
import java.time.LocalDateTime;

public class ClickEvent{
    private final UUID id;
    private final String shortCode;
    private final LocalDateTime timestamp;
    private final String device;
    private final String location;

    public ClickEvent(UUID id, String shortCode, LocalDateTime timestamp, String device, String location){
        this.id = id;
        this.shortCode = shortCode;
        this.timestamp = timestamp;
        this.device = device;
        this.location = location;
    }

    public Map<String, Object> getDetails(){
        Map<String, Object> details = new HashMap<>();
        details.put("id", id);
        details.put("shortCode", shortCode);
        details.put("timestamp", timestamp);
        details.put("device", device);
        details.put("location", location);

        return details;
    }
    public UUID getId(){return this.id;}
    public String getShortCode(){return this.shortCode;}
    public LocalDateTime getTimestamp(){return this.timestamp;}
    public String getDevice(){return this.device;}
    public String getLocation(){return this.location;}
}