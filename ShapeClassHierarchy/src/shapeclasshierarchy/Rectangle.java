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

    public Rectangle(int width, int height) throws IllegalArgumentException {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Rectangle side lengths must be greater than zero.");
        }
        this.width = width;
        this.height = height;
    }

    /**
     * 
     * @return the name of the shape.
     */
    @Override
    public String toString(){
        return "Rectangle";
    }
    
    /**
     * 
     * @return the area of the rectangle.
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * 
     * @return the perimeter of the rectangle.
     */
    @Override
    public double getPerimeter() {
        return width * 2 + height * 2;
    }

}
