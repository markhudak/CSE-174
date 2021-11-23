 /*
  * Name: Mark Hudak
  * Instructor: Meisam Amjad
  * CSE 174, Section B
  * Date: February 21, 2020
  * Filename: IsEvenOdd.java
  * Description: This program reads a 3 digit positive integer from the input then outputs the sum
  * of those digits added together as well as whether the sum is even or odd.
  */

//importing Scanner class
import java.util.Scanner;

public class IsEvenOdd {
   
   public static void main(String[] args) {
      
      // Here we take advantage of the imported Scanner Class to allow some user input.
      Scanner keyboard = new Scanner (System.in);
      
      System.out.printf("Enter a three-digit positive number: ");
      int numUI = keyboard.nextInt();
      
      // Below I am using modulus along with some simple math to declare and separate each 
      // individual number.
      int _1stDig = (numUI - (numUI % 100))/100;
      int _2ndDig = ((numUI % 100) - (numUI % 10))/10;
      int _3rdDig = numUI % 10;
      
      // Below I am obtaining the sum of the three digits
      int numSum = (_1stDig + _2ndDig + _3rdDig);
      
      // Below is a ternary opertor to declare whether the sum is Even or Odd
      String evenOdd = ((numSum % 2) == (4 % 2)) ? ("Even"):("Odd");
      
      // Below we are printing the results in a legible form.
      System.out.printf("** sum is %d and %s **", numSum, evenOdd);         
   }
}