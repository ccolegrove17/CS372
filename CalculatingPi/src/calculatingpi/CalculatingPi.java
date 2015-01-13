/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculatingpi;
import java.math.*;

/**
 * This class computes the terms of the infinite series.
 * @author ccolegrove17
 */

public class CalculatingPi {
    /**
     * 
     * @param times the number of times it will go through the loop
     */
    public void Calculate(int times){//passes in how many times it will iterate
        double denominator = 1;
        double sum = 0;

        //double denominator = BigDecimal(1);//denominator starts at 1
        //int sum=0; //sum starts at 0
        //PT -- As we discussed in class, look for ways to remove redundancy in your code
        for (int i=0;i<times;i++){//runs as many times as specified by passed in parameter
            if (i%2==0)//takes care of if it's plus or minus
                sum += (double)4/denominator;//math of the infinite series
            else//other case for plus or minus
                sum -= (double)4/denominator;//math of the infinite series
            denominator += 2;//increases the denominator as part of the function
            System.out.printf("Term %d: %.16f\n",(int)i+1, sum);//outputs the term number and that calculated value of pi
        }
    }
    
    
}
