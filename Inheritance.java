/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavideos;

/*
* This java file is supposed to be an example of how to use inheritence. 
*/
//creates a worker class
class Worker
{
    //creates local worker id an worker number variables
    int workID;
    int workNumber;
//rate of pay method that will be overriden     
 public  void rateOfPay()
 {
     //outputs a workers rate of pay
   System.out.println("This worker is paid $12 an hour");
 }
 
 //a set id method to set the id number
 public void setID(int idNum){
     workID = idNum;
 }
 
 //getid method to get the id number
 public int getID(){
     return workID;
 }
}

//NewWorker class that extends the worker class
class NewWorker extends Worker
{
    //rate of pay method that will override the method of the same name in the 
    //worker method
  public void rateOfPay()
  {
    //outputs a workers rate of pay
    System.out.println("This worker is paid $8 an hour");
  }
}

//main method 
class WorkerTest
{
  public static void main(String args[])
  {
    Worker firstGuy = new Worker(); //worker object but using worker class
    Worker secondGuy = new NewWorker(); //worker object but using the NewWorker class

   firstGuy.rateOfPay();//calls the rate of paymethod for the first object
   secondGuy.rateOfPay();//calls the rate of paymethod for the second object
   
   //sets the second guy object id
   secondGuy.setID(234);
   //gets the objects id
   System.out.println(secondGuy.getID());
  }
}



