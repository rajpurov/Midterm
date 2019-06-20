/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the operation
 *
 * @author sivagamasrinivasan
 * date 06/20
 */
public class ArithmeticBase 
{
 public double x,y;
    double calculate(double x, double y) 
        {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter 1 for Addition \n"+
                           "Enter 2 for Subtraction\n"+
                           "Enter 3 for Multiplication\n"+
                           "Enter 4 for Division");
        int s = input.nextInt();
        
       if(s == 1)
       {
           return x+y;
        }
       else if(s == 2)
       {
           return x-y;
       }
       else if(s == 3)
       {
           return x*y;
       }
       else if(s == 4)
       {
           return x/y;
       }
       else
       {
           throw new IllegalArgumentException("Something went wrong, Try to write string value"); 
       }
    }
   
}
