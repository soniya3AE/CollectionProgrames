package collection;

import   java.util.ArrayList;
public class ArrayListDemo{

	public static void main(String[] args) {
		
	   ArrayList <String> alist = new ArrayList <String>();
	   
	   System.out.println("The add the items to ArrayList");
	   alist.add("Name: Soniya");
	   alist.add("Designation : Quality Assurance Engineer");
	   alist.add("Family Name:Kamble");
	   System.out .println("After adding element to the ArrayList items are:"+ alist);
	   ArrayList  <Integer> alist1 = new ArrayList <Integer> ();
	   alist1.add(2);
	   System.out.println("After adding Interger item to the List:"+ alist1);
	   
	   alist.remove(1);
	   System.out.println("After removing the First index array Item from array List:"+ alist);
	   System.out.println("update the new value to exist index value for the 2 second position such as shown");
	   alist.set(0," Nisha Kamble");
	   System.out.println("After addding updating new element to the exist value:"+ alist);
	   
//	   for(Object o : alist)
//	   {
//		  System.out.println(o);
//	   }     
	   
	   
	   
	   
	}
}
