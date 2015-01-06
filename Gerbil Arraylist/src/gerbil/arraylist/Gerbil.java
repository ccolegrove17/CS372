/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerbil.arraylist;

/**
 *
 * @author ccolegrove17
 */
public class Gerbil {
    public int gerbilNumber;
    Gerbil (int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    
    void hop(){
        System.out.printf("Gerbil number %d is hopping!\n", (int)gerbilNumber);
    }
    
    
    
}
