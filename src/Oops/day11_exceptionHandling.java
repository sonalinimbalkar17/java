package Oops;

import javax.print.AttributeException;

public class day11_exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//try-catch
	//syntax
	
		try {
			//block of code to try
		}
		catch(Exception e){
			//block of code to handle
		}
		
	//program 1
	
	System.out.println("hello");
	//System.out.println(10/0);//error
	
	//this will generate an error because 10/0 not exit
	//if an error occurs,we can use try-catch --to catch the error and execute some code to handle it
	
	try {
		System.out.println(10/0);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());// /by zero
	}
	
	//program 2
	
	//int arr[]= { 10,20,30,40,50};
	//for(int i=0;i<=arr.length;i++) {
		//System.out.println(i);
		//System.out.println(arr[i]);//error
	//}
	//this will generate an error because arr[i] does not exit
	//if an error occurs,we can use try-catch --to catch the error and execute some code to handle it
	
		try {
			System.out.println(10 / 5);

			int arr[]= { 10,20,30,40,50};
			for(int i=0;i<=arr.length;i++) {
				System.out.println(i);
				System.out.println(arr[i]);
			}
		}
		 catch (ArithmeticException e) {
			System.out.println("Incorrect input");//10/0
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		}
		catch (Exception e) {
			System.out.println(e.getMessage());

		}
		
		
		//program 3
		//int[] numbers= {1,2,3};
		//System.out.println(numbers[2]);//2
		//System.out.println(numbers[10]);//error
		//this will generate an error because numbers[10]does not exit
		
		//if an error occurs,we can use try-catch --to catch the error and execute some code to handle it

		try {
			int[] numbers= {1,2,3};
			System.out.println(numbers[10]);
		}
		catch(Exception e) {
			System.out.println("something went wrong");
		}	
		finally {
			System.out.println("the 'try-catch' is finished");
		}
		//finally
		//the finally statement lets you execute code ,after try-catch
			
		

	}
}
