package JavaBasic;

public class day7_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while loop
		//program 1
		// print hello 3 times
		// initialization
		int q1 = 1;

		while (q1 <= 3) { // condition check
			System.out.println("hello");
			q1++; // increment / decrement
		}
		
		//program 2
		//print 1 to 5
		int q2=1;
		while(q2<=5) {
			System.out.println(q2);
			q2++;
		}

		//program 3
		//print 5 to 1
		int q3=5;
		while(q3>=1) {
			System.out.println(q3);
			q3--;
		}
		
		//program 4
		//print of 2 table
		int q4=2;
		while(q4<=20) {
			System.out.println(q4);
			q4=q4+2;
		}
		//program 5
		//print of 5 table
		int q5=5;
		while(q5<=50) {
			System.out.println(q5);
			q5=q5+5;
		}
		// table of 5 in reverse 
		
				int q6 = 50 ;
				while(q6 >= 5) {
					System.out.println(q6);
					q6 = q6 - 5;

	   }
			
				
				
		//break statement with while loop
				
			int q7=1;
			while(q7<=5) {
				if(q7==3) {
				break;
			}
				System.out.println(q7);//1 //2
				q7++;//2//3
			}
			
			//continue statement with while loop
			int q8 = 1;
			while(q8 <= 5) {
				if(q8 == 3) {
					q8 ++; // 4
					continue;
				}
				System.out.println(q8); // 1 // 2 // 4 // 5
				q8 ++; // 2 // 3 // 5 // 6
			}
					
			

	}

}
