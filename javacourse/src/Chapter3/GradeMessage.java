package Chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String arg[]){
        System.out.println("What is Your Letter Grade?");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch(grade){
            case "A":
                message = "excellent job!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job.";
                break;
            case "D":
                message = "You need to work a bit harder...";
                break;
            case "F":
                message = "uhOh!!!!";
                break;
            default:
                message = "ERROR: Invalid Grade";
                break;


        }
        System.out.println(message);
    }
}
