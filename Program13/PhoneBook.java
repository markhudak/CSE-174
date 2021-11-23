import java.util.ArrayList;

/* 
 * PhoneBook class
 * CSE 174 Spring 2020
 * YOUR NAME
 * YOUR INFORMATION
 * 
 * The PhoneBook class simulates a simple phone book application.
 * Copyright(C) Nov 2020
 */

public class PhoneBook {
  /**
   * 
   * @param 
   * @param
   * @param
   * @param
   * @param
   */ 
  public static void add(ArrayList<ContactInfo> list, String name, 
                         String label, String pNum) { 
    // Adds a ContactInfo object to the list 
    // If the name is already in the list
    // the method should print:
    // "The name already exists!"
    // If the contact is added successfully, the method should
    // print "*The contact has been added successfully*"
  } 
  
  /**
   * 
   * @param
   * @param
   * @param
   * @param
   */ 
  public static void append(ArrayList<ContactInfo> list, String name,     
                            String label, String pNum) { 
    // Adds a new Phone object to a specific ContactInfo  
    // If this person does not exist the method should print: 
    //   "Couldn't find the name!" 
    // If a similar label or phone number already exists for  
    // that person, the result should be: 
    //     "The label/number already exists for this person!" 
    // If the number is added, the method should print 
    // "*The number has been added successfully*"
  } 
  
  /**
   * 
   * 
   * @param
   * @param
   */ 
  public static void display(ArrayList<ContactInfo> list, 
                             String name) { 
    //Displays all the phone numbers that belongs to the given   
    // name. 
    // If the name doesn't exist in the list, the method should print
    // "Couldn't find the name"  
  } 
  
  /**
   * 
   * @param
   */ 
  public static void displayAll(ArrayList<ContactInfo> list){ 
    // Displays all the names and the phone numbers. 
    // If the list is empty, the method should print
    //"The list is Empty!"
    
  } 
  
  /**
   * 
   * @param
   * @param
   */ 
  public static void remove(ArrayList<ContactInfo> list,  
                            String name) { 
    // Remove all data related to the given name from the  
    // list. 
    // If the list is empty, the method should print
    // "The list is Empty!",
    // If the name does not exist the method should print 
    // "Couldn't find the name!"
    // If the contat is removed the method should print
    // *Contact is removed successfully*
  } 
  
  
  
  // main method
  public static void main(String[] args) {
    // This is how you need to define your list.
    // Use this list.
    ArrayList<ContactInfo> list = new ArrayList<ContactInfo>();
    Scanner keyboard = new Scanner(System.in);
    
    // Complete the rest
    
    
    }
  }
}
