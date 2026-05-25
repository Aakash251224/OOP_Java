

class EmptyConstructorDemo {

    String textMessage;

    public EmptyConstructorDemo() {
        textMessage = "Welcome to constructor demonstration!";
    }

    public void showMessage() {
        System.out.println(textMessage);
    }
}

class StudentInformation {

    String studentName;
    int studentAge;
    int studentHeight;

    public StudentInformation(String studentName, int studentAge) {

        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public void showStudentInfo() {

        System.out.println("Student: " + studentName +
                ", Age: " + studentAge +
                " Height: " + studentHeight);
    }
}

class AutoConstructorDemo {

    String defaultText;

    public void printMessage() {

        System.out.println("Java automatically creates default constructor! Text: " + defaultText);
    }
}

public class ConstructorTypes {

    public static void main(String[] args) {

        EmptyConstructorDemo firstObject = new EmptyConstructorDemo();
        firstObject.showMessage();

        StudentInformation secondObject =
                new StudentInformation("Rahim", 18);

        secondObject.showStudentInfo();

        AutoConstructorDemo thirdObject =
                new AutoConstructorDemo();

        thirdObject.printMessage();
    }
}