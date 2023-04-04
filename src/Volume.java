import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.UUID;


public class Volume
{

    private int size;
    private String name;
    private String UUID;
    private volumeGroup volumeGroups;


    public Volume(String name){
        this.name=name;
        UUIDGenerator u=new UUIDGenerator();
        UUID=u.getUUIDs();
    }
    public Volume(String name,int size,volumeGroup volumeGroups){
        this.size=size;
        this.name=name;
        this.volumeGroups=volumeGroups;
        UUIDGenerator u=new UUIDGenerator();
        UUID=u.getUUIDs();
    }

    public volumeGroup getVolumeGroups() {
        return volumeGroups;
    }

    public void setVolumeGroups(volumeGroup volumeGroups) {
        this.volumeGroups = volumeGroups;
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
