

class WithoutFunctions {

    public void printTable() {

        int tableNumber = 6;

        System.out.println("Table for " + tableNumber + ":");

        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(tableNumber + " X " + counter + " = " + (tableNumber * counter));
        }

        tableNumber = 8;

        System.out.println("Table for " + tableNumber + ":");

        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(tableNumber + " X " + counter + " = " + (tableNumber * counter));
        }
    }
}

public class MethodsAdvantages {

    static void displayTable(int tableValue) {

        System.out.println("Table for " + tableValue + ":");

        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(tableValue + " X " + counter + " = " + (tableValue * counter));
        }
    }

    public static void main(String[] args) {

        int firstTable = 6;

        displayTable(firstTable);

        firstTable = 8;

        displayTable(firstTable);
    }
}