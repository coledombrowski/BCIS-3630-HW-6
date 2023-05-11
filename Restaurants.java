// Cole Dombrowski - JAVA HW 6
// 3630 (002) - LeRoy Hardy
// Java 6 Part A (Restaurants)

import java.util.ArrayList ;   // <<< Importing array package

public class Restaurants 
{
    public static void main(String[] args) 
    {
       // Create ArrayList to hold restaurant names (page 475)
       ArrayList<String> restaurantsList = new ArrayList<>() ;
       
       // Add restaurant names to ArrayList
       // NOTE: Do not ask user for other restaurants 
       restaurantsList.add("Avesta") ;
       restaurantsList.add("Chili’s") ;
       restaurantsList.add("Eagle Landing") ;
       restaurantsList.add("Firehouse Subs") ;
       restaurantsList.add("Jason’s Deli") ;
       restaurantsList.add("Mean Greens") ;
       restaurantsList.add("Outback Steakhouse") ;
       restaurantsList.add("Texas Roadhouse") ;
       
       // 1. Print names of restaurants
       System.out.println("List of Restaurants:") ;
       System.out.println("") ;
       for (String restaurants : restaurantsList) 
       {
            System.out.println(restaurants) ;
       }
            // Formatting for final output
            System.out.println("") ;
            System.out.println("---------------") ;
            System.out.println("") ;
       
       // 2. Add Cheddar's to the list of restaurants
       int index = 0 ;
       while (index < restaurantsList.size() && restaurantsList.get(index).compareTo("Cheddars Kitchen") < 0) 
       {
            index++ ;
       }
       restaurantsList.add(index, "Cheddars Kitchen") ;
       
       // 3. "Set Firehouse Subs and Mean Greens to your two favorite restaurants"
       //    "f" = favorite, "start from 0 on the first element of the array" 
       for (int f = 0; f < restaurantsList.size(); f++) 
       {
           if (restaurantsList.get(f).equals("Firehouse Subs")) 
           {
               restaurantsList.set(f, "Firehouse Subs (Favorite Restaurant 1)") ;
           } 
           else if (restaurantsList.get(f).equals("Mean Greens")) 
           {
               restaurantsList.set(f, "Mean Greens (Favorite Restauraunt 2)") ;
           }
        }
        
        // 4. Print updated restaurant list
        System.out.println("Updated List of Restaurants:") ;
        System.out.println("") ;
        for (String restaurants : restaurantsList) 
        {
            System.out.println(restaurants) ;
        }
        
    }  
       
}   // End of program