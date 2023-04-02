import java.util.UUID;

public class UUIDGenerator {
    String UUIDs;

    public String getUUIDs() {
        return UUIDs;
    }

    public UUIDGenerator() {
        UUID u = UUID.randomUUID();
    UUIDs=u.toString();
    }
}