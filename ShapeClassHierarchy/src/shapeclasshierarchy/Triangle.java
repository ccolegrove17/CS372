/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeclasshierarchy;

import java.util.Arrays;

/**
 *
 * @author ccolegrove17
 */
public class Triangle extends Shape {

    int s1, s2, s3;

    /**
     * Constructor for triangles
     *
     * @param s1 one side length
     * @param s2 second side length
     * @param s3 last side length
     * @throws IllegalArgumentException
     */
    public Triangle(int s1, int s2, int s3) throws IllegalArgumentException {
        int[] ints = {s1, s2, s3};//an array of the side lengths
        Arrays.sort(ints);//puts the side lengths in order
        if (s1 <= 0 || s2 <= 0 || s3 <= 0 || ints[0] + ints[1] <= ints[2]) { //checks triangle validity. Thanks, Cyberchase!!
            throw new IllegalArgumentException("This is not a valid triangle.");//throws an exception
        }
        this.s1 = s1;//sets side length
        this.s2 = s2;//sets side length
        this.s3 = s3;//sets side length
    }

    /**
     *
     * @return the area of the triangle.
     */
    @Override
    public double getArea() {
        double p = ((double) s1 + s2 + s3) / 2; //and here I'd like to thank Google
        return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3)); //here as well
    }

    /**
     *
     * @return the name of the shape.
     */
    @Override
    public String toString() {
        return "Triangle";//returns class name
    }

    /**
     *
     * @return the perimeter of the triangle.
     */
    @Override
    public double getPerimeter() {
        return s1 + s2 + s3;//returns perimeter
    }

}
