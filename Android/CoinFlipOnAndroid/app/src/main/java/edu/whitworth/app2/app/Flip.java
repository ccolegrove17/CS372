package edu.whitworth.app2.app;

import java.util.Random;

/**
 * Created by ccolegrove17 on 1/15/2015.
 */
public class Flip {
    Random rand = new Random();//new randomness

    /**
     * flips the coin
     * @return a string saying if it's heads or tails
     */
    public String flipCoin(){
        int flip = rand.nextInt(2);//random number 0 or 1
        if (flip==0)//if zero
            return "Heads!";//heads
        else//otherwise
            return "Tails!";//tails
    }
}
