package Oops;

public class day12_exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// compile time error
		// local error
		// run time error
		
		// compile time error
		//System.out.println(a);
		
		// logical error
		float salary=30000;
		float totalsalary = (float) (0.10 * 30000);
		System.out.println(totalsalary);
		// System.out.println(10/0); 
		
		// ArithmeticException
		System.out.println("hello");
		//System.out.println(10/0);//ArithmeticException
		System.out.println("bye");

		 int [] numbers = {10,20,30};
		 System.out.println(numbers[2]);
		// System.out.println(numbers[7]);//ArrayIndexOutOfBoundsException

		// program 1

		 System.out.println("hello");
		 try {
			 System.out.println(10/0);
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());/// by zero
		 }
		 System.out.println("bye");
		
		 //program 2
		 
		 System.out.println("hello");
		 try {
			 int [] number = {10,20,30,40};
			 System.out.println(numbers[6]);
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());//Index 6 out of bounds for length 3
		 }
		 System.out.println("bye");
		 
		 
		 //program 3
		 System.out.println("hello");
		// System.out.println(10 / 0);
		 
		 try {
			 System.out.println(10 / 0);

			 String names[]= {"sonali","shweta","kalyani"};
			 System.out.println(names[5]); 
		 }
		 catch(ArithmeticException e) {
			 System.out.println(("enter correct output"));
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("element not found at particular index");
		 }
		 catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		// program 4 -- try catch finally
			System.out.println("hello");

			try {
				System.out.println(10/5);//2
			} 
			catch(Exception e) {
				System.out.println("incorrect input");
			}
			finally {
				System.out.println("I will always run");//I will always run
			}
			
			System.out.println("bye");
			
			
	}

}
