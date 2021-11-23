/*
 * Mark Hudak
 * Instructor: Meisam Amjad
 * CSE174, section: B
 * 04/12/2020
 * Program10.java
 * Description: This program takes user input for number of lockers (which will be same as number
 * of students). Starting with the firt stage, the first student opens all lockers (represented by 
 * 'O'). The second stage, the second student will alter the position of each locker divisible by 
 * 2, third student will alter every locker divisble by 3, and the pattern continues. User has 
 * option to see stages or go directly to the results which will show you which lockers are open 
 * at the end of all stages.
 */

import java.util.Scanner;

public class Program10 { 
   
   static Scanner ui = new Scanner (System.in);
   
   public static void main (String[] args){    
      
      System.out.printf("How many lockers? ");
      int numLock = ui.nextInt();
      
      // initializing boolean array; all lockers start as false; closed; 'X'.
      boolean[] oORc = new boolean[numLock];  
      
    
      divBy(oORc);   // see method below
      
      
   }
   
   /** Method print uses an enhanced for-each loop to run through the boolean array, identify open
     * lockers (which will be true) in the boolean array as 'O' and closed lockers (false) as 'X' 
     * and prints the results for each stage.
     * param@ boolean[] array
     * return@ void
     */
   public static void print(boolean[] array) {
      
      for (boolean status: array) 
         System.out.print(status?"O": "X");
      
      System.out.println();      
   }
   
    /** Method divBy uses a for loop within a for loop to run through each student (stage) and
      * each locker in the boolean array. An if statement is used to determine which lockers will
      * be getting altered in each stage. The user then has the option to view or disregard these
      * stages. The end result is printed showing how many lockers are open after the final stage.
      * param@ boolean[] array
      * return@ void
      */
   public static void divBy(boolean[] array) {
      System.out.printf("Show stages? yes/no");
      String answer = ui.next(); 
      for (int s = 1; s <= array.length; s++) {       
         for (int l = 0; l < array.length; l++) {
            if ((l+1) % s == 0) array[l] = !array[l];          
         }
         if (answer.charAt(0) == 'y') print(array);}
      System.out.print("Open: ");
      for (int i = 0; i<array.length; i++) {
         if (array[i] == true) {
            System.out.print(i+1 + ", "); 
            
         }
      }
   }
   
}

        

     
