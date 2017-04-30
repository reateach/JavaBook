/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavideos;

/**
 *
 * @author Trevon Kitchen
 */
public class AbsClasses {
    public static void main(String args[]){
      Car myCar = new Car();
      
      myCar.setDesc("This is a nice car");
      
      System.out.println(myCar.getDesc() + " and ");
      myCar.year();
    }
}

abstract class Vehicle 
{
  private String vehicleDesc;
  public abstract void year();
  public String getDesc()
  {
     return vehicleDesc;
   
  }
  public void setDesc(String description)
  {
     vehicleDesc = description;
  }
}

class Car extends Vehicle
{
   @Override
   public void year()
   {
      System.out.println("The year of this car is 2001");
   }
}