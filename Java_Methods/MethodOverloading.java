

public class MethodOverloading {

    public static double calculateFine(int delayedDays) {

        double fineAmount = 20;

        return delayedDays * fineAmount;
    }

    public static double calculateFine(int delayedDays, int totalBooks) {

        double fineAmount = 20;

        return delayedDays * totalBooks * fineAmount;
    }

    public static double calculateFine(int delayedDays, double specialRate) {

        return delayedDays * specialRate;
    }

    public static void main(String[] args) {

        System.out.println("Charge for 4 delayed days (1 book): BDT "
                + calculateFine(4));

        System.out.println("Charge for 4 delayed days (2 books): BDT "
                + calculateFine(4, 2));

        System.out.println("Charge for 4 delayed days (custom rate): BDT "
                + calculateFine(4, 3.5));
    }
}