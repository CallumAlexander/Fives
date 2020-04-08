public class main {

    public static void main(String[] args) {

    }

}

/**
 * Data that might be needed:
 *      Which player shotgunned
 *      ArrayList of player objects
 *
 * Classes that might be needed:
 *      Player Class
 *          its data includes an ArrayList of Hands
 *      Hand Class
 *      Game Class that contains the majority of the game logic
 *
 * Game Procedure
 *      Shotgun - itialize how many people start out
 *      Count out - basic displaying techniques
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
 *
 */
