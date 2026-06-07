
interface Transport {
    void begin();
    void end();

    default void mileage() {
        System.out.println("Mileage: Calculating using default method.");
    }
}

class Bus implements Transport {
    @Override
    public void begin() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void end() {
        System.out.println("Bus is stopping...");
    }
}

class Motorcycle implements Transport {
    @Override
    public void begin() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void end() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public void mileage() {
        System.out.println("Motorcycle mileage: 60 km per liter.");
    }
}

public class InterfaceDefaultMethodDemo {
    public static void main(String[] args) {

        Transport bus = new Bus();
        bus.begin();
        bus.mileage(); 
        bus.end();

        Transport motorcycle = new Motorcycle();
        motorcycle.begin();
        motorcycle.mileage(); 
        motorcycle.end();
    }
}