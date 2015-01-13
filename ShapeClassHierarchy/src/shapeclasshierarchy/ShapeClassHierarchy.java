/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeclasshierarchy;

/**
 *
 * @author ccolegrove17
 */
public class ShapeClassHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Shape s1 = new Triangle(2, 1, 2);
            Shape s2 = new Ellipse(1, 2);
            Shape s3 = new Rectangle(1, 2);
            System.out.printf("%s: Area: %.2f. Perimeter: %.2f.\n", s1, s1.getArea(), s1.getPerimeter());
            System.out.printf("%s: Area: %.2f. Perimeter: %.2f.\n", s2, s2.getArea(), s2.getPerimeter());
            System.out.printf("%s: Area: %.2f. Perimeter: %.2f.\n", s3, s3.getArea(), s3.getPerimeter());

        } catch (IllegalArgumentException ex) {
            System.out.printf("Error: %s\n", ex.getMessage());
        }
    }

}
