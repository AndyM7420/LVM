import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Storage {
    private final ArrayList<PHardDrive> drives = new ArrayList<PHardDrive>();
    private final ArrayList<volumeGroup> lvs = new ArrayList<volumeGroup>();

    private final ArrayList<PhysicalVolume> physicalVolumesDrive = new ArrayList<PhysicalVolume>();
    Scanner s = new Scanner(System.in);

    public Storage(String end) {
        System.out.println("Welcome to the LVM System:");
        while (end.equals("end")) {
            System.out.print("cmd#:");
            String news = s.nextLine();
            if (news.contains("install-drive")) {
                String[] non = news.split(" ");
                String[] size = non[non.length - 1].split("G");
                PHardDrive one = new PHardDrive(Integer.parseInt(size[0]), non[non.length - 2]);
                drives.add(one);
            } else if (news.equals("list-Drives")) {
                listDrives();

            } else if (news.contains("pvcreate")) {
                String[] speak = news.split(" ");
                PhysicalVolume one = new PhysicalVolume(speak[1], findHardDrive(speak[speak.length - 1]));
                physicalVolumesDrive.add(one);
            } else if (news.contains("pvList") || news.contains("pvlist")) {
                listPhysicalVolumeDrives();
            } else if (news.contains("vgcreate")) {
                String[] one = news.split(" ");
                volumeGroup lone = new volumeGroup(one[1], findPhysicalVolume(one[one.length - 1]));
                lvs.add(lone);
            } else if (news.equals("vglist") || news.equals("vgList")) {
                listPhysicalVolumeDrives();
            } else if (news.contains("vgextend")) {
                String[] speak = news.split(" ");
                volumeGroup some = findvolumeGroup(speak[1]);
            }
        }
    }

    public void listDrives() {
        if (drives.isEmpty()) {
            System.out.println("No drives are installed.");
        } else {
            for (PHardDrive drive : drives) {
                System.out.println(drive.getName() + " [" + drive.getSize() + "G]" + " [" + drive.getUUID() + "]");
            }
        }
    }

    public void listPhysicalVolumeDrives() {
        if (physicalVolumesDrive.isEmpty()) {
            System.out.println("No physical volumes are installed.");
        } else {
            for (PhysicalVolume drive : physicalVolumesDrive) {
                System.out.println(drive.getName() + ": [" + drive.getSize() + "G]" + " [" + drive.getUUID() + "]" + "[" + drive.getS() + "]");
            }
        }
    }

    public void listVolumeGroup() {
        if (lvs.isEmpty()) {
            System.out.println("No  volume groups are installed.");
        } else {
            for (volumeGroup s : lvs) {
                System.out.println(s.getName() + ": [" + s.getSize() + "G]" + " [" + s.getUUID() + "]");
            }
        }
    }

    public PHardDrive findHardDrive(String specific) {
        ArrayList<PHardDrive> one = new ArrayList<PHardDrive>();
        Collections.copy(drives, one);
        for (PHardDrive ones : drives) {
            if (ones.getName().equals(specific)) {
                one.remove(ones);
                return ones;
            }
        }
        System.out.println("drive not found");
        return null;
    }

    public PhysicalVolume findPhysicalVolume(String specific) {
        ArrayList<PhysicalVolume> one = new ArrayList<PhysicalVolume>();
        Collections.copy(physicalVolumesDrive, one);
        for (PhysicalVolume ones : physicalVolumesDrive) {
            if (ones.getName().equals(specific)) {
                one.remove(ones);
                System.out.println("volume group created");
                return ones;
            }
        }
        System.out.println("physical volume not found");
        return null;
    }

    public volumeGroup findvolumeGroup(String specific) {
        for (volumeGroup s : lvs) {
            if (s.getName().equals(specific)) {
                return s;
            }
        }
        return null;
    }

    public void addSize(PhysicalVolume one, volumeGroup spec) {
        spec.setSize(findPhysicalVolume(one.getName()).getSize() + spec.getSize());

    }
}


