/*
 * Mark Hudak
 * Instructor: Meisam Amjad
 * CSE174, section: B
 * 03/08/2020
 * Program6.java
 * Description: A program with three methods; isEven, changeEvens, and addDigits.
 */

 
public class Program6 { 
 
   /**
    * Method isEven determines whether an integer is even or not.
    * Returns true if even and false if odd.
    * @param i The integer value.
    * @return true=even , false=odd; 0=even
    */ 
         public static boolean isEven(int i){
            
          //using a boolean return type and modulus 2 to pair up even with true
            return(i%2 == 0);
            
         }   
         
         
   /**
    * Method changeEvens changes all even digits in a 4-digit number to zero.
    * Returns the new number.
    * @param abcd The integer value.
    * @return The new integer; if abcd is less than four digits the return will be zero.
    */          
        public static int changeEvens(int abcd){
       
      //using if statement to ensure abcd is four digits, if not returns zero    
        if (abcd<1000){return(0);}
        
      //nested a series of if statements within this finalizing else statement; each if statement 
      //is paired with an integer variable that is declared. The integer variables are the isolated 
      //digits of abcd. The isolated digits are ran through method isEven and if the result is
      //true that digit becomes a zero. After these statements are ran abcd is strung back together
      //and returned.
        else {
           
            int dig1 = abcd/1000;
            if (isEven(dig1) == true){dig1 = 0;}
            
            int dig2 = abcd/100%10;
             if (isEven(dig2) == true){dig2 = 0;}
            
            int dig3 = abcd/10%10;
             if (isEven(dig3) == true){dig3 = 0;}
             
            int dig4 = abcd%10;
             if (isEven(dig4) == true){dig4 = 0;}
            
             abcd = dig1*1000 + dig2*100 + dig3*10 + dig4;
             
             return (abcd);
        }}
        
   /**
    * Method addDigits enacts a summation on the individual digits a 4 digit positive integer 
    * in accordance with the index number specified as the starting point of the process.
    * Returns the sum.
    * @param num The positive integer value.
    * @param ind The index value.
    * @return The sum; returns zero if num is less then four digits or ind is less than 0 or 
    * greater than four.
    */ 
        
        public static int addDigits(int num, int ind){
           
           
         //using a couple statements to ensure num is four digits and ind is an appropriate index
         //option for a four digits number by keeping it between 0-3. Otherwise return zero.
           if (num<1000){return(0);}     
           else if (ind<0 || ind>4){return(0);}
           
         //I guess I prefer the logic of if statements over switch cases for here I continue down
         //a similar path as I did in my last method. Nested some if's in an else; based off what
         //index was selected num gets put through a mathematical operation that isolates and adds
         //the individual digits. The sum is returned.
           else{
           if (ind == 0){
                num = (num/1000) + (num/100%10) + (num/10%10) + (num%10);
           }
           if (ind == 1){
              num = (num/100%10) + (num/10%10) + (num%10);
           }
           if (ind == 2){
              num = (num/10%10) + (num%10);
           }
            if (ind == 3){
              num = (num%10);
            }
               return (num);  

            }}}
           