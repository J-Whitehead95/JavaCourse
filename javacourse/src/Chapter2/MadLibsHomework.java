package Chapter2;

import java.util.Scanner;

public class MadLibsHomework {
    public static void main(String arg[]){
        //ask user for a season of the year
        System.out.println("Please Enter a Season Of The Year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();


        //ask user for whole number
        System.out.println("Please Enter a whole Number");
        int wholeNumber = scanner.nextInt();

        //ask user for adjective
        System.out.println("Please Enter an Adjective");
        String adjective = scanner.next();
        scanner.close();

        //print output with string
        System.out.println("On a "+ adjective + " " + season + " " + "day, I drink a minimum of" + " " +  wholeNumber + " " + "cups of coffee");
    }

}
