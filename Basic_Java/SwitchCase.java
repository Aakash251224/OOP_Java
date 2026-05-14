
public class SwitchCase {
    public static void main(String[] args) {
        int dayNumber = 6;

        switch (dayNumber) {
            case 1, 2, 7:
                System.out.println("Weekend");
                break;

            case 3:
                System.out.println("Midweek Day");
                break;

            case 4:
                System.out.println("Work Day");
                break;

            case 5:
                System.out.println("Last Work Day");
                break;

            default:
                System.out.println("Invalid Input");
        }
    }
}