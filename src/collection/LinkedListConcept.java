package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//the bellow program represents the linked list conceptes
		
		LinkedList <String> ll = new LinkedList <String> ();
		ll.add("Selenim");
		ll.addFirst("Webdriver");
		ll.addLast("QTP");
		ll.add("API testing");
		
		System.out.println("The list of singly linked list items are:"+ll);
		
		LinkedList <String> sl = new LinkedList <String> ();
		sl.addLast("Postman");
		sl.add("Pooja");
		sl.add("chopra");
		sl.addFirst("milk");	
		System.out.println("The List of itemes are:"+sl);
		
		sl.addAll(ll);
		System.out.println("The combination of sl and ll is available now in:"+sl);
		
		for (int i= 0; i<sl.size();i++) {
			System.out.println("The elementes are:"+sl.get(i));
		}
		
		// Itarator each element of linked list are as mentioned bellow using iterator interface
		
		
		System.out.println(" ********************This is using iterator******************************");
		Iterator <String> itr= sl.iterator();
		while(itr.hasNext()) {
			String a = itr.next();
			System.out.println("The list of elementes are:"+ a);
		}
		
		sl.addFirst("soniya");
		sl.addLast("Kamble");
		
		System.out.println("Let see the linked list items are:"+ sl);
		
		sl.clear();
		System.out.println("the elementes presents in the linked list is:"+sl.size());
		
		LinkedList <String> pp = new  LinkedList <String>();
		pp.add("pp");
		pp.add("kiya");
		pp.add("Jiya");
		System.out.println("The list of elementes in the linked list are:"+ pp);
		
		sl.add("Mohana");
		sl.add("kumari");
		sl.add("Mohana");
		System.out.println("Newly added elementes are :"+sl );
		System.out.println("the sl elementes are:"+ sl.size());
		sl.addAll(pp);
		System.out.println("The list of elementes are:"+sl);
		sl.retainAll(pp);
		System.out.println(sl);
		
		
		//using advanced for loop
		
		for(String s : sl) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
