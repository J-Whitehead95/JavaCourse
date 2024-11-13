package Chapter4;

import java.util.Random;

/* HOMEWORK
dice game:
The objective of this game is to travel the
entire game board of 20 spaces within 5 die rolls.
roll the die and advance user that number of spaces on game board (gen random num 1-6)
After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
Repeat this 4 additional times, for 5 rolls in total.

However, if the user gets to 20 before 5 rolls, end the game - they’ve won.

If they are greater than or less than 20 spaces exactly, they lose.
Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
*/
public class DiceGame {
    public static void main(String args[]){

        //initialise known values
        int boardSpaces = 20;
        int maxRolls = 5;




        boolean win = true;




        System.out.println("Welcome to DICE GAME Roll the die and advance that many spaces. " +
                "you must reach (not exceed) space 20 to win!");




            int currentSpace = 0;
            for (int j=0; j<maxRolls; j++) {

                Random random = new Random();
                int die = random.nextInt(6) + 1;
                currentSpace = currentSpace + die;

                System.out.println("Roll #" + (j + 1) + "You Have Rolled a " + die + " You Advanced to Space" + currentSpace);


            }
            if (currentSpace == boardSpaces) {
                win = true;

            } else {
                win = false;
            }

            if (!win) {
                System.out.println("Better Luck Next Time, you reached space #" + currentSpace);
            } else {
                System.out.println("well Done! You reached space #" + currentSpace);

            }


        }
    }

