/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavideos;

/**
 * this java file is meant to be as an example of how to use loops. 
 */
public class Loops {
    public static void main(String args[]){
        //creates a for loop that goes through and outputs hello world 9 times
//        for(int i = 1; i < 10; i++)
//{
//    System.out.println("Hello World");
//}

//declares a counter to go through the while loop
//int counter = 1;

//-----------break ----------------
//this while loop goes until the counter reaches 9. 
//while (counter< 10)
//{
     //outputs what the counter is and then increments it by 2
//   System.out.println(counter + " is less than 10");
//   counter = counter + 2;
//}


//--------------break--------------
//counter variable 
//int counter = 0;
//this do while loop runs through and outputs the counter once and then checks 
//the condition
//do{
//    System.out.println("Counter at: " + counter);
//    System.out.println("You are in the loop");
//    counter = counter + 5; 
//}while(counter <= 20); //checks if the counter is at 20

//for loop that declares a variable i, test to see if it is less than or equal to
//to 5, goes through the loop and then increments it
for (int i = 1; i <= 5; i++)
 {   // outer loop iterates 5 times.
    for (int j = 1; j <= 10; j++) 
    {  // for each iteration of outer loop, 
        // inner loop iterates 10 times
        System.out.print((i * j) + " ");
    }
    System.out.println();
}
    }
}
