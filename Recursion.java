/* Recursion.java
 * Written by Vincent Zelinsky
 * 
 * A class to test recursive classes and principles
 */
public class Recursion {
  
  public static void main (String[] args){
    //Creates a Babylonian object called squareRoot and passes 9 to it
    Babylonian squareRoot = new Babylonian();
    
    //Calls the calcSquareRoot method of Babylonian and prints to console
    System.out.println(squareRoot.calcSquareRoot());
  }
}