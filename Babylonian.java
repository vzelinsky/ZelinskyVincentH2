/* Babylonian.java
 * Written by Vincent Zelinsky
 * 
 * A class to approximate a square root of a given number within a certain margin of error using the Babylonian method
 */
public class Babylonian {
  
  //Private field number
  private double number;
  
  //Creates a constructor that accepts a double value
  public Babylonian(double input){
    this.number = input;
  }
  
  //Getter method for number
  public double getNumber(){
    return number;
  }
}