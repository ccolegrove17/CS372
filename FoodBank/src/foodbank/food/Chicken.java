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
public class Chicken extends FoodItem {

    public Chicken (int weight, int volume) {
        super(weight, volume);
        name = "Chicken";
    }

    public void Cooking() {
        System.out.println("removing salmonella ...");
    }
}