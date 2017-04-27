/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavideos;

/**
 * This file is to serve as an example of how to use multiple methods in java.
 * Feel free to customize to fit your needs
 */
public class Methods {
    public static void main(String args[]){
        //creates two local int variable, someNum and otherNum
        int someNum = 12;
        int otherNum = 2;
        
        //calls the multimethod
        multiMethod(someNum, otherNum);
    }
    
    //this is a method that will take two numbers as arguments and multiply them
    //together and give the user the output
    public static void multiMethod(int numberOne, int numberTwo){
        //result variable to store the result
        int result = 0;
        //stores the difference that is returned from the returnMethod()
        int difference = 0;
        
        //calculate the result of the two arguments
        result = numberOne * numberTwo; 
        
        //outputs the result to the user
        System.out.println("Your result is " + result);
        
        //gets the difference of the numbers from the returnMethod()
        difference = returnMethod(result);
        
        //outputs the difference to the user
        System.out.println("Your difference is " + difference);
    }
    
    //this is a method with a return type that takes one arguement
    public static int returnMethod(int aInteger){
        //declares and integer to subtract from the argument that is passed
        int sub = 1;
        // a difference variable to store theresult
        int diff = 0;
        
        //calculates the difference 
        diff = aInteger - sub;
        
        //returns the difference
        return diff;
    }
}
