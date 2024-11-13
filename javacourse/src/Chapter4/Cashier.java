package Chapter4;

import java.util.Scanner;

/*
FOR LOOP
write a cashier programme that will scan a given number of items and tally the cost
 */
public class Cashier {
    public static void main(String args[]){

        //get number of items to scan
        System.out.println("Enter Number of Items You'd Like to Scan");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();


        double total = 0;

        //Create loop to iterate through the items and accumulate costs
        for(int i=0; i<quantity; i++){

            System.out.println("What is the cost of the item?");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();

        System.out.println("Your Total Cost is $" + total);


    }
}
