package Chapter4;

import java.util.Scanner;

/*
WHILE LOOP
Each store employee makes $15 p/h
write a program that allows the employee to enter number of hours worked that week
do not allow overtime.
 */
public class GrossPayInputValidation {
    public static void main(String args[]){

        // initialise known variables
        int rate = 15;
        int maxHours = 40;

        //get input for unknown variables
        System.out.println("How Many Hours Did You Work This Week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Validate input

        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid Entry. Hours worked must be between 1 & 40. Try again");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross Pay: $" + gross);

    }
}
