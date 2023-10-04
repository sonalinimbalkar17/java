package JavaBasic;

public class day12_3DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array===use to add multiple element
		
		//array syntax===datatype [] arrayName
		//2 ways to define the array
        //Array stores the value by index

		//fixed length
		//program 1
		//int
		int numbers[]=new int[5];
		numbers[0]=11;
		numbers[1]=12;
		numbers[2]=13;
		numbers[3]=14;
		numbers[4]=15;
		
		//String
		String name1[]=new String[3];
		name1[0]="sonali";
		name1[1]="aarti";
		name1[2]="disha";
		
		int numbers2[]= {11,22,33,44,55,66};
		int[] numbers3 = {77,88,99,100,101};
		
        //access the value
		System.out.println(numbers[0]);//11
		System.out.println(numbers[1]);//12
		System.out.println(numbers[2]);//13
		System.out.println(numbers[3]);//14
		System.out.println(numbers[4]);//15
		
        System.out.println(numbers2[2]);//33
        System.out.println(numbers3[0]);//77
        
        //updating the value;
        numbers[0]=111;
        System.out.println(numbers[0]);
        
        //program 2
        //to find the length of array
        String[] names = {"sonali","aarti","disha","sai"};
        int q1=names.length;
        System.out.println(q1);//4
        
        //for loop
        for(int i=0;i<names.length;i++) {
        	//System.out.println(i);//index no//0//1//2//3
        	System.out.println(names[i]);//elements
        }
        
        //while loop
        int q2=0;
        while(q2<names.length) {
        	System.out.println(names[q2]);
        	q2++;
        }
       
        //for each loop
        for (String name:names) {
        	System.out.println(name);
        }
        
System.out.println("-------------------------------------------------------------------");
		
		//2D array
        //1st way
        //program1
        String states[][]= {
        		{"pune","mumbai","nashik"},{"nagpur","jaipur"},{ "aurangabad","nagar"}
        };
        
        //for loop
        for(int i=0;i<states.length;i++) {
        	String[] arr=states[i];
        	for(int j=0;j<arr.length;j++) {
        		System.out.println(arr[j]);
        	}
        	
        }
		
		//while loop
        int q3=0;
        while(q3<states.length) {
        	String arr[]=states[q3];
        	int q4=0;
        	while(q4<arr.length) {
        		System.out.println(arr[q4]);
        		q4++;
        	}
        	q3++;	
        }
		
		//for each
        for(String[] cities:states) {
        	for(String city:cities) {
        		System.out.println(city);
        	}
        }
		
        //2nd way
        //program2
        int numbersB[][]=new int[3][3];
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
        	int[] arr=numbersB[i];
        	for(int j=0;j<arr.length;j++) {
        		System.out.println(arr[j]);
        	}
        	
        }
        System.out.println("---------");
        //while loop
        int a1=0;
        while(a1<numbersB.length) {
        	int arr[]=numbersB[a1];
        	int a2=0;
        	while(a2<arr.length) {
        		System.out.println(arr[a2]);
        		a2++;
        	}
        	a1++;	
        }
        System.out.println("-------");
      //for each
        for(int[] x:numbersB) {
        	for(int y:x) {
        		System.out.println(y);
        	}
        }
        
        //program 3
        int numbersC[][]=new int[2][2];
        
        numbersC[0][0]=10;
        numbersC[0][1]=20;
        
        numbersC[1][0]=30;
        numbersC[1][1]=40;//OR

        int numbersD[][]= {
        		{10,20},{30,40}
        };
        System.out.println(numbersD[0][0]);
        System.out.println(numbersD[0][1]);
        System.out.println(numbersD[1][0]);
        System.out.println(numbersD[1][1]);
        System.out.println("------");
        
        //for loop
        for(int i=0;i<numbersD.length;i++) {
        	int[] arr=numbersD[i];
        	for(int j=0;j<arr.length;j++) {
        		System.out.println(arr[j]);
        	}
        }
        System.out.println("-------");
        //while loop
        int b1=0;
        while(b1<numbersD.length) {
        	int arr []=numbersD[b1];
        	int b2=0;
        	while(b2<arr.length) {
        		System.out.println(arr[b2]);
        		b2++;
        	}
        	b1++;
        }
        System.out.println("--------");
        //for each
        for(int [] arr:numbersD) {
        	for(int q:arr) {
        		System.out.println(q);
        	}
        }
        
        //program4
        int numbersE[][][]= {
        		{{11,22,33},{44,55,66},{77,88,99}},
        		{{111,222,333},{444,555,666},{777,888,999}},
        		{{1111,2222,3333},{4444,5555,6666},{7777,8888,9999}}
        };
        System.out.println(numbersE[1][1][2]);//666
        System.out.println(numbersE[2][2][2]);//9999
        
        //for loop
        for(int i=0;i<numbersE.length;i++) {
        	int arr[][]=numbersE[i];
        	for(int j=0;j<arr.length;j++) {
        		int arr2[]=arr[j];
        		for(int k=0;k<arr2.length;k++) {
        			System.out.println(arr2[k]);
        		}
        	}
        }
        System.out.println("-------");
        
        //while loop
        int s1=0;
        while(s1<numbersE.length) {
        	int arr[][]=numbersE[s1];
        	int s2=0;
        	while(s2<arr.length) {
        		int arrB[]=arr[s2];
        		int s3=0;
        		while(s3<arrB.length) {
        			System.out.println(arrB[s3]);
        			s3++;
        		}
        		s2++;
             }
        	s1++;
        }
        System.out.println("-------");
        
        //for each
        for(int arrB[][]:numbersE) {
            for(int arrC[]:arrB) {
            	for(int a:arrC) {
            		System.out.println(a);
            	}
            }
        }
	}
}
