import java.util.ArrayList;

public class ContactInfo {
   
   private String name;     // name of individual
   private ArrayList<Phone> phoneNums; // list of phone numbers for this individual 
   
   // ======= Constructors ======= 
   /**
    * This constructor sets the name and phone number fields
    * from the values passed as arguments.
    * @param phonNums ArrayList
    * @param name String 
    */
   public ContactInfo(){
      name = "unknown";
      phoneNums = new ArrayList<Phone>();
   }
   
   public ContactInfo(String name, ArrayList<Phone> phoneNumber) {
      this.name = name;
      this.phoneNums = phoneNumber;
   }
   
   public String getName() {
      return this.name;
   }
   
   public ArrayList<Phone> getPhones() {
      return this.phoneNums;
   }
   
   public boolean addPhone(Phone p) {
      
      for (Phone phone: getPhones()){
         if (phone.getLabel().equals(p.getLabel()) || phone.getPhonNum().equals(p.getPhonNum())) {
            return false; }
      }
      
      getPhones().add(p);
      
      return true;
      
      
   }
   
   public boolean removePhone(String phonNum) {
      
      if (getPhones().isEmpty()) {return false;}
      //  for (Phone phone: getPhones()){
      if (getPhones().indexOf(phonNum) == -1) {
         return false;
         // }
      }
      int i = getPhones().indexOf(phonNum);
      
      getPhones().remove(i);
      
      return true;
   }   
}