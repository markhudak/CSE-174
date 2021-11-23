 /*
  * Name: Mark Hudak
  * Instructor: Meisam Amjad
  * CSE 174, Section B
  * Date: February 23, 2020
  * Filename: SwapLatters.java
  * Description: This program takes a random ten letter word and two randomly selected numbers 
  * between 1-10, then swaps the letters holding those number places within the word.
  */

// So I am getting this one in the last minute. The other two I got pretty quick, but this one for
// some reason held me up. The instructions vs the provided photo example just don't seem to sync 
// up with what is being asked of us, but maybe that is just my misunderstanding. I know this code
// could be cleaner and more compressed; but I do believe this is a fully functioning program for 
// the intended purpose.


public class SwapLetters {
   
   public static void main(String[] args) {
      
      
      String word ="";
      for (int i=0;i<10;i++){
        word += (char)(97 +(int)(Math.random()*(122-97+1)));
      }
      
      System.out.printf("The random word is %s", word);
      
        int randNum1 = (int)(Math.random()*(10+1));
      int randNum2 = (int)(Math.random()*(10+1));
        
        System.out.printf("\nTwo random numbers are: %d and %d\n", randNum1, randNum2);
        
        // Here I subtract 1 from each selected number to align with the index
        int randNum1n = randNum1 - 1;
      int randNum2n = randNum2 - 1;
      
      
      // Here I begin an if statement; withing these next few statements I use substring to break
      // up the word into sections in which I am then able to isolate the characters that need to
      // be swapped. I then use printf to piece the word together how I want. I use an if statement 
      // and run my concatenation two ways. Dependent on which randomly selected number is bigger 
      // than the other, as to avoid issues. And my last else statement just leaving it be if the 
      // randomly selected numbers are the same, for then they would not need be swapped.
      
      if(randNum1n < randNum2n){
      
        String wor1 = word.substring(0, randNum1n);
        String wor2 = word.substring(randNum1n, randNum1n + 1);
        String wor3 = word.substring(randNum1n + 1, randNum2n);
        String wor4 = word.substring(randNum2n, randNum2n + 1);
        String wor5 = word.substring(randNum2n + 1);
        
        System.out.printf("%s%s%s%s%s", wor1, wor4, wor3, wor2, wor5);
      
      }
      else if(randNum2n < randNum1n){
        String wor1 = word.substring(0, randNum2n);
        String wor2 = word.substring(randNum2n, randNum2n + 1);
        String wor3 = word.substring(randNum2n + 1, randNum1n);
        String wor4 = word.substring(randNum1n, randNum1n + 1);
        String wor5 = word.substring(randNum1n + 1);
        
         System.out.printf("%s%s%s%s%s", wor1, wor4, wor3, wor2, wor5);
      
      }
      else{
         
         System.out.printf("%s", word);
         
      }   
         
      }
   }
   