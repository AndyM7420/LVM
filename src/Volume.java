import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.UUID;


public class Volume
{

    private int size;
    private String name;
    private String UUID;


    public Volume(String name){
        this.name=name;
        UUIDGenerator u=new UUIDGenerator();
        UUID=u.getUUIDs();
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getUUID() {
        return UUID;
    }


}
