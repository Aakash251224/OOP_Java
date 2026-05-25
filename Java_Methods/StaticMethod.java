

public class StaticMethod {

    static int calculateSquare(int value) {
        return value * value;
    }

    public static void main(String[] args) {

        int squareResult = calculateSquare(9);

        System.out.println(squareResult);
    }
}