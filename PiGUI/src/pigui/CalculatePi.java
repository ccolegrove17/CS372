/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pigui;

import java.math.*;

/**
 * This class computes the terms of the infinite series.
 *
 * @author ccolegrove17
 */
//PT -- why not reuse from the calculatingpi package, rather than copy/paste this class. -2
public class CalculatePi {

    /**
     * Calculates the Gregory-Leibniz value of pi
     *
     * @param times the number of times it will go through the loop
     */
    public double Calculate(int times) {//passes in how many times it will iterate
        double denominator = 1;
        double sum = 0;
        for (int i = 0; i < times; i++) {//runs as many times as specified by passed in parameter
            sum += java.lang.Math.pow(-1, i) * (double) 4 / denominator;//math of the infinite series
            denominator += 2;//increases the denominator as part of the function
        }
        return sum;
    }

    /**
     * Calculates the Nilakantha value of pi
     *
     * @param times the number of times it will go through the loop
     */
    public double Calculate2(int times) {
        double denominator = 2;
        double sum = 3;
        for (int i = 0; i < times; i++) {
            sum += java.lang.Math.pow(-1, i) * (double) 4 / (denominator * (denominator + 1) * (denominator + 2));
            denominator += 2;
        }
        return sum;
    }
}
