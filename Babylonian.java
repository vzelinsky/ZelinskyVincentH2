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
  
  //Creates a no argument constructor that prompts the user for field values
  public Babylonian(){
    System.out.println("Please enter the number you would like to find the square root of: ");
    this.number = scanner.nextDouble(); 
    System.out.println("Please enter acceptable accuracy(0.1,0.01,etc): ");
    this.error = scanner.nextDouble();
  }
  
  //Constructor that accepts number and error
  public Babylonian(double numberInput, double errorInput) {
    this.number = numberInput;
    this.error = errorInput;
  }
  
  //Getter method for number
  public double getNumber(){
    return number;
  }
  
  //Convience method
  public double calcSquareRoot(){
    return calcSquareRoot(number,error);
  }
  
  //Creates a method that will calculate square root
  public double calcSquareRoot(double numberInput, double errorInput){
    this.number = numberInput;
    this.error = errorInput;
    
    if (Math.abs((number - (guess*guess))) < error ) {
      return guess;
    }
    else {
      guess = number*0.5;
      return calcSquareRoot(guess,error);
    }
    
  }
}