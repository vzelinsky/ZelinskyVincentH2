/* Babylonian.java
 * Written by Vincent Zelinsky
 * 
 * A class to approximate a square root of a given number within a certain margin of error using the Babylonian method
 */
public class Babylonian {
  
  //Private field number
  private double number;
  private double guess;
  
  //Creates a constructor that accepts a double value
  public Babylonian(double input){
    this.number = input;
  }
  
  //Getter method for number
  public double getNumber(){
    return number;
  }
  
  //Creates a method that will calculate square root
  public double calcSquareRoot(){
    guess = 0.5*number;
    return guess;
  }
}