package Chapter6;

import java.util.Scanner;

/*So, a phone bill should have an ID, a base cost, a
number of allotted minutes and a number of minutes used.
And then, it should also be able to calculate the overage,
calculate the tax, and calculate the total.
And then, it should also be able to print an itemized bill.
You should also include three constructors

a default one
one that accepts the ID only
one that accepts all fields

 */
public class Bill {
    public static double overage = 0.25;
    public static double tax = 0.15;

    public Bill(){


    double ID = 0;
    double baseCost = 0;
    double allottedMinutes = 0;
    double minutesUsed = 0;




    }
    public Bill(double ID, double baseCost, double allottedMinutes,
                double minutesUsed){
        setId(ID);
        setBaseCost(baseCost);
        setAllottedMinutes(allottedMinutes);
        setMinutesUsed(minutesUsed);
    }
public double getId(){
        return ID;
}
public void setID(double ID){
        this.ID = ID;
}
    }
