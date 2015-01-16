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
public class Rectangle extends Shape {

    int width, height;

    /**
     * Constructor for rectangles
     *
     * @param width width of the rectangle
     * @param height height of the rectangle
     * @throws IllegalArgumentException
     */
    public Rectangle(int width, int height) throws IllegalArgumentException {
        if (width <= 0 || height <= 0) {//if the rectangle has side lengths of zero or less
            throw new IllegalArgumentException("Rectangle side lengths must be greater than zero.");//throws an exception
        }
        this.width = width;//sets the width
        this.height = height;//sets the height
    }

    /**
     *
     * @return the name of the shape.
     */
    @Override
    public String toString() {
        return "Rectangle";//the name of the class
    }

    /**
     *
     * @return the area of the rectangle.
     */
    @Override
    public double getArea() {
        return width * height;//returns the area
    }

    /**
     *
     * @return the perimeter of the rectangle.
     */
    @Override
    public double getPerimeter() {
        return width * 2 + height * 2;//returns the perimeter
    }

}
