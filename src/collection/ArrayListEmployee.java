package collection;

import java.util.ArrayList;

//below code for the userdefined class

public class ArrayListEmployee {

	private static final String Iterator = null;

	public static void main(String[] args) {
		
		Emoloyee e1 = new Emoloyee("Naveen",26,"Quality assurance Engineer");
		Emoloyee e2 = new Emoloyee("Priya",34,"Devloper");
		Emoloyee e3 = new Emoloyee("Kiran",45,"Admin");
		ArrayList <Emoloyee> al = new ArrayList();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		//Iterator 
		
		java.util.Iterator  <Emoloyee> itr = al.iterator();
		 while(itr.hasNext()) {
			 Emoloyee emp = itr.next();
			 System.out.println("The Employee details are as mentioned:");
			 System.out.println("The name :"+ emp.name);
			 System.out.println("The age :"+ emp.age);
			 System.out.println("The Dept :"+ emp.dept);
			 
		 }


		 //adding one arraylist into other arraylist 
		 
		 ArrayList <String> ar5 = new ArrayList <String>();
		 ar5.add("soniya");
		 ar5.add("Mannu");
		 ar5.add("Kk");
		 

		 java.util.Iterator <String> it = ar5.iterator();
		 while(it.hasNext()){
			String me = it.next();
			System.out.println(me);
		 }
		 
		 
		 ArrayList <String>ar6 = new ArrayList<String>();
		 ar6.add("Sheety");
		 ar6.add("Kamble");
		 ar6.add("pooja");
		 
		 ar6.addAll(ar5);
		 
		 java.util.Iterator  <String> add = ar6.iterator();
		 while(add.hasNext()) {
			 String all= add.next();
			 System.out.println("the ar6 elementes are:"+all);	 
		 }
		
		 
		 
		 
		 
		
		
		
		
		
		
		
	}

}
