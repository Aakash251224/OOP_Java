
class SmartHeater {

    void powerOn() {
        System.out.println("Smart Heater is turned ON.");
    }

    void powerOff() {
        System.out.println("Smart Heater is turned OFF.");
    }

    void setTemperature(int degree) {
        System.out.println("Smart Heater temperature set to " + degree);
    }
}

class SmartSpeaker {

    void powerOn() {
        System.out.println("Smart Speaker is turned ON.");
    }

    void powerOff() {
        System.out.println("Smart Speaker is turned OFF.");
    }

    void setVolume(int volume) {
        System.out.println("Smart Speaker volume set to " + volume);
    }
}

public class WithoutInterfaceDemo {
    public static void main(String[] args) {

        SmartHeater heater = new SmartHeater();
        heater.powerOn();
        heater.setTemperature(28);
        heater.powerOff();

        SmartSpeaker speaker = new SmartSpeaker();
        speaker.powerOn();
        speaker.setVolume(7);
        speaker.powerOff();
    }
}