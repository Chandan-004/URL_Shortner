package storage;

import java.model.*;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Database{
    private static volatile Database instance;

    private final Map<UUID, User> users = new ConcurrentHashMap<>();
    private final Map<String, ShortURL> shortUrls = new ConcurrentHashMap<>();
    private final Map<String, URLMapping> urlMappings = new ConcurrentHashMap<>();
    private final Map<String, CustomAlias> customAliases = new ConcurrentHashMap<>();

    private Database() {}

    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }

    public Map<UUID, User> getUsers() { return users; }
    public Map<String, ShortURL> getShortUrls() { return shortUrls; }
    public Map<String, URLMapping> getUrlMappings() { return urlMappings; }
    public Map<String, CustomAlias> getCustomAliases() { return customAliases; }
}