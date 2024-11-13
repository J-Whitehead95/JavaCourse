package Chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        //get the number of hours worked
        System.out.println("Enter Number of Hours Worked");
        Scanner scanner = new Scanner(System.in);
       int hours = scanner.nextInt();

        //get the hourly rate
        System.out.println("Enter The Employee's pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //multiply hours by rate
        double grossPay = hours * rate;

        //display result
        System.out.println("The employee's Gross Pay is...£" + grossPay);

    }
}
