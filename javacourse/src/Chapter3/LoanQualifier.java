package Chapter3;

import java.util.Scanner;

/*
NESTED IFS
to qualify for a loan a person should make at least $30,000
an have been working at their current job for at least 2 years
 */
public class LoanQualifier {
    public static void main(String args[]){
        // initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;


        // get what we dont
        System.out.println("What is your current Salary?");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();


        System.out.println("Enter number of years with current employer.");
        double years = scanner.nextDouble();

        scanner.close();

        //make decision
        if (salary >= requiredSalary) {
            if(years >= requiredYearsEmployed){
                System.out.println("Congrats! you qualify for the loan");
            }
            else{
                System.out.println("unfortunately you have not been employed" +
                        "for " + requiredYearsEmployed + " years and are not eligible for the loan");
            }
        }
        else{
            System.out.println("sorry. you must earn at least $" + requiredSalary +
                    " to be qualified for this loan");
        }

    }
}
