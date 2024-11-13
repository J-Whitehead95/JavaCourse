package Chapter3;

import java.util.Scanner;

/*
IF ELSE
all salespeople are expected to make at least 10 sales per week
for those who do, they receive a congratulatory message
for those who do not they are informed of how many sales they were short
 */
public class QuotaCalculator {
    public static void main(String args[]){

        //initialize values we know
        int quota = 10;

        //get the values we don't know
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //make a decision on the path to take - output
        if(sales >= quota){
            System.out.println("Congratulations, You have met or exceeded your sales quota this week");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("Unfortunately you were short of your quote by " + salesShort + " sales.");
        }


    }
}
