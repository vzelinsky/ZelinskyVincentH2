/* Babylonian.java
 * Written by Vincent Zelinsky
 * 
 * A class to approximate a square root of a given number within a certain margin of error using the Babylonian method
 */
import java.util.Scanner;

public class Babylonian {
  
  //Private field number
  private double number;
  private double guess;
  private double error;
  
  //Creates a constructor that accepts a double value
  public Babylonian(double input){
    this.number = input;
  }
  
  public Babylonian(double numberInput, double errorInput) {
    this.number = numberInput;
    this.error = errorInput*0.01;
  }
  
  //Getter method for number
  public double getNumber(){
    return number;
  }
  
  //Creates a method that will calculate square root
  public double calcSquareRoot(){
    if (number == 0) {
      return 0;
    }
    else {
      guess = number*0.5;
      return guess;
    }
    
  }
}