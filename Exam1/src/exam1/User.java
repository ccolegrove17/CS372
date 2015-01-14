/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.io.*;

/**
 *
 * @author ccolegrove17
 */
public class User {

    private String username;
    private int money;

    /**
     * Constructor for users.
     * @param username name passed in
     * @param money money passed in
     */
    public User(String username, int money) {
        this.username = username;//sets the name for the user
        this.money = money;//sets the money for the user
    }

    /**
     * 
     * @return how much money the user has
     */
    public int getMoney() {
        return money;
    }

    /**
     * 
     * @return the name of the user
     */
    public String getName() {
        return username;
    }

    /**
     * sets the user's name
     * @param username what the username should be set to
     */
    public void setName(String username) {
        this.username = username;
    }

    /**
     * Places the bet. Called by all 3 betting buttons.
     * @param bet how much the user bet
     * @param roll what the result of the roll was
     * @param min what the minimum result could be for a victory
     * @param max what the maximum result could be for a victory
     * @param multiplier how much more than the bet the user could win
     * @return a string detailing the result of the bet
     * @throws Exception if the user tries to give illegal betting values
     */
    public String placeBet(int bet, int roll, int min, int max, int multiplier) throws Exception {
        if (bet > getMoney()) {//if the user doesn't have enough money
            throw new Exception();//throws an exception
        }
        if (bet <= 0) {//if their bet is zero or less
            throw new IllegalArgumentException();//throws an exception
        }
        if (roll >= min && roll <= max) {//if the roll was within the victory conditions
            setMoney(money + bet * multiplier);//adds the bet*multiplier to the user's money
            return "Congratulations! You won $" + bet * multiplier + "!";//returns a string detailing the results
        } else {//if the roll wasn't within the victory conditions
            setMoney(money - bet);//takes the bet out of the user's money
            return "Too bad! You lost $" + bet + ".";//returns a string detailing the results
        }
    }

    /**
     * sets how much money the user has and writes it to a text document
     * @param money what the new amount of money is
     */
    public void setMoney(int money) {
        this.money = money; //sets the user's money
        String filename = username + ".txt";//filename is simply the username
        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(filename));//writes to the file
            wrtr.write("" + money);//puts how much money the user has into the file
            wrtr.close();//closes the file
        } catch (Exception ex) {//if something went wrong
            System.out.printf("Error: %s", ex.getMessage());//displays the error message in the console
        }
    }
}
