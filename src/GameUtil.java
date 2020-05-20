import java.util.List;
import java.util.Scanner;

// Class containing the utility and helper methods for Game.java
public class GameUtil {

    // Final String instance field that holds the shotgun command keyword
    private static final String SHOTGUN_CMD = "SHOTGUN";


    /**
     * Executes the Shotgun stage of the game
     * Shotgunning consists of calling a shotgun, then counting out the
     * number of hands in the cirle
     *
     * @param input - Scanner object for receiving user input
     * @param gameArray - Empty List of Player instances
     * @return - List of Player instances that holds the players in the game
     */
    public List<Player> shotgun(Scanner input, List<Player> gameArray){

        System.out.println("Begin by typing SHOTGUN to shotgun!");
        String initialCmd = input.nextLine();

        if (initialCmd.equals(SHOTGUN_CMD)){
            System.out.println("Player has shotgunned");
        } else{
            System.out.println("Player has failed to shotgun, AI will shotgun");
        }
        gameArray = countOut(input, gameArray);

        return gameArray;
    }


    /**
     * Counts out the number of players in the game
     *
     * @param input - Scanner Object that receives user input
     * @param gameArray - List of Player instances that holds the players in the game
     * @return List of Player instances that holds the players in the game
     */
    public List<Player> countOut(Scanner input, List<Player> gameArray){

        System.out.println("Enter the number of players");
        int numberOfPlayers = input.nextInt();
        System.out.println("SHOTGUN !!");
        System.out.println("From my right to my right...");

        // Initializing the player
        gameArray.add(new AI(new Hand()));
        System.out.println(5);

        // Initializing the rest of the circle as AI, and counting out
        for (int i = 1; i < numberOfPlayers; i++){
            gameArray.add(new AI(new Hand()));
            int callingNumber = (i+1) * 5; // Output multiples of 5
            System.out.println(callingNumber);
        }

        return gameArray;
    }


    /**
     * Gets the total number of hands in the circle
     * @param gameArray - List of Player instances that holds the players in the game
     * @return counter - integer holding the number of hands in the circle
     */
    public int getNumberOfHandsInCircle(List<Player> gameArray){

        int counter = 0;
        for (Player player : gameArray){
            for (Hand hand : player.getHandsList()){
                counter ++;
            }
        }
        return counter;
    }


}
