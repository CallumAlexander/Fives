import java.util.List;
import java.util.Scanner;

// Class containing the utility and helper methods for Game.java
public class GameUtil {

    private static final String SHOTGUN_CMD = "SHOTGUN";


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

    public List<Player> countOut(Scanner input, List<Player> gameArray){

        System.out.println("Enter the number of players");
        int numberOfPlayers = input.nextInt();
        System.out.println("SHOTGUN !!");
        System.out.println("From my right to my right...");

        for (int i = 0; i < numberOfPlayers; i++){
            gameArray.add(new Player());
            int callingNumber = (i+1) * 5;
            System.out.println(callingNumber);
        }

        return gameArray;
    }

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
