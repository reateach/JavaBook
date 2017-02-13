/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadoc;

/**
 *
 * @author Trevon
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This is a basic output for a string
        System.out.print("Hello World");
        //Adding ln to the print statement moves to the next line
        //Notice how the line below is next to the line above because 
        //the above line is just a print statement
        System.out.println("Hello World"); 
        
        //Concating Strings
        //By using the concatination operator I can combine multiple strings
        System.out.println("Hello" + " Mr. Clause");


        //Declaring string varables
        //Below i have declared 2 seperate variables using the String keyword
        String greeting = "Hello! ";
        String name = "Thomas";
        
        //Outputting String variables
        //By simply using the variable in the output statement I can output the
        //string
        System.out.println(greeting);
        System.out.println(name);
        
        //Just like strings I can concatinate variables as well
        
        System.out.println(greeting + name);
        
    }
    
}
