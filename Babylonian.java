/* Babylonian.java
 * Written by Vincent Zelinsky
 * 
 * A class to approximate a square root of a given number within a certain margin of error using the Babylonian method
 */
import java.util.Scanner;

public class Babylonian {
  //Creates scanner object
  Scanner scanner = new Scanner(System.in);
  
  //Private field number
  private double number;
  private double iguess;
  private double nguess;
  private double error;
  
  //Creates a no argument constructor that prompts the user for field values
  public Babylonian(){
    System.out.println("Please enter the number you would like to find the square root of: ");
    this.number = scanner.nextDouble(); 
    System.out.println("Please enter acceptable accuracy(within 10,1,0.1,0.01,etc): ");
    this.error = scanner.nextDouble();
  }
  
  //Constructor that accepts number and error
  public Babylonian(double numberInput, double errorInput) {
    this.number = numberInput;
    this.error = errorInput;
  }
  
  //Convenience method
  public double calcSquareRoot(){
    iguess = number*0.5;
    return calcSquareRoot(iguess);
  }
  
  //Overloades the calcSquareRoot method to calculate square root
  public double calcSquareRoot(double nguessInput){
    this.nguess = nguessInput;
    //If the difference between number and nguess^2 is less than error then print nguess
    if (Math.abs((number - (nguess*nguess))) < error ) {
      return nguess;
    }
    //Then recursive call
    else {
      nguess = (nguess+(number/nguess))*0.5;
      return calcSquareRoot(nguess);
    }
    
  }
}