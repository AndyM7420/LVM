import java.util.ArrayList;

public class volumeGroup extends Volume{
    PhysicalVolume one;
    int size;
    public volumeGroup(String name,PhysicalVolume one) {
        super(name);
        this.one=one;
        size+=one.getSize();
    }

    public PhysicalVolume getOne() {
        return one;
    }

    public void setOne(PhysicalVolume one) {
        this.one = one;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }
}

