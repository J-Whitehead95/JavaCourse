package Chapter3;

import java.util.Scanner;

public class ChangeForAPoundGame {
    public static void main(String args[]){
        //what we know -values of coins and required value
        double penny = 0.01;
        double tenPence = 0.1;
        double twentyPence = 0.2;
        double fiftyPence = 0.5;

        double requiredValue = 1.00;


        //input which coins they want
        System.out.println("How Many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double totalPennies = quantity * penny;

        System.out.println("How many 10ps would you like?");
        int quantity2 = scanner.nextInt();
        double totalTenPence = quantity2 * tenPence;

        System.out.println("How many 20ps would you like?");
        int quantity3 = scanner.nextInt();
        double totalTwentyPence = quantity3 *twentyPence;

        System.out.println("How many 50ps would you like?");
        int quantity4 = scanner.nextInt();
        double totalFiftyPence = quantity4 * fiftyPence;
        scanner.close();

        //decision, does it meet criteria
        double totalCoins = totalPennies + totalTenPence + totalTwentyPence + totalFiftyPence;
        double difference = requiredValue + totalCoins;

        if(totalCoins == requiredValue){
            System.out.println("Congrats, your change is equal to £1");
        }
        else if(totalCoins < requiredValue){
            System.out.println("Oh no you need £" + difference + "more to make £1");
        }
        else{
            System.out.println("Oh No youve exceeded £1 by £" + difference);
        }

    }
}
