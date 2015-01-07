/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerbil.map;
import java.util.*;
import gerbil.arraylist.*; //add gerbil class

/**
 * This class makes a map with a name as a key and the gerbil as the value. <br>
 * It makes the gerbils hop and say their name.
 * @author ccolegrove17
 */
public class GerbilMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String,Gerbil> gerbilMap = new HashMap<String,Gerbil>(); //makes a map thingy
        for (int i=0;i<9;i++){ //for loop goes 9 times
            Gerbil g1 = new Gerbil(i); // make my lil gerbil buddy
            String name = "Gerbil" + i; // super creative name for gerbil
            gerbilMap.put(name, g1); //putting the gerbil in the map
        }
        Iterator e = gerbilMap.keySet().iterator(); //make an iterator
        while(e.hasNext()) //as long as there's more stuff
        {
            String name = e.next().toString(); //name of the gerbil
            System.out.printf("Name: %s\n",name); //displays the name
            gerbilMap.get(name).hop(); //makes gerbil hop
        }
    }
}