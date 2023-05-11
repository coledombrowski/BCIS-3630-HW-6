// Cole Dombrowski - JAVA HW 6
// 3630 (002) - LeRoy Hardy
// Java 6 Part B (Phone Class Array)
// 
// NOTE: FOLLOWING UML PROVIDED

public class phoneInformation 
{
    public static void main(String[] args) 
    {
        
        // "Set up an array that stores four customer objects"
        Phone[] phoneList = new Phone[4] ;
        
           phoneList[0] = new Phone("Juan Olivarez", "J.Olivarez@IBM.com", "2141") ;
           phoneList[1] = new Phone("Suphanee King", "S.King@Chase.com", "1231") ;
           phoneList[2] = new Phone("Soheyla Eydani", "S.Eydani@Citi.com", "2131") ;
           phoneList[3] = new Phone("Robb Dean", "R.Dean@BofA.com", "1241") ;
           
        // Headers (provided in hints)
        System.out.printf("%-20s%-30s\t%-14s\t%-5s\t%-8s\n", "Customer", "Email", "Phone", "Part#", "Price") ;
        System.out.printf("\n") ;
        
        // Initialize an accumulator for the total price, prints "0.0" if there are no purchases/products
        double totalPrice = 0.0 ;
        
        // Use a for loop to print the array, following UML from "Phone.class"
        for (int index = 0; index < phoneList.length; index++) 
        {
           // Objects in the array
           Phone currentPhone = phoneList[index] ;
           String customer = currentPhone.getCustName() ;
           String email = currentPhone.getCustEmail() ;
           String phone = currentPhone.getPhoneDesc() ;
           String partNum = currentPhone.getPartNum() ;
           double price = currentPhone.getPhonePrice() ;
           
           // Adds the price of the product to the accumlator
           totalPrice += price ;

           
           // Print the objects in array
           System.out.printf("%-20s%-30s\t%-14s\t%-5s\t$%,8.2f\n", customer, email, phone, partNum, price) ;
        }
        
        // Print total after for loop
        System.out.printf("\n") ;
        System.out.printf("%-20s%-30s\t%-14s\t%-5s\t$%,8.2f\n", "", "", "", "Total", totalPrice) ;
   }
   
}   // End of program