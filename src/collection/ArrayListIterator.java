package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Soniya");
		al.add("Kamble");
		al.add("Naveen");
		al.add("Kajal");
		System.out.println("the list elementes are:" +al);
		
		System.out.println("This is using the For each : +++++++++++");
		
		// using For each 
		al.forEach(Names ->{
			System.out.println(Names);
		});
		
		System.out.println("This is using the Iterator: ++++++++++");
		//using the iterator 
		Iterator it = al.iterator();
		while( it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		ArrayList l1 = new ArrayList();
		l1.add("Kk");
		l1.add("Asha");
		l1.add("Koi milgaya ");
		l1.add("Karaba");
		System.out.println(l1);
		
		l1.forEach(movies->{
			System.out.println(movies);
		});	
		
		
		Iterator <String> itr = l1.iterator();
	     while(itr.hasNext()) {
	    	String kk = itr.next();
	    	
	     }
	     
	     
	 	ArrayList l2 = new ArrayList();
		l2.add("pp");
		l2.add("poornima");
		l2.add("Dulhan ");
		l2.add("Love");
		System.out.println(l2);
	     
	     Iterator <String> n= l2.iterator();
	     while(n.hasNext()) {
	    	 String k = n.next();
	    	 
	     }
	     
	     //Using forEach and iterator lambda expression 
	      
	     ArrayList <String> tvserious  = new ArrayList <String>();
	     
	     tvserious.add("shaktiman");
	     tvserious.add("shak laka boom boom");
	     tvserious.add("Junior jee");
	     
	     System.out.println("Fetch all the arraylist elementes using  for each iterator");
	     
	     tvserious.iterator();
	     tvserious.forEach(shows->
	     {
	    	 System.out.println("All the tv serius items are :"+ shows);
	    	 
	     });
	     
	     
	     // Fetching all the arryalist elmentes using the for loop 
	     System.out.println("The elementes displaying using the for loop:++++++++++++");
	     for(String shows : tvserious){
	    	 System.out.println("All the tv serious items are:" + shows);
	     }
	     
	     //Fecthing all the araylist elementes using the for loop with index/order
	     System.out.println("the bellow list items are displayed using the for loop with index and oder: ++++++++++++++++++");
	     
	     for( int i = 0 ;i<tvserious.size(); i++){
	    	 System.out.println("the loop elementes are :" + tvserious.get(i));
	     }
	     
	    	
	     
	     //How to traver the Arraylist items using in back word direction
	     ListIterator <String>  listIteratorlist  = tvserious.listIterator(tvserious.size());
	     while (listIteratorlist.hasPrevious()){
	    	 String shows = listIteratorlist.previous();
	    	 System.out.println(shows);
	     }
	     
	     
	     // traverse all the arraylist items in reverse oder
	     
	      ArrayList <String> Game  = new ArrayList<String>();
	      Game.add("ludo");
	      Game.add("pubg");
	      Game.add("pokemon");
	      Game.add("Chimpa");
	      
	      System.out.println("the  list of all the elementes:"+ Game);
	      
	      
	      //Display the all the sorted order using 
	      Game.forEach(Games->{
	    	  System.out.println(Games);
	    	  
	      });
	      
	      //display using for loop 
	      for(int i=0;i<Game.size(); i++) {
	    	  System.out.println("the list of array elementes are:" + Game.get(i));  
	      }
	      
	      // using Lamda expression 
	     Game.forEach(Games->{
	    	 System.out.println(Games);	 
	     });
	     
	     
	     //Reverse the given ArrayList elements in reverse oder 
	  System.out.println("***********************The list elementes using the ");   
	 ListIterator  <String> fungames = Game.listIterator(Game.size());
	 while (fungames.hasPrevious()) {
		 String Show  = fungames.previous();
		 System.out.println( Show);
	 };
	 
	 
	 //display the all the elementes using iterator 
	 
	 System.out.println("*******************The list of elementes using list iterator:******************");
	  Iterator <String> pubg = Game.iterator();
	   while(pubg.hasNext()) {
		   String h = pubg.next();   
		   System.out.println(h);
	   }		
}
}