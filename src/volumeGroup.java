import java.util.ArrayList;

public class volumeGroup extends Volume{
    PhysicalVolume one;
    public volumeGroup(String name,PhysicalVolume one) {
        super(name);
        this.one=one;
    }

    public PhysicalVolume getOne() {
        return one;
    }
}

