/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookiesales;

/**
 * This calculates the money from the sales and the total boxes sold.
 *
 * @author ccolegrove17
 */
public class CookieSales {

    int thinMints = 0, samoas = 0, chocolateChip = 0; //at the start, no money has been earned
    int thinMintsNumber = 0, samoasNumber = 0, chocolateChipNumber = 0;//at the start, no boxes have been sold

    /**
     * Adds Thin Mint sales
     *
     * @param number how many boxes are sold
     */
    public void addThinMints(int number) { //add the thin mint sales and boxes sold
        thinMintsNumber += number; //number of boxes sold just goes up by how many sold
        thinMints += number * 3; //sales goes up by $3 for every box sold
    }

    /**
     * Adds Samoas sales
     *
     * @param number how many boxes are sold
     */
    public void addSamoas(int number) {//add the samoas sales and boxes sold
        samoasNumber += number;//number of boxes sold just goes up by how many sold
        samoas += number * 4;//sales goes up by $4 for every box sold
    }

    /**
     * Adds Chocolate Chip sales
     *
     * @param number how many boxes are sold
     */
    public void addChocolateChip(int number) {//add the chocolate chip sales and boxes sold
        chocolateChipNumber += number;//number of boxes sold just goes up by how many sold
        chocolateChip += number * 5;//sales goes up by $5 for every box sold
    }
}
