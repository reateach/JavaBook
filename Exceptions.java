/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javavideos;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Exceptions {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        //declares integer variables
        int userNumber = 0;
        int secondNumber = 0;
        int result = 0;
        //start of a try catch which as the user to enter two numbers 
        //and then sets those numbers equal to the variables 
        try{
        System.out.print("Enter you number: ");
        
        userNumber = input.nextInt();
        
        System.out.print("Enter you other number: ");
        
        secondNumber = input.nextInt();
        //tries to divide the two numbers 
        result = userNumber / secondNumber;
        
        //outputs the user number
        System.out.println("Your number is " + userNumber);
        
        System.out.println("Your result is " + result);
        }
        //this line s catches the InputMismatchException if the user enters 
        //anything but the expected data types
        catch(InputMismatchException error){
            System.out.println("You have and error");
        }
        //catches the Arithmetic error if the user tries to divide by zero
        catch(ArithmeticException mathError){
            System.out.println("You have a math error");
        }
        
    }
}
