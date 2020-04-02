package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
    
		 Set <String> Hash_set  =  new HashSet<String> ();
		 Hash_set.add("Priyanka");
		 Hash_set.add("sonu");
		 Hash_set.add("Kiran");
		 Hash_set.add("Manju");
		 System.out.println("the Hashset elementes:"+ Hash_set);
		 
		 // the bellow program represents the converting the array into list 
		 Integer a[] = new  Integer[]{1,3,4,5,6};
		 
		 List<Integer> list =  Arrays.asList(a);
		 System.out.println("The system display the arrays into list items:" + list);
		 
		 String b[] = new String[] {"Soniya","Kamble","Priya"};
		 
		 List <String> l = Arrays.asList(b);
		 System.out.println("The system display the array elementes are:"+l);
		 
	    // adding elementes to the to Hashset which implementes the Set Interface
		 
		 Set <String> setA = new HashSet<>();
		 setA.add("Naveen Shetty");
		 setA.add("Hanuman Ji");
		 setA.add("Shankar");
		 System.out.println("The set elementes are :"+setA);
		 
		 // To find the setA size
		 
		 System.out.println("the size of set is:"+setA.size());
		 setA.remove("Naveen Shetty"); 
		 System.out.println("the set elementes are:"+ setA);
		 
		 System.out.println("After removing the size of setA is:" + setA.size());
		 Set<String> setB = new HashSet<>();

		 setB.add("element 1");
		 setB.add("element 2");
		 setB.add("element 3");

		 Iterator<String> iterator = setB.iterator();

		 while(iterator.hasNext()){
		   String element = iterator.next();
			  System.out.println("Elementes are:"+ element);
		 }
		 
		 Set <String> Friute = new HashSet<String>();
		 
		 Friute.add("apple");
		 Friute.add("bannana");
		 Friute.add("Chiku");
		 Friute.add("Mango");
		 System.out.println("The set elements are:"+ Friute);
		 
		 Iterator <String> itr = Friute.iterator();
	
		 while(itr.hasNext()) {
			 String d = itr.next(); 
			 System.out.println("the elementes are:"+ d); 
		 }
		 
		 
		 
		 
		  
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

	private static String next() {
		// TODO Auto-generated method stub
		return null;
	}

}
