/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavideos;

/**
 * This java file is supposed to serve as an Example of how to use arrays.
 */
public class Arrays {
    public static void main(String args[]){
        //declares an ages array and puts values into it
        int[] agesArray = {12, 13,15,15,10};
        
        //delcares and empty array of size 30
        int[] studentsArray = new int[30];
        
        //outputs the array element in the 2nd position
        System.out.println(agesArray[2]);
        
        //stores a value in the 0 position in the student array
        studentsArray[0] = 2345;
        
        //outputs the element in the student array at position 0
        System.out.println(studentsArray[0]);
        
        //a for loop to go through each element in the students array
        for(int i:studentsArray)
        {
        System.out.println(i);
        }
        
        //creates a multi dimensional array of 5 x 5 size
        int[][] multiArray = new int[5][5];
        
        //inputs the number 30 in the 0 x 0 position in the array
        multiArray[0][0] = 30;
        
        //create a jagged array of 3 arrays
        int[][] jaggArray = new int[3][];
        
        //creates an array in the jagged array 
        jaggArray[0] = new int[]{2,3,5};
        
        
 

    }
    
}
