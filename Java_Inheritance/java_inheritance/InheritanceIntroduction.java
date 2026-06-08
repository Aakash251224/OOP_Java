
class Bird {
    String name;
    void fly() {
        System.out.println(name + " is flying!");
    }
    void eat() {
        System.out.println(name + " is eating!");
    }
}
class Cuckoo extends Bird {
    void sing() {
        System.out.println(name + " is singing melodiously!");
    }
}
public class InheritanceIntroduction {
    public static void main(String[] args) {
        Cuckoo cuckoo = new Cuckoo();
        cuckoo.name = "Melody";
        cuckoo.fly(); 
        cuckoo.eat();  
        cuckoo.sing(); 
    }
}
