

 class ConstructorOverloading {

    String codingLanguage = "Go";

    ConstructorOverloading() {
        codingLanguage = "Java";
    }

    ConstructorOverloading(String selectedLanguage) {
        codingLanguage = selectedLanguage;
    }

    void changeCodingLanguage() {
        codingLanguage = "Kotlin";
    }

    public static void main(String[] args) {

        ConstructorOverloading firstObject = new ConstructorOverloading();
        System.out.println("Now learning " + firstObject.codingLanguage);

        ConstructorOverloading secondObject = new ConstructorOverloading("Swift");
        System.out.println("Now learning " + secondObject.codingLanguage);

    }
}