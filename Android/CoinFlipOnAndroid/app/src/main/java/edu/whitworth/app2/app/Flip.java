package edu.whitworth.app2.app;

import java.util.Random;

/**
 * Created by ccolegrove17 on 1/15/2015.
 */
public class Flip {
    Random rand = new Random();
    public String flipCoin(){
        int flip = rand.nextInt(2);
        if (flip==0)
            return "Heads!";
        else
            return "Tails!";
    }
}
