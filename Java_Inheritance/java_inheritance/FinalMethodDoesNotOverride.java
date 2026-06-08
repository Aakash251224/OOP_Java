
class ParentClass {
    final void display() {
        System.out.println("Final method in Parent");
    }
}

class ChildClass extends ParentClass {

}

public class FinalMethodDoesNotOverride {
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        obj.display();  

        ChildClass obj2 = new ChildClass();
        obj2.display();
    }
}
