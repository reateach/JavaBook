/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javavideos;
/*
* This file is to serve as a guide of how to use GUI
*/
import javax.swing.JOptionPane;
public class GUI {
    public static void main(String args[])
    {
        
          //declared a string variable called name
//        String name = "";
        
//        //creates an InputDialog that asks the user to enter there name
//        name = JOptionPane.showInputDialog(null, "What is your name", "Enter your name", JOptionPane.INFORMATION_MESSAGE);
        
//        //declares a message dialog
//        JOptionPane.showMessageDialog(null, "Hello " + name + "!");
          
          //creates twon strings for two numbers 
//        String firstNum, secondNum = "";
        
//        //creates two integer variables to store the convert strings
//        int numOne, numTwo = 0;
          
          //total varible to store the sum
//        int total = 0;
//        
          //recieves the first number through an input dialog
//        firstNum = JOptionPane.showInputDialog(null, "Enter first number");
//        
          //parse the string into an integer
//        numOne = Integer.parseInt(firstNum);
//        
          //read in the second number
//        secondNum = JOptionPane.showInputDialog(null, "Enter second number");
//        
          //converts the second number into an integer
//        numTwo = Integer.parseInt(secondNum);
//        
        //adds the two numbers together into a total
//        total = numOne + numTwo;
//        
        //displays the two numbers added and the total
//        JOptionPane.showMessageDialog(null, numOne + " plus " + numTwo + 
//                " equals " + total);
        
        //declares a choice variable
        int choice = 0;
        
        //declares a boolean for if the user click yes or no
        boolean isYes = false;
        
        //reads in the user choice
        choice = JOptionPane.showConfirmDialog(null, "Are you over 18?");
        
        //sets the boolean to yes if the user picks yes
        isYes = (choice == JOptionPane.YES_OPTION);
        
        //outputs the users choice
        JOptionPane.showMessageDialog(null, "You responded " + isYes);
    }
}
