package Chapter3;

import java.util.Scanner;

/*
if statement
all salespeople get a payment of $1000 per week
those who exceed 10 sales get an additional $250 per week
 */
public class SalaryCalculator {
    public static void main(String args[]) {
        // initialise known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get values for the unknown
        System.out.println("How Many Sales Did You Make This Week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //quick detour for bonus earners
        if (sales > quota) {
            salary = salary + bonus;

        }

        //output
        System.out.println("employee's pay is $" + salary);
    }
}
