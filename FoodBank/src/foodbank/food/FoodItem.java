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
public class FoodItem {
    private int _weight, _volume;
    protected String name;

    public FoodItem(int weight, int volume) {
        _weight = weight;
        _volume = volume;
    }
    
    public int getWeight(){
        return _weight;
    }

    public int getVolume(){
        return _volume;
    }
    
    public String getName(){
       return name; 
    }
    
    public boolean equals(FoodItem food){
        if (this.name == food.getName()){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString (FoodItem food){
        String foodName = food.getName() + "~ Weight: " + _weight + " Volume: " + _volume;
        return foodName;
    }
}
