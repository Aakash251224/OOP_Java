
public class WhileLoop {
    public static void main(String[] args) {

        int counter = 1;

        while (counter < 6) {
            counter++;

            if (counter == 3) continue;

            System.out.println(counter);
        }

        while (true) {
            System.out.println(counter + " Running");

            if (counter > 4) {
                break;
            }

            counter++;
        }
    }
}