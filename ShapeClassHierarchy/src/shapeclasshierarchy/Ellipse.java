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

    /**
     * Constructor for the ellipse
     *
     * @param r1 one radius of the ellipse
     * @param r2 the other radius of the ellipse
     * @throws IllegalArgumentException
     */
    public Ellipse(int r1, int r2) throws IllegalArgumentException {
        if (r1 <= 0 || r2 <= 0) {//if the radii are zero or less
            throw new IllegalArgumentException("Ellipse radii must be greater than zero.");//throws an exception
        }
        this.r1 = r1;//sets the radius
        this.r2 = r2;//sets the radius
    }

    /**
     *
     * @return the name of the shape.
     */
    @Override
    public String toString() {
        return "Ellipse";//the name of the class
    }

    /**
     *
     * @return the area of the ellipse.
     */
    @Override
    public double getArea() {
        return Math.PI * r1 * r2;//sets the area
    }

    /**
     *
     * @return the perimeter of the ellipse.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((r1 * r1 + r2 * r2) / 2);//sets the perimeter
    }
}
