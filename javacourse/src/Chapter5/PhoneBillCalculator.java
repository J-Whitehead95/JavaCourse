package Chapter5;

import java.util.Scanner;

/*
HOMEWORK
calculate the final total of someones phone bill
allow operator to input plan fee and number of overage minutes
charge user 0.25 for every minute over plan
charge 15% tax on subtotal
I want you to create separate methods to calculate the tax,
to calculate the overage fees, and to calculate and print the final total.
print final total as itemized bill

 */
public class PhoneBillCalculator {

   static double overage = 0.25;
    static double tax = 0.15;
   static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){



        double planCost = getPlanCost();


       double minutesUsed = getMinutesUsed();
      double overageCost = calculateOverage(minutesUsed);
      double subTotal = calculateTotal(planCost, overageCost);
      double taxTotal = calculateTax(subTotal, tax);
      calculateFinalTotal(subTotal,taxTotal, overageCost, planCost);






    }
    public static double getPlanCost(){
        System.out.println("How Much is Your Plan Cost?");

        double planCost = scanner.nextDouble();

        return planCost;
    }
    public static double getMinutesUsed(){
        System.out.println("How Many Extra Minutes Have You Used?");
        double minutesUsed = scanner.nextInt();
        return minutesUsed;
    }
    public static double calculateOverage(double minutesUsed){
      double overageCost = overage * minutesUsed;
      return overageCost;
    }
    public static double calculateTotal(double planCost,double overageCost){
        double subTotal = planCost + overageCost;
        return subTotal;
    }
    public static double calculateTax(double subTotal, double tax){
        double taxTotal = subTotal * tax;
        return taxTotal;

    }
    public static void calculateFinalTotal(double subTotal, double taxTotal, double planCost, double overageCost){
        double finalTotal = subTotal + taxTotal;


        //print itemised receipt
        System.out.println("RECEIPT GENERATED");
        System.out.println("PLAN COST: £" + String.format("%.2f",planCost));
        System.out.println("OVERAGE FEES @ 25%: £" + String.format("%.2f",overageCost));
        System.out.println("TOTAL TAX @ 15%: £" + String.format("%.2f",taxTotal));
        System.out.println("TOTAL BILL: £" + String.format("%.2f",finalTotal));
    }
}
