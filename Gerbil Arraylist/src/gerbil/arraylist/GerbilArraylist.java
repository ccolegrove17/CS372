/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerbil.arraylist;
import java.util.*; //for List and ArrayList

/**
 *
 * @author ccolegrove17
 */
public class GerbilArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List gerbilList = new ArrayList(); //makes an ArrayList
        for (int i=1;i<=20;i++) //let's make 20 gerbils
        {
            gerbilList.add(new Gerbil(i)); //add the gerbils to the list
        }
        Iterator e = gerbilList.iterator(); //make an iterator (don't really know what that means, but Data structures wasn't required for this class)
        while(e.hasNext()) //as long as there's more stuff in the iterator
            ((Gerbil)e.next()).hop();// make lil gerbil hop! imperio!
            
        /*for (int i=0;i<=19;i++){
            ((Gerbil)gerbilList.get(i)).hop();    This was how I did it for problem 1
        }
        */
    
    }
    
}
