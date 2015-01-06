/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package area.of.a.circle;
import java.util.Scanner; //scanner import
/**
 *
 * @author ccolegrove17
 */
public class AreaOfACircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //make input stream
        float radius = input.nextFloat(); //make the float radius
        final double  pi = 3.14; //set pi equal to a constant 3.14
        double area = pi*radius*radius; //calculate area of circle
        System.out.printf("The area of the circle is %f.\n", area); //display area of circle
        
        // TODO code application logic here
    }
    
}
