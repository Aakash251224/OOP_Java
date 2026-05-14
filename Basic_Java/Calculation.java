 class Calculation {

    public static int addNumbers(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static void main(String args[]) {

        int valueOne = 35;
        int valueTwo = 45;

        int totalResult = addNumbers(valueOne, valueTwo);

        System.out.println("Total of 2 values: " + totalResult);
    }
}