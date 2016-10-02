/* Babylonian.java
 * Written by Vincent Zelinsky
 * 
 * A class to approximate a square root of a given number within a certain margin of error using the Babylonian method
 */
import java.util.Scanner;

public class Babylonian {
  
  Scanner scanner = new Scanner(System.in);
  
  //Private field number
  private double number;
  private double guess;
  private double error;
  
  //Creates a constructor that accepts a double value
  public Babylonian(){
    System.out.println("Please enter the number you would like to find the square root of: ");
    this.number = scanner.nextDouble(); 
  }
  
  public Babylonian(double numberInput, double errorInput) {
    this.number = numberInput;
    this.error = errorInput;
  }
  
  //Getter method for number
  public double getNumber(){
    return number;
  }
  
  //Creates a method that will calculate square root
  public double calcSquareRoot(){
    if (Math.abs((number - (guess*guess))) < error ) {
      return guess;
    }
    else {
      guess = number*0.5;
      return guess;
    }
    
  }
}