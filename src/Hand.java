
// Class containing the hand data
public class Hand {

    // Boolean instance field that stores whether the hand is open or not
    public boolean isOpen = false;


    /**
     * Getter that returns the state of isOpen
     * @return Boolean containing isOpen
     */
    public boolean isOpen() {
        return isOpen;
    }

    /**
     * Setter that sets the state of isOpen
     * @param open - Boolean containing the value that updates isOpen
     */
    public void setOpen(boolean open) {
        isOpen = open;
    }
}
