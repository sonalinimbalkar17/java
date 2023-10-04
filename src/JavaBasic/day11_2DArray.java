package JavaBasic;

public class day11_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array
		//array stores the value by index
		//syntax
		//datatype [] arrayName
		
		//2 ways to define array the array
		//fixed length
		//1st way
		//program1
		int numbers [] =new int[5];
		numbers[0]=11;
		numbers[1]=22;
		numbers[3]=33;
		numbers[4]=44;

		
		//2nd way
		int numbers2[] = { 11,22,33,44,55,66};
		int[] numbers3 = {77,88,99,100,101,102};
		
		//access the value
		System.out.println(numbers[0]);//11

		//updating the value
		numbers[0]=111;
		
		System.out.println(numbers[0]);//111
		
		
		//find the length of array
		
		String[] names = {"aarti","disha","priya","kirti"};
	   int q1= names.length;
		System.out.println(q1);//4
		
		//for loop
		for(int i=0;i< names.length;i++) {
			//System.out.println(i);//index no
			System.out.println(names[i]);
		}

		//while loop
		int q2=0;
		while(q2<names.length) {
		//	System.out.println(q2);//index no
			System.out.println(names[q2]);
			q2++;
		}

		//for each loop
		for(String name : names) {
			System.out.println(names);

		}
		
		//program2
		//2D array
		//1st ways
		String states[][]= {
				{"vaijapur","aurangabad","nashik" },
				{"mumbai","pune","nagar"},
				{"thane","nagpur","jaipur"}
		};
		
		//for loop
		for(int i=0;i<states.length;i++) {
			String [] arr =states[i];
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[j]);
			}
		}
		System.out.println("-------");
		//while loop
		int q3=0;
		while(q3<states.length) {
			String arr []=states[q3];
			int q4=0;
			while(q4<arr.length) {
				System.out.println(arr[q4]);
				q4++;
			}
			q3++;
		}
		
		System.out.println("----------");
		//for each
		for(String[] cities:states) {
			for(String city:cities) {
				System.out.println(city);
			}
		}
		//2nd ways
		int numbersB [][]=new int[3][3];
		
		numbersB[0][0]=11;
		numbersB[0][1]=22;
		numbersB[0][2]=33;

		numbersB[1][0]=44;
		numbersB[1][1]=55;
		numbersB[1][2]=66;

		numbersB[2][0]=77;
		numbersB[2][1]=88;
		numbersB[2][2]=99;

		//for loop
	      for(int i=0;i<numbersB.length;i++) {
			int [] arr=numbersB[i];
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[j]);
			}
		}
	      System.out.println("--------");
		
	      //while loop
	      int a1=0;
	      while(a1<numbersB.length) {
	    	  int arr []=numbersB[a1];
	    	  int a2=0;
	    	  while(a2<arr.length) {
	    		  System.out.println(arr[a2]);
	    		  a2++;
	    	  }
	    	  a1++;
	      }
	      System.out.println("---------------------");
	      
	   //for each loop
	      for(int[] a:numbersB) {
	    	  for(int b:a) {
	    		  System.out.println(b);
	    	  }
	      }
	      
	}
}
