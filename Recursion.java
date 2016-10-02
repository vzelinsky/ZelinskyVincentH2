/* Recursion.java
 * Written by Vincent Zelinsky
 * 
 * A class to test recursive classes and principles
 */
import java.util.Scanner;

public class Recursion {
  
  public static void main (String[] args){
    
    //Creates a Scanner object called scanner
    Scanner scanner = new Scanner(System.in);
    //Creates a Babylonian object called squareRoot and passes 9 to it
    Babylonian squareRoot = new Babylonian(9);
    
    //Calls the calcSquareRoot method of Babylonian and prints to console
    System.out.println(squareRoot.calcSquareRoot());
  }
}