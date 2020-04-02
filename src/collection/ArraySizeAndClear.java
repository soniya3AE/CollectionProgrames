package collection;

import java.util.ArrayList;

public class ArraySizeAndClear {

	public static void main(String[] args) {
		ArrayList <String> alist = new  ArrayList <String>();
		System.out.println("the size of array is before adding items to arryalist  :" +alist.size());
		alist.add("Soniya");
		alist.add("Kamble");
		alist.add("Quality assurance Engineer");
		System.out.println("The size of array after adding items to array list is :"+alist.size());
		alist.clear();
		System.out.println("After clearing the all the elementes from the array list the siz of array is:"+ alist.size());		
	}	
}
