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
public class Alligator extends FoodItem {

    public Alligator(int weight, int volume) {
        super(weight, volume);
        name = "Alligator";
    }

    public void Eating() {
        System.out.println("tastes like chicken ...");
    }
}