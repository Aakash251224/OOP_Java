

class Container {
    double length;
    double breadth;
    double height;

    Container(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void setDimensions(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    protected void getVolume() {
        double totalVolume = this.length * this.breadth * this.height;
        System.out.println("Volume of container: " + totalVolume);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Container box1 = new Container(12, 6, 11);
        Container box2 = new Container(7, 9, 14);

        box1.getVolume();
        box2.getVolume();

        System.out.println("Length of box1: " + box1.length);
    }
}