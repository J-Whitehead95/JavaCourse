package Chapter4;

import java.util.Scanner;

/*
DO WHILE LOOP
write a programme that allows the user to enter two numbers
and then sums up the two numbers
repeat this action until they tell you theyre done
 */
public class AddNumbers {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            System.out.println("Please Enter Your First Number");
            double num1 = scanner.nextDouble();
            System.out.println("Please Enter Your Second Number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The Sum Is: " + sum);
            System.out.println("Would You Like To Run This Again? True / False");
            again = scanner.nextBoolean();


        }while(again);
        scanner.close();
    }
}
