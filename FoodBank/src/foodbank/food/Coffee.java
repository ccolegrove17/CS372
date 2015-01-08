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
public class Coffee extends FoodItem {

    public Coffee(int weight, int volume) {
        super(weight, volume);
        name = "Coffee";
    }

    public void Grind() {
        System.out.println("grinding ...");
    }
}
