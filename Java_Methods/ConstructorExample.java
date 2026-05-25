

public class ConstructorExample {

    String programmingLanguage = "Ruby";

    ConstructorExample() {
        programmingLanguage = "Java";
    }

    void updateLanguage() {
        programmingLanguage = "JavaScript";
    }

    public static void main(String[] args) {

        ConstructorExample objectExample = new ConstructorExample();

        System.out.println("Current language is " + objectExample.programmingLanguage);


    }
}