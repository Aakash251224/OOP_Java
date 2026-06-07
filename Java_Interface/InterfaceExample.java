
interface Appliance {
    void turnOn();
    void turnOff();
}

class Television implements Appliance {

    public void turnOn() {
        System.out.println("Television is turning ON...");
    }

    public void turnOff() {
        System.out.println("Television is turning OFF...");
    }
}

class Refrigerator implements Appliance {

    public void turnOn() {
        System.out.println("Refrigerator is turning ON...");
    }

    public void turnOff() {
        System.out.println("Refrigerator is turning OFF...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        Appliance tv = new Television();
        tv.turnOn();
        tv.turnOff();

        Appliance fridge = new Refrigerator();
        fridge.turnOn();
        fridge.turnOff();
    }
}
