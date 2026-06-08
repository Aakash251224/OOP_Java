
class Parent {
    static void show() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
    static void show() {  
        System.out.println("Static method in Child");
    }
}

public class StaticMethodDoestNotOverride {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show(); 

        Child c = new Child();
        c.show(); 
    }
}
