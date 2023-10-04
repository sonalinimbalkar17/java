package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Collections
		//list  (extends collection)
		
		//1.arrayList (implements list)
		ArrayList<Integer>listA = new ArrayList<>();
		listA.add(10);
		listA.add(20);
		listA.add(30);
		listA.add(40);
		listA.add(50);
		System.out.println(listA);
		
		//ArrayList of String
		//four operations 
		ArrayList<String>names = new ArrayList<>();
		
		//add element
		names.add("sonali");	
		names.add("shweta");	
		names.add("kalyani");	
		names.add("shital");	
		names.add("aarti");	
		System.out.println(names);

		//retrive element
		//get()
		System.out.println(names.get(0));//sonali
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		
		for(int i = 0 ; i < names.size() ; i++ ) {
			System.out.println(i);
			System.out.println(names.get(i));
		}
		
		//update element
		// updating the value at particular index
		names.set(1, "disha");
		System.out.println(names);
		
		//remove element
		names.remove(2);
		System.out.println(names);
		

		//methods()
		ArrayList<String>city=new ArrayList<>();
		city.add("pune");
		city.add("mumbai");
		city.add("nagpur");
		city.add("nashik");
		city.add("nagar");
		
		//size()
		int a1=city.size();
		System.out.println(a1);//5
		System.out.println(city);
		
		//sort()---order
//		city.sort(null);
//		System.out.println(city);
		
		Collections.sort(city);
		System.out.println(city);

		//isEmpty
		boolean a2=city.isEmpty();
		System.out.println(a2);//false
		
		ArrayList<String>Color = new ArrayList<>();
		boolean a3=Color.isEmpty();
		System.out.println(a3);//true
		
		Color.add("pink");
		Color.add("black");
		Color.add("red");
		
		//indexOf()
		int a4=Color.indexOf("black");
		System.out.println(a4);//1
		
		// contains()
		boolean a5=Color.contains("Red");
		System.out.println(a5);//false
		
		boolean a6=Color.contains("black");
		System.out.println(a6);//true
				


		
		
	}	

}
