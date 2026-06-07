
interface DeviceControl {
    void switchOn();
    void switchOff();
}

interface Configurable {
    void configure(int level);
}

class SmartHeater implements DeviceControl, Configurable {

    public void switchOn() {
        System.out.println("Smart Heater is turned ON.");
    }

    public void switchOff() {
        System.out.println("Smart Heater is turned OFF.");
    }

    public void configure(int temperature) {
        System.out.println("Smart Heater temperature set to " + temperature);
    }
}

class SmartSpeaker implements DeviceControl, Configurable {

    public void switchOn() {
        System.out.println("Smart Speaker is turned ON.");
    }

    public void switchOff() {
        System.out.println("Smart Speaker is turned OFF.");
    }

    public void configure(int volume) {
        System.out.println("Smart Speaker volume set to " + volume);
    }
}

public class MultipleInterfaceDemo {
    public static void main(String[] args) {

        SmartHeater heater = new SmartHeater();
        heater.switchOn();
        heater.configure(28);
        heater.switchOff();

        SmartSpeaker speaker = new SmartSpeaker();
        speaker.switchOn();
        speaker.configure(7);
        speaker.switchOff();
    }
}