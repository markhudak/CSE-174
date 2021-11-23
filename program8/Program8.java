/*
 * Mark Hudak
 * Instructor: Meisam Amjad
 * CSE174, section: B
 * 03/31/2020
 * Program8.java
 * Description: This program displays a menu (1-4) allowing a user to select an option and 
 * obtain the length (# of digits within) a number, obtain a specific digit within a number based 
 * on index, manipulate the number by shifting the digits of said number to the right n number
 * of times, and exit the program.
 */

import java.util.Scanner;

public class Program8 { 
   
 // Below I am declaring a few global variables to use throughout my methods.
   
   static int length = 0;
   static int num1, num2;
   static Scanner ui = new Scanner (System.in);
   
   public static void main (String[] args){
      
      // initialize local variable as a dummy variable
      int uiNum = 0;
      
      // construct the while loop so the menu displays continuously until user inputs 4
      while( uiNum != 4 ){
      
         // made a private method called menu to conserve space and cleanness of code 
         menu();         
         
         // set local variable equal to user input
         uiNum = ui.nextInt();
         
         // set if condition to respond to invalid input from user
         if (uiNum < 1 || uiNum > 4) System.out.println("\nInvalid input\n");    
         
         // establish my switch case to pair with the menu method and create a useable program
         // which makes use of three separate private methods which will allow user to make use of
         // methods displayed on the menu
         switch(uiNum) {
            case 1:    
               case1();            
               break;
            case 2:
               case2();
               break;
            case 3:
               case3();
               break;              
         }
      }
   }
   
  /**
    * Method setLength determines how many single digits are in a number.
    * Returns nothing.
    * @param num - integer value
    * @return void
    */ 
   public static void setLength (int num){
      
      int numL = 0; 
      if ( num == 0 ) numL = 1; 
      while (num !=0 ){
         
         num = num / 10;
         numL++ ;
         
      }
      
      length = numL;
      
   }
   
   /**
    * Method digitAt well take user input number and user input index and return digit at said 
    * index within said number.
    * Returns the digit at index within num
    * @param ind The index value.
    * @param num The integer value.
    * @return digit at index.
    */ 
   public static int digitAt (int index, int num){
      
      setLength(num);
      int i = 0;
      if ( num < 0 ) num *= -1;
      if ( index < 0 || index > num ) return 0;
      while ( i < index ) {
         
         num /= 10;
         i++;
         
      }
      
      return num%10;
      
   }
   
   /**
    * Method rotateRight well take user input number and user input n and return number after
    * it's digits have been rotated n times to the right.
    * Returns new number.
    * @param n The index value - how many times to rotate right
    * @param num The integer value.
    * @return new number after digits have been rotated
    */ 
   public static int rotateRight (int n, int num){
      
      setLength(num);
      int i = 1;
      
      if ( n < 0 || n > length ) return num;
      
      
      while ( n > 0 ) {
         
         if (digitAt(0, num) == 0) i = 10;
         
         if (num < 0) {
            
            num *= -1;
            num = (num + ((int)(digitAt(0, num) * (Math.pow(10, length)*i))))/10;
            num *= -1;
            
         }
         
         else {
            
            num = (num + ((int)(digitAt(0, num) * (Math.pow(10, length)*i))))/10;
            
         }
         
         n--;
         
      }  
      
      return num;
      
   }  
   
   /**
    * Method menu will display a 1-4 menu of options for the user
    * Returns nothing.
    * Will print Strings withing printf statements
    */ 
   private static void menu(){
      
      System.out.printf("Program8\n1) Get a number of digits\n2) Get a digit\n");
      System.out.printf("3) Shift digits to the right\n4) Quit\nChoice:");
   }
   
   /**
    * Method case1 will take user through option one of menu; will collect user input for an int
    * number and then call on setLength with user input and will print out the length
    * Returns nothing.
    */ 
   private static void case1() {
      System.out.printf("Enter an int number: ");
      num1 = ui.nextInt();                  
      setLength(num1);
      System.out.printf("\nThe length of %d is: %d\n\n", num1, length);
      
   }
   
   /**
    * Method cases will take user through option two of menu; will collect user input for an int
    * number and index and then call on digitAt with user input and will print out the digit at the
    * said index within said number
    * Returns nothing.
    */ 
   private static void case2() {
      System.out.printf("Enter an int number: ");
      num1 = ui.nextInt();
      System.out.printf("Enter the index: ");
      num2 = ui.nextInt();
      System.out.printf("\nThe digit at the index of %d is: %d\n\n", num2, digitAt(num2, num1));
   }
   
   /**
    * Method case3 will take user through option three of menu; will collect user input for an int
    * number and then call on rotateRight with user input and will print out the new number
    * Returns nothing.
    */ 
   private static void case3() {
      System.out.printf("Enter an int number: ");
      num1 = ui.nextInt();
      System.out.printf("Enter the index: ");
      num2 = ui.nextInt();
      System.out.printf("\nThe new number is: %d\n\n", rotateRight(num2, num1));
   }  
}


