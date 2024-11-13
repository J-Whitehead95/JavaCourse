package Chapter5;

import java.util.Scanner;

/*
VARIABLE SCOPE
Write an instant credit check program that improves
anyone who makes more than 25k and has a credit score of 700
or higher. reject all others.
 */
public class InstantCreditCheck {
   static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        //initialize what we know
        double salary = getSalary();
       int creditScore = getCreditScore();
        scanner.close();


        //check if the user qualifies
       boolean qualified = isUserQualified(creditScore, salary);

        //notify the user
        notifyUser(qualified);
    }
    //get what we dont know
    public static double getSalary(){
        System.out.println("Please Enter Your Current Salary:");

        double salary = scanner.nextDouble();
        return salary;

    }

    public static int getCreditScore(){
        System.out.println("Please Enter Your Credit Score:");
        int creditScore = scanner.nextInt();
        return creditScore;


    }
    public static boolean isUserQualified(int creditScore, double salary){

        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;

        }
        else{
            return false;
        }


            }
    public static void notifyUser(boolean isQualified){

        if(isQualified){
            System.out.println("You Are Qualified for Credit");
        }
        else{
            System.out.println("Sorry. You do not Qualify for Credit. ");
        }
    }
}
