package JavaBasic;

public class day1_FunctionType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//data types	
	int x=30;
	boolean y=true;
	String z="sonali";
	System.out.println("hello");
			
	//Arithmetic operation
	
	        int a = 10;
			int b = 5;
			
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
			
			int q = 8;
			int r = 4;
			System.out.println(q+r);
			System.out.println(q-r);
			System.out.println(q*r);
			System.out.println(q/r);
			System.out.println(q%r);
			
			// calling the function
			
			Calculator(8,4);
			Calculator(9,3);
			Calculator(10,5);
			
			//calling the function
			
			addA();
			addA();
			addA();
			addA();
			
			addB(2,3);
			addB(4,5);
			addB(5,6);
			addB(3,6);
			
			int sum = addC(3,5);
			System.out.println(sum);
			System.out.println(sum + sum);
			System.out.println(sum *5);
	}
	
	// Method 2
	
		public static void  Calculator(int x , int y) {
			
			System.out.println(x+y);
			System.out.println(x-y);
			System.out.println(x*y);
			System.out.println(x/y);
			System.out.println(x%y);
				
		}
		
         //function
		// function without parameter and without return type 	
		public  static void addA() {
			System.out.println(9+9);
		} 

		//function with parameter and without return type 
		public  static void addB(int a , int b) {
			System.out.println(a+b);
		} 
		
		// function with parameter and with return type
		
		public  static int addC(int a , int b) {
			return a + b;
		} 
}
		


	

