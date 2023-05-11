// Phone Class - Java 6
// LeRoy Hardy

public class Phone
{
   // Fields to store are the customer name, customer email, and 
   //    the selected part number
   private String custName;
   private String custEmail;
   private String partNum;
   
   // noargs Constructor
   public Phone ()
   {
      custName = "";
      custEmail = "";
      partNum = "";
   }
   //  Full Constructor
   public Phone (String name, String email, String part)
   {
      custName = name;
      custEmail = email;
      partNum = part;
   }
   // Set the customer's name
   public void setCustName (String name)
   {
      custName = name;
   }
   //Set the customer's email address
   public void setCustEmail (String email)
   {
      custEmail = email;
   }
   // Set the customer's selection of phone using the part number
   public void setPartNum (String part)
   {
      partNum = part;
   }
   // Get the customer's name
   public String getCustName ()
   {
      return custName;
   }
   // Get the customer's email address
   public String getCustEmail ()
   {
      return custEmail;
   }
   // Get the customer's selection of phone part number
   public String getPartNum ()
   {
      return partNum;
   }
   // Get the phone description based on the part number
   //    Returns "Unknown" if the part number is invalid
   public String getPhoneDesc ()
   {
      String phoneDesc ;
      
      switch (partNum)
      {
         case "1231":
            phoneDesc = "iPhone 14" ;
            break;
         case "1241":
            phoneDesc = "Apple Watch" ;
            break ;
         case "2131":
            phoneDesc = "Galaxy S22";
            break;
         case "2141":
            phoneDesc = "Galaxy Z Fold4" ;
            break;
         case "2151":
            phoneDesc = "Galaxy Watch5" ;
            break;
         default:
            phoneDesc = "Unknown" ;
            break;
      }
      return phoneDesc;
   }
   // Get the price of the phone based on the part number
   //   Returns 0.0 if the part number is invalid
   public double getPhonePrice ()
   {
      double phonePrice;
      
      switch (partNum)
      {
         case "1231":
            phonePrice = 499.99 ;
            break ;
         case "1241":
            phonePrice = 429.99 ;
            break ;
         case "2131":
            phonePrice = 749.99 ;
            break ;
         case "2141":
            phonePrice = 1799.99 ;
            break ;
         case "2151":
            phonePrice = 279.99 ;
            break ;
         default:
            phonePrice = 0.00 ;
            break ;
      }
      return phonePrice ;
   }
}