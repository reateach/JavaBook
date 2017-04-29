/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavideos;

/**
 * This java file is to serve as an example of decision structures.
 */
public class Decisions {
    public static void main(String args[]){
        
        //declares two int variables, firstNum and secondNum
        int firstNum = 45;
        int secondNum = 60;
        
        
        //below is and if statment that compares the first number to the second 
        //number
//        if(firstNum < secondNum){
//            System.out.println(firstNum + " is smaller than " + secondNum);
//        }
//        else
//        {
//           System.out.println(firstNum + " is larger than " + secondNum);
//        }

         //below is an if statement with both an else if condition check and an
         //esle condition. The if statement compares if the first number is larger
         //than 100. The else-if checks if it is greater than 50 and the else catches
         //anything else
//       if(firstNum > 100){
//           System.out.println(firstNum + " is greater than 100");
//       }

//       else if(firstNum > 50){
//           System.out.println(firstNum + " is greater than 50");
//       }
//       else
//       {
//           System.out.println(firstNum + " is less than 100 and less than 50");
//       }
         
        //this is a switch case that check if the rank variable is a certain value
         int rank = 5;
         
         switch(rank){
             case 1:
                 System.out.println("This is rank 1");
                 break;
             case 2:
                 System.out.println("This is rank 2");
                 break;
             case 3:
                 System.out.println("This is rank 3");
                 break;
             case 4:
                 System.out.println("This is rank 4");
                 break;
             case 5:
                 System.out.println("This is rank 5");
                 break;
         }
        
        

    }
}
