public class PhysicalVolume extends Volume{

    private int size;
    PHardDrive s;
    public PhysicalVolume(String name,PHardDrive each) {
        super(name);
        size+=each.getSize();
        s=each;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    public PHardDrive getS() {
        return s;
    }

    public void setS(PHardDrive s) {
        this.s = s;
    }
}
