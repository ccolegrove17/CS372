/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.only;

/**
 *
 * @author ccolegrove17
 */
public class DataOnly {
        int i; //made an integer
        float f; //made a float
        boolean b; //made a boolean
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DataOnly d = new DataOnly(); //made an object
        d.i = 4; //set the object's integer
        d.f = 3.2f; //set the object's float
        d.b=true; //set the object's boolean
        System.out.printf("Integer is %d.\nFloat is %f.\nBoolean is %b.\n", (int)d.i, d.f, d.b); //output the object

        // TODO code application logic here
    }
    
}
