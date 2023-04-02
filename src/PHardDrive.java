import java.util.ArrayList;

public class PHardDrive extends Volume{
    private final int size;

    public PHardDrive(int size, String name) {
        super(name);
        this.size=size;
    }


    @Override
    public int getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "PHardDrive{" +
                "size=" + size +
                '}'+getName();
    }
}
