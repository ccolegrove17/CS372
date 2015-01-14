/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.util.Random;

/**
 *
 * @author ccolegrove17
 */
public class RollDice {

    private final Random rand = new Random();//seeds the random number generator

    /**
     * Rolls the dice.
     * @return the sum of the dice.
     */
    public int Roll() {
        return rand.nextInt(6) + rand.nextInt(6) + 2;//returns the sum of two random numbers between 0 and 5, then adds 2.
    }
}
