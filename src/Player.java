import java.util.ArrayList;

// Class containing the player data
public class Player {

    // ArrayList of Hand containing the hands that the player has in
    ArrayList<Hand> handsList = new ArrayList<>();
    public Player(Hand initialHand){
        this.handsList.add(initialHand);
    }

    /**
     *
     * @return handsList - ArrayList of Hand instances
     */
    public ArrayList<Hand> getHandsList() {
        return handsList;
    }
}
