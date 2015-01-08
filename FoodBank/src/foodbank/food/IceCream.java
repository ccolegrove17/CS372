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
public class IceCream extends FoodItem {

    public IceCream(int weight, int volume) {
        super(weight, volume);
        name = "Ice Cream";
    }

    public void Melt() {
        System.out.println("melting ...");
    }
}