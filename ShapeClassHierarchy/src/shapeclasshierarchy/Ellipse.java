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
public class Ellipse extends Shape {

    int r1, r2;

    public Ellipse(int r1, int r2) throws IllegalArgumentException {
        if (r1 <= 0 || r2 <= 0) {
            throw new IllegalArgumentException("Ellipse radii must be greater than zero.");
        }
        this.r1 = r1;
        this.r2 = r2;
    }
    
    /**
     * 
     * @return the name of the shape.
     */
    @Override
    public String toString() {
        return "Ellipse";
    }

    /**
     *
     * @return the area of the ellipse.
     */
    @Override
    public double getArea() {
        return Math.PI * r1 * r2;
    }

    /**
     *
     * @return the perimeter of the ellipse.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((r1 * r1 + r2 * r2) / 2);
    }
}
