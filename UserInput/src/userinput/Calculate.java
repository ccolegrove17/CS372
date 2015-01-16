/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

/**
 *
 * @author ccolegrove17
 */
public class Calculate {

    /**
     *
     * @param num an array of 10 integers.
     * @return returns the maximum integer in the array.
     */
    public int Max(int[] num) {
        int max = num[0];//starts max at the first number
        for (int i = 1; i < num.length; i++) { //goes through the integer array
            if (num[i] > max) //if the number is larger than the last
            {
                max = num[i]; //it's the new max
            }
        }
        return max; //return the max
    }

    /**
     *
     * @param num an array of 10 integers.
     * @return returns the minimum integer in the array.
     */

    public int Min(int[] num) {//same as Max function but with minimum
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        return min;
    }

    /**
     *
     * @param num an array of 10 integers.
     * @return returns the average of the integers in the array.
     */
    public double Average(int[] num) {
        int sum = 0; //integer sum starts at zero
        for (int i = 0; i < num.length; i++) { //goes through the integer array
            sum += num[i]; //adds the number to the sum
        }
        return (double) sum / num.length; //divides the sum by the number of numbers
    }

}
