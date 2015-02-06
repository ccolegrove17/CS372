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
        //PT -- this is fine, but maybe better to return a 0/1, and let the UI decide how to display it (e.g. text, image, ...)
            return "Heads!";//heads
        else//otherwise
            return "Tails!";//tails
    }
}
