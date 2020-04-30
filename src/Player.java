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


    /**
     * Changes the players hand
     * @param handToChange - index position of the hand the player wants to change
     * @return - returns the new list of hands
     */
    public ArrayList<Hand> changeHand(int handToChange){
        boolean newValue = !handsList.get(handToChange).isOpen;
        handsList.get(handToChange).setOpen(newValue);
        return handsList;
    }

    public ArrayList<Hand> callHandsInTheCircle(){
        return null;
    }
}
