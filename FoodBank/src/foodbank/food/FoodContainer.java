/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodbank.food;
import java.util.*;
/**
 *
 * @author ccolegrove17
 */
public class FoodContainer {
    
    private ArrayList<FoodItem> container = new ArrayList<FoodItem>();
    
    public int getWeight()
    {
        int sum = 0;
        for (int i = 0; i<container.size(); i++){
            sum += container.get(i).getWeight();
        }
        return sum;
    }
    
    public int getCount()
    {
       return container.size(); 
    }
    
    public int getVolume()
    {
        int sum = 0;
        for (int i = 0; i<container.size(); i++){
            sum += container.get(i).getVolume();
        }
        return sum;
    }
    
    public void addItem(FoodItem food)
    {
        container.add(food);
        System.out.println(food.toString(food));
    }
}
