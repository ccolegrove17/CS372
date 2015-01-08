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
public class Bread extends FoodItem {

    public Bread(int weight, int volume) {
        super(weight, volume);
        name = "Bread";
    }

    public void Toast() {
        System.out.println("toasting ...");
    }
}
