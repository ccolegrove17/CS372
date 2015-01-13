/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculatingpi;

/**
 *
 * @author ccolegrove17
 */

public class Main {
    
    /**
     * 
     * @param args how many terms the user wants it to calculate
     */
    public static void main(String[] args) {
        CalculatingPi pi = new CalculatingPi(); //makes an object to calculate
        //PT -- good that you're checking the array before using it
        if (args.length>0)//checks if there is an argument passed in
        pi.Calculate(Integer.parseInt(args[0]));//converts the arguments into an integer
        else
            pi.Calculate(200000);//if there is no argument given, it'll calculate 200,000 terms
    }
}