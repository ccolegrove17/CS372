/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sandbox;
import java.util.Scanner;

/**
 *
 * @author ccolegrove17
 */
public class Sandbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Craig";

        System.out.printf("Hello %s, what is your score? ", name);
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        System.out.printf("Your score is %d.\n", score);
        // TODO code application logic here
    }
    
}
