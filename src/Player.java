import java.util.ArrayList;

// Class containing the player data
public class Player {

    // ArrayList of Hand containing the hands that the player has in
    ArrayList<Hand> handsList = new ArrayList<>();


    /**
     * Constructor that adds one hand into the game when the round is counted out
     * @param initialHand - Hand instance
     */
    public Player(Hand initialHand){
        this.handsList.add(initialHand);
    }


    /**
     * Getter method that returns the ArrayList of Hands
     * @return handsList - ArrayList of Hand instances
     */
    public ArrayList<Hand> getHandsList() {
        return handsList;
    }


    public ArrayList<Hand> changeHand(){
        return null;
    }

    public ArrayList<Hand> callHandsInTheCircle(){
        return null;
    }
}
