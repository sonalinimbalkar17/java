package JavaBasic;

public class day10_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array
		//use add in multiple elements
		
		//syntax
		//dataType [] arrName= new dataType[arraySize]
		//2 ways to define the array
		//fixed length
		int [] marks=new int[5];
		marks[0]=1;
		marks[1]=2;
		marks[2]=3;
		marks[3]=4;
		marks[4]=5;
		System.out.println(marks[4]);//5
		System.out.println(marks[0]);//1
		
		String names [] = new String[5];
		names[0]="disha";
		names[1]="sai";
		names[2]="divya";
		names[3]="aarti";
		names[4]="kirti";
		System.out.println(names[4]);//kirti
		
		String cities [] = { "pune","mumbai","nashik","nagpur"};
		System.out.println(cities[2]);//nashik
		
		//length 
		System.out.println(cities.length);//4
		
		int n []= {11,22,33,44,55};
		//for loop
		for(int i=0;i<n.length;i++) {
			//System.out.println(i);//index
		    System.out.println(n[i]);//element
		}
		    
		  String names2 [] = {"vaijapur","pune","nashik"};
			//for loop
		  for(int i=0;i<names2.length;i++) {
		   System.out.println(names2[i]);
		  }
		  
		  
		 //for each loop
		  for(String x:names2) {
			  System.out.println(x);
		  }
		    
			
		  int n2 [] = {11,22,33,44};
		  for(int element:n2) {
			  System.out.println(element);
		  }
			
			
		

		
	}

}
