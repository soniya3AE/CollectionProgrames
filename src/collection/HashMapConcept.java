package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	private static final boolean Key = false;

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"soniya");
		hm.put(2,"priya");
		hm.put(3,"Kiran");
		hm.put(4,"Namdev");
		
		System.out.println("get the value called :"+ hm.get(3));
		hm.remove(2);
		System.out.println("The key value is:"+ hm.get(2));
		
		//Iterator 
		for(Entry e : hm.entrySet()){
			System.out.println(e.getKey() +" "+ e.getValue());	
		}
	  
		
		HashMap <Integer, String> hm2 = new  HashMap <Integer, String>() ;
		
		hm2.put(6,"Pavanputra");
		hm2.put(9, "Kolapur Laxmi");
		hm2.put(10,"ganga");
		
		System.out.println("The values are :" + hm2.get(10));
		hm.putAll(hm2);
		System.out.println(hm);
		for(Entry g : hm.entrySet()){
			System.out.println("the key and value:"+ g.getKey() + " "+ g.getValue());
		}
		
		System.out.println(hm);
		HashMap <Integer , Emoloyee> em = new HashMap <Integer, Emoloyee>();
		
		Emoloyee e1 = new Emoloyee("Naveen" , 23, "Dev");
		Emoloyee e2 = new Emoloyee("sheety" , 26, "Qa");
		Emoloyee e3 = new Emoloyee("Kareena" ,45, "Admin");
		
		  em.put(1, e1);
		  em.put(2, e2);
		  em.put(3, e3);
		  
		 for(Entry <Integer,Emoloyee> g : em.entrySet()){
			 
			 int key = g.getKey();
			 Emoloyee em1 = g.getValue();
			 System.out.println(key + "info");
			 
			 System.out.println(em1.name+ " " + em1.age+ " " + em1.dept);		 
		 }
		 
		 
		  
	
		  
		
		
		
		
		
		
		
		
		
		
		
	}

}
