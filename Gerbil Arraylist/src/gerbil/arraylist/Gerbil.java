/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerbil.arraylist;

/**
 * This gerbil class will name the gerbil and can make it hop
 * @author ccolegrove17
 */

public class Gerbil {
    public int gerbilNumber;
    /**
     * 
     * @param gerbilNumber The number of the gerbil.
     */
    public Gerbil (int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    
    /**
     * This function makes the gerbil hop and returns nothing.
     */
    
    public void hop(){
        System.out.printf("Gerbil number %d is hopping!\n", (int)gerbilNumber);
    }
    
    
    
}
