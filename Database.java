/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectingtodatabase;

import java.sql.*;
public class Database {
    public static void main(String args[]){
        //creates empty variables for both the connection and the stamement
        Connection conn = null;
        Statement stment = null;
        
        //try catch in case something cannot be done in the database
        try
        {
            //creates a conn object for the database
            conn  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "password");
            //tells the user that they are connected to the database
            System.out.println("You are connected to the server!");
            //prepares the database to accept statment from the statement variable
            stment = conn.createStatement();
            
            //creates an sql string to create a table with three fields
//            String sql = "CREATE TABLE WORKERS" +
//                    "(ID INT PRIMARY KEY NOT NULL," +
//                    "NAME TEXT NOT NULL," + 
//                    "AGE INT NOT NULL)";

//            //executes the sql 
//            stment.executeUpdate(sql);
//            
              //tells the user that the table was made successs
//            System.out.println("Table create success!");



//--------------break----------------------------------


              //creates a sqk string to insert records into the table
//            String sql = "INSERT INTO WORKERS (ID, NAME, AGE) " +
//                    "VALUES(2, 'Tom', 50);";
//            
              //executes the sql on the table
//            stment.executeUpdate(sql);
//            
                //tells the user that the insert was successful
//            System.out.println("Insert was a success!");
//
                //select statemtent to view the contents of the table
//              String sqlTwo = "SELECT * FROM WORKERS;";
//              
                //outputs the results and saves them in the resultSet variable
//              ResultSet results = stment.executeQuery(sqlTwo);
//              
                //while statement that will go through the table and as long as 
                //there are results in the table
//              while(results.next()){
                    //stores the id, name and age into there respective variables
//                  int id = results.getInt("ID");
//                  String name = results.getString("NAME");
//                  int age = results.getInt("AGE");
//                  
                    //outputs the id, name, and age of each record 
//                  System.out.println("Id = " + id);
//                  System.out.println("Name = "+ name);
//                  System.out.println("Age = " + age);
//              }
                //closes the result set
//              results.close();

            
                  //creates a sql string to update a record in the workers table
                  //for a specified record
//                String sql = "UPDATE WORKERS set AGE = 60 WHERE ID = 1;";
                
                  //executes the sql statment
//                stment.executeUpdate(sql);
//                
                  //tells the user that the update was a success
//                System.out.println("Update success!");

        
                  //creates an sql statement to delete a record from the workers 
                  //table
                  String sql = "DELETE FROM WORKERS WHERE ID = 1;";
                  
                  //executes the sql statement to delete the record
                  stment.executeUpdate(sql);
                  
                  String sqlTwo = "SELECT * FROM WORKERS;";
              
              ResultSet results = stment.executeQuery(sqlTwo);
              
              while(results.next()){
                  int id = results.getInt("ID");
                  String name = results.getString("NAME");
                  int age = results.getInt("AGE");
                  
                  System.out.println("Id = " + id);
                  System.out.println("Name = "+ name);
                  System.out.println("Age = " + age);
              }
              results.close();



  
            

         //this will catch the exception that will occur if the database is not found   
        }catch(Exception e){
            //outputs the message to the user
            System.out.println("Message: " + e);
        }
    }
}
