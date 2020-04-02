package collection;

import java.util.ArrayList;
import java.util.Collections;

// The bellow program to sort array list.

public class ArraySortList {

	public static void main(String[] args) {
		
     ArrayList <String> contries = new ArrayList <String> ();
     
     contries.add("India");
     contries.add("Pakistan");
     contries.add("USA");
     contries.add("Bhutan");
     contries.add("Itali");
     contries.add("Sri Lanka");
     
     System.out.println("the list of contries are :"+ contries);
     
     System.out.println("the size of array is :"+contries.size());
     
     System.out.println("Before sorting the array elementes are");
     
     for( String nations : contries) {
    		 System.out.println("the List of contries are:"+ nations);
     }
     
     System.out.println("After sorting the array elementes are");
     
     Collections.sort(contries);
     
     for( String nations : contries) {
    	 System.out.println(" Countries:"+nations);
     }
     
     ArrayList <Integer> numbers = new ArrayList <Integer>();
     numbers.add(11);
     numbers.add(45);
     numbers.add(3);
     numbers.add(1);
     numbers.add(19);
     numbers.add(2);
     System.out.println("Before sorting the number");
     for(Integer digites :numbers) {
    	 System.out.println("The number are:" +digites );
     }
     
     Collections.sort(numbers);
     System.out.println("After  sorting the number");
     for(Integer digites : numbers) {
    	 System.out.println("the nunbers are:"+ digites); 
     }
     
     
    // the bellow code represents the how to orange in desending order
      
     ArrayList <Integer> num = new ArrayList  <Integer>();
     num.add(100);
     num.add(1);
     num.add(10);
     num.add(11);
     num.add(9);
     System.out.println("The number before arenging in the desending order:");
     for(Integer n:num) {
    	 System.out.println("The number in desending order is:" + n); 
     }
     
     Collections.sort(num, Collections.reverseOrder());
     System.out.println("the number after arrenging in desc");
     
     for(Integer n : num) {
    	 System.out.println("The numbers in desending order:"+n);
     }   
	
	 
     ArrayList <String> states = new ArrayList <String>();
     states.add("karnataka");
     states.add("Tamil Nadu");
     System.out.println("the states are:"+ states);
     		
     contries.addAll(states);
	System.out.println("The add all result is:" +contries);
	
	contries.addAll(2,states);
	System.out.println("The states are at 3rd index of contries:" + contries);
	
	}
	// Adding single element to arrylist.
	//removing array element from the array list
    // Adding at specific position of arraylist.
	//  removing from specifica position of arraylist
	// combining two array list.
	// clearing all array elements
	// sort and desending order.
	
	
	
     

}
