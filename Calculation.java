/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavideos;

/**
* This java file is meant to serve as an example of calculations you can
* do inside of java. 
 */
public class Calculation {
    public static void main(String args[]){

        //declares a varibles called number 
        int number = 10;
        
        //declare an integer var called numberTwo
        int numberTwo = 30;
        
        //declares an empty sum variable
        int sum = 0;
        
        //outputs the number variable
        System.out.println(number);
        //adds 4 to the number variable
        number += 4;
        
        //outputs the new number 
        System.out.println(number);
        
        
        //post increment operator on the number variable
        System.out.println(++number);
        
        //adds the two numbers together and outputs the result
        System.out.println(number + numberTwo);
        
        //Adds the two number variables together and stores them as 
        //the sum variable and then outputs the sum
        sum = number + numberTwo;
        System.out.println(sum);
        
        //multiplies the numbers together
         System.out.println(number * numberTwo);
         
        //divides second number by the first number
         System.out.println(numberTwo / number);
        
    }
    
    
}
