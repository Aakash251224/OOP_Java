

public class Conditional {
    public static void main(String[] args) {
        float marks = 83.6F;
        String grade;

        if(marks >= 80) {
            grade = "A+";
        } else if(marks >= 70) {
            grade = "A";
        } else if(marks >= 60) {
            grade = "A-";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);

        String status = marks < 40 ? "Failed" : "Passed";
        System.out.println(status);
    }
}