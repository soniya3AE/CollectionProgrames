package collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "navee");
		h1.put(2, "Soniya");
		h1.put(3, "Chetu");
		
		//Fetch all the value from the h1 using enumeration 
		
	Enumeration e =	h1.elements();
	System.out.println("The elementes are:"+ e);
	
	while(e.hasMoreElements()) {
		System.out.println("The next elementes are :"+ e.nextElement());
	}
	
	
	Hashtable ht = new Hashtable();
	ht.put(21, "kiran");
	ht.put(22, "vineet");
	ht.put(23, "chetu");
	System.out.println(ht);
		
	
	// fetch all the elements from  hash tabel using enumeation
	
	Enumeration r = ht.elements();
	System.out.println("the all the elementes:" + r);
	
	while(r.hasMoreElements()){
		System.out.println(r.nextElement());
	}
	
	
	Set f = ht.entrySet();
	System.out.println(f);
	
	
	
	
	
	
		
	}
}