/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package area.of.a.circle;
import java.util.Scanner; //scanner import
/**
 * This class calculates the area of a circle when the user provides a radius.
 * @author ccolegrove17
 */
public class AreaOfACircle {
    
    /**
     * This function uses a circle's radius to find its area.
     * @param radius value of radius given by the user
     * @return area of the circle
     */
    
    public static double calculateArea(float radius){
        final double pi = 3.14; //PT: better to use java.lang.Math.PI
        double area = pi*radius*radius;
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("Radius: ");
        Scanner input = new Scanner(System.in); //make input stream
        float radius = input.nextFloat(); //make the float radius
        System.out.printf("The area of the circle is %f.\n", calculateArea(radius));        
    }
    
}
