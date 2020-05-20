import java.util.Random;

public class AI extends Player {


    /**
     * Constructor that adds one hand into the game when the round is counted out
     *
     * @param initialHand - Hand instance
     */
    public AI(Hand initialHand) {
        super(initialHand);
    }


    /**
     * Basic functioning AI engine, that essentially chooses the values at random
     *
     * @param choice - boolean, true for generating value for hand action, false for circle call
     */

    // TODO - change void to int
    public void aiEngine(boolean choice){

        Random rand = new Random();

        // choice is true, therefore the AI will generate a value for hand action
        if (choice){
            // pass
        }
    }
}
