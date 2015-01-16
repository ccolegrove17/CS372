/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

import java.util.Scanner;

/**
 *
 * @author ccolegrove17
 */
public class UserInput {

    /**
     * Takes in 10 integers and throws an exception of non-integers are
     * inputted.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculate c = new Calculate(); //new calculate object
        System.out.println("Input 10 integers:"); //simple output
        Scanner s = new Scanner(System.in); //new scanner
        int[] num = new int[10]; //array of 10 integers
        for (int i = 0; i < 10; i++) { //for loop for the array
            try { //tries to do this
                System.out.printf("%d. ", i + 1); //displays the number of integer it is
                num[i] = s.nextInt(); //gets an integer from the user
            } catch (Exception e) { //if the user didn't give an integer
                System.out.println("Please input a valid integer."); //gives a nice message
                s.nextLine(); //to ignore the bad input
                i--; //decrements counter to redo that run of the loop
            }
        }
        System.out.printf("Max: %d\nMin: %d\nAverage: %.1f\n", c.Max(num), c.Min(num), c.Average(num)); //output all the values
    }

}
