import java.util.ArrayList;
import java.util.Scanner;

// Class containing the utility and helper methods for Game.java
public class GameUtil {

    private static final String SHOTGUN_CMD = "SHOTGUN";


    public ArrayList<Player> shotgun(Scanner input, ArrayList<Player> gameArray){

        System.out.println("Begin by typing SHOTGUN to shotgun!");
        String initialCmd = input.nextLine();

        if (initialCmd.equals(SHOTGUN_CMD)){
            System.out.println("Player has shotgunned");
            gameArray = countOut(input, gameArray);

        } else{
            System.out.println("Player has failed to shotgun, AI will shotgun");
            gameArray = countOut(input, gameArray);
        }

        return gameArray;
    }

    public ArrayList<Player> countOut(Scanner input, ArrayList<Player> gameArray){

        System.out.println("Enter the number of players");
        int numberOfPlayers = input.nextInt();
        System.out.println("I count " + numberOfPlayers + " in the ring");
        System.out.println("SHOTGUN !!");
        System.out.println("From my right to my right...");

        for (int i = 0; i < numberOfPlayers; i++){
            gameArray.add(new Player());
            int callingNumber = (i+1) * 5;
            System.out.println(callingNumber);
        }

        return gameArray;
    }


}
