import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class containing the Game logic
public class Game extends GameUtil {

    // ArrayList of Player that holds the game array
    public List<Player> gameArray = new ArrayList<>();

    // Scanner object to receive input from the console
    public Scanner input = new Scanner(System.in);

    public void startGame(){

        gameArray = shotgun(input, gameArray);

        while (getNumberOfHandsInCircle(gameArray) > 2){

        }
        /*
 *      while the number of hands is greater than 2
 *          cycle through ArrayList
 *              If handPosition is a player hand
 *                  Player calls hand
 *                  player calls number
 *              else
 *                  player calls hand
 *              remove hand if need be
 *
 *       when hands = 2 and not of the same player
 *          shotgun again - 2 players start with two hands each
 *          keep going until player is eliminated

         */

    }


}
