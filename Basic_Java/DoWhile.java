
public class DoWhile {
    public static void main(String[] args) {
        int counter = 1;

        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 5);

        counter = 6;

        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 5);
    }
}