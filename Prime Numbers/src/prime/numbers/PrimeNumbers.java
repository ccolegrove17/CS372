/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prime.numbers;

/**
 *
 * @author ccolegrove17
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)//loop that shows the number being checked (1 to 100)
        {
        boolean isPrime = true; //boolean of if it is prime, starts as yes
            for(int l=2;l<=(i-1);l++) //loop goes from 2 to the outer number
            {
                    if (i%l==0) //if there's no remainder
                        isPrime = false; //sets isPrime to false
            }
            if (isPrime==true) //if isPrime was never set to false
                System.out.printf("%d\n",(int)i); //displays the number
        }
        // TODO code application logic here
    }
}