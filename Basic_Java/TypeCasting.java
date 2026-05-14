
public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting / Widening casting (automatically)
        // byte -> short -> char -> int -> long -> float -> double

        short smallValue = 2;
        int expandedValue = smallValue + 300;
        System.out.println(expandedValue);

        double decimalOne = 2.5;
        double resultOne = decimalOne + 3;

        // Narrowing Casting (manually) - converting a larger type to a smaller type
        // double -> float -> long -> int -> char -> short -> byte

        double decimalTwo = 3.9;
        int resultTwo = (int) decimalTwo + 5;

        System.out.println(resultTwo);
    }
}