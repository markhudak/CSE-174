/*
 * Mark Hudak
 * Instructor: Meisam Amjad
 * CSE174, section: B
 * 04/26/2020
 * Program12.java
 * Description: This program produces a 3 x 3 version of Soduko that allows user input to select
 * row column and value after a 3x3 grid is populated with the first three values randomly given to
 * begin the game.
 */

import java.util.Scanner;
public class Program12 {
   public static Scanner in = new Scanner(System.in);
   
   
   /** Method getInput prints the parameter string; initializes an array and then uses a for loop 
     * to place user input values into array.
     * param@ String str
     * return@ int[]
     */
   public static int[] getInput(String str) {
      System.out.println(str);
      
      int[] intArr = new int[3];
      
      for(int i = 0; i < 3; i++) 
      {         
         intArr[i] = in.nextInt();    }
      
      return intArr;
   }
   
   
   /** Method rnd receives min and max paramater integers and produces a random number between the
     * min and max.
     * param@ int min and int max
     * return@ int
     */
   public static int rnd(int min, int max) {
      
      int randm = (int)(Math.random() * max-min+1) + min;
      
      return randm;
   }
   
   
   /** Method isDone checks the value of each index of the 2d array to see if the game is complete
     * or not. Will return boolean result to relay whether game is finished or not.
     * param@ int[][] arr
     * return@ boolean
     */
   public static boolean isDone(int[][] arr) {
      
      for ( int i = 0; i < arr.length; i++) {
         for ( int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == 0) return false;
         }
      }
      return true;
   }
   
   /** Method acceptVal receives a 2d array as parameter and ensures that rows and columns are free
     * of user input duplicates as per rules of the game. Will not allow and have user re-input.
     * param@ int[][] arr
     * return@ boolean
     */
   public static boolean acceptVal(int[][] arr) {
      
      boolean flag = true;
      
      for (int r = 0; r < 3; r++) {
         
         if (arr[r][0] == arr[r][1] && arr[r][0] != 0) flag = false;
         if (arr[r][0] == arr[r][2] && arr[r][0] != 0) flag = false;
         if (arr[r][1] == arr[r][2] && arr[r][1] !=0) flag = false;
         
      }
      
      for (int c = 0; c <3 ; c++) {
         
         
         if (arr[0][c] == arr[1][c] && arr[0][c] != 0) flag = false;
         if (arr[0][c] == arr[2][c] && arr[0][c] != 0) flag = false;
         if (arr[1][c] == arr[2][c] && arr[1][c] !=0) flag = false;
         
         
         
      }
      return flag;
   }
   
   public static void display(int[][] arr) {
      int i = 0, j = 0;
      for (int[] row: arr) {
         for (int col: row) {
            System.out.printf("%-15s", "["+ i + " " + (j++) +"]: " + col);
         }
         i++;
         j = 0;
         System.out.println();
      }
      System.out.println("--------------------------");
   }
   
   public static void initial(int[][] arr) {
      int val = 0, col = 0;
      boolean check = true;
      
      for (int i = 0; i < 3; i++) {
         do {
            check = true;
            val = rnd(1, 3);
            col = rnd(0, 2);
            arr[i][col] = val;
            if (!acceptVal(arr)) {
               check = false;
               arr[i][col] = 0;
            }
         } while (!check);
      }
   }
   
   public static void main(String[] args) {
      int[][] arr = new int[3][3];
      int val = 0, col = 0, row = 0;
      boolean check = true;
      
      initial(arr);
      
      while (!isDone(arr)) {
         display(arr);
         
         do {
            check = true;
            
            int[] inputs = getInput("Enter your move [row col num]: ");
            row = inputs[0];
            col = inputs[1];
            val = inputs[2];
            
            if (val < 1 || val > 3 || row < 0 || row > 2
                   || col < 0 || col > 2) {
               check = false;
               continue;
            }
            arr[row][col] = val;
            if (!acceptVal(arr)) {
               check = false;
               arr[row][col] = 0;
               
            }
         } while(!check);
      }
      
      display(arr);
      System.out.println("End!");
   }
}