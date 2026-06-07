
interface SwitchControl {
    void powerOn();
    void powerOff();
}

interface VolumeControl {
    void setLevel(int level);
}

interface SmartGadget extends SwitchControl {
    void gadgetInfo();
}

class SmartDoor implements SmartGadget {

    public void powerOn() {
        System.out.println("Smart Door is unlocked.");
    }

    public void powerOff() {
        System.out.println("Smart Door is locked.");
    }

    public void gadgetInfo() {
        System.out.println("Smart Door Device");
    }
}

class SmartSpeaker implements SwitchControl, VolumeControl {

    public void powerOn() {
        System.out.println("Smart Speaker is turned ON.");
    }

    public void powerOff() {
        System.out.println("Smart Speaker is turned OFF.");
    }

    public void setLevel(int volume) {
        System.out.println("Speaker volume set to " + volume);
    }
}

public class InterfaceExtensionDemo {
    public static void main(String[] args) {

        SmartDoor door = new SmartDoor();
        door.powerOn();
        door.powerOff();
        door.gadgetInfo();

    }
}