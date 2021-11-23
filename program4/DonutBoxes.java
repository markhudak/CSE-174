/*
 * Name: Mark Hudak
 * Instructor: Meisam Amjad
 * CSE 174, Section B
 * Date: February 23, 2020
 * Filename: DonutBoxes.java
 * Description: This program will take user input for how many donuts there are and assess how many
 * boxes will be needed when putting 12 donuts in a box. 
 */

// Test cases:
// These work correctly: -12, -1, 0, 27, 36, 56, 199, 1000, 1564, 2234
// No issues identified in a range test of negative to positive integers; if wanting to use this 
// program to see how many boxes to save if we are discussing a negative amount of donuts, it works
// sufficiently and will give a negative result representing how many boxes you would not need. 

import java.util.Scanner;

public class DonutBoxes {
   
   public static void main(String[] args) {
      
      Scanner keyboard = new Scanner (System.in);
      
      System.out.printf("How many donuts? ");
      int numDon = keyboard.nextInt();
     
      // Below I am declaring two variables; one for the number of donuts input divided by 12 (with
      // out remainder), and another for just the remainder of the number of donuts by 12.
      
      int numBoxR = (numDon % 12);
      int numBoxWOr = (numDon / 12);
      
      // Below I included an if statement. If the above remainder is above zero it will add 1 box
      // to the variable for the donuts that was just purely dividided by twelve. Using the int
      // rather than a double allows me to manipulate the division and modulus in this way. The
      // remainder should never be more than what would be needed in one box
      
      if (numBoxR > 0)
      {
         numBoxWOr += 1;
      }
      
      // Below is a second if statement. This corrects for the range of (0, -12). Instead of a
      // result of 0 I have adjusted the program to deliver a result of -1 for any integers within
      // that range as to represent the 1 box they would not need.
      
      if (numBoxR < 0 && numBoxR > -12)
      {
         numBoxWOr += -1;
      }
      
      // Below is pringing out our final results after the above if statement has made any 
      // potential adjustments.
      
      System.out.printf("You will need %d boxes for the donuts.", numBoxWOr);      
   }
}