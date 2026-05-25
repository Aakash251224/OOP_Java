

public class MethodOverloadingScenario {

    static int addTwoValues(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    static int addThreeValues(int firstNumber,
                              int secondNumber,
                              int thirdNumber) {

        return firstNumber + secondNumber + thirdNumber;
    }

    static int calculateSum(int valueOne, int valueTwo) {

        return valueOne + valueTwo;
    }

    static int calculateSum(int valueOne,
                            int valueTwo,
                            int valueThree) {

        return valueOne + valueTwo + valueThree;
    }

    public static void main(String[] args) {

        int finalResult;

        finalResult = calculateSum(5, 7);

        finalResult = calculateSum(5, 7);

        System.out.println("Total of 2 provided numbers: "
                + finalResult);

        finalResult = calculateSum(5, 7, 12);

        System.out.println("Total of 3 provided numbers: "
                + finalResult);
    }
}