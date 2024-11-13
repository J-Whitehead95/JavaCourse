package Chapter4;

import java.util.Scanner;

/*
LOOP BREAK
search a string to determine if it contains the letter 'A'
 */
public class LetterSearch {
    public static void main(String args[]){

        //Get text
        System.out.println("Enter Text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //search text for letter A
        for(int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;

            }
        }
        if(letterFound){
            System.out.println("This Text Contains Letter 'A'");

        }
        else{
            System.out.println("This Text Does Not Contain Letter 'A'");

        }


    }
}
