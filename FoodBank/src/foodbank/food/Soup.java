/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodbank.food;

/**
 *
 * @author ccolegrove17
 */
public class Soup extends FoodItem {

    public Soup(int weight, int volume) {
        super(weight, volume);
        name = "Soup";
    }

    public void Heat() {
        System.out.println("Mmm mmm good");
    }
}
