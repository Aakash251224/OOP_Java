
public class MethodIntroduction {

    int findTotal(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    public static void main(String[] args) {

        int numberOne = 15;
        int numberTwo = 25;

        MethodIntroduction methodObject = new MethodIntroduction();

        int finalResult = methodObject.findTotal(numberOne, numberTwo);

        System.out.println(finalResult);
    }
}
