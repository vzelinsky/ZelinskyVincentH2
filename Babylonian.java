/* Babylonian.java
 * Written by Vincent Zelinsky
 * 
 * A class to approximate a square root of a given number within a certain margin of error using the Babylonian method
 */
import java.util.Scanner;

public class Babylonian {
  //Creates scanner object
  Scanner scanner = new Scanner(System.in);
  
  //Private fields
  //number to find the square root of
  private double number;
  //initial guess
  private double iguess;
  //new guess (the recursive guess)
  private double nguess;
  //error
  private double error;
  
  //Creates a no argument constructor that when called prompts the user for field values
  /* If I were to redo this program I would instead make setters for the fields number and error.
   * I would put the scanner calls in the convenience method calcSquareRoot instead and set the values before proceeding.
   */ 
  public Babylonian(){
    //Prompts for number field
    System.out.println("Please enter the number you would like to find the square root of: ");
    this.number = scanner.nextDouble();
    //Prompts for error field
    System.out.println("Please enter acceptable accuracy(within 10,1,0.1,0.01,etc of square): ");
    this.error = scanner.nextDouble();
  }
  
  //Constructor that accepts number and error as arguments
  public Babylonian(double numberInput, double errorInput) {
    this.number = numberInput;
    this.error = errorInput;
  }
  
  //Convenience method
  public double calcSquareRoot(){
    //Initial guess is half of the number
    iguess = number*0.5;
    //Calls itself and overloades by passing the inital guess as an argument
    return calcSquareRoot(iguess);
  }
  
  //Overloaded calcSquareRoot method that will recursively calculate square root
  public double calcSquareRoot(double nguessInput){
    //Sets nguess as the value passed to this method
    this.nguess = nguessInput;
    //Base case: If the difference between number and nguess^2 is less than error then return nguess
    if (Math.abs((number - (nguess*nguess))) < error ) {
      return nguess;
    }
    //Recursive call: Calculates and sets new guess using the old guess and passes the value to itself(the method)
    else {
      nguess = (nguess+(number/nguess))*0.5;
      return calcSquareRoot(nguess);
    }
    
  }
}