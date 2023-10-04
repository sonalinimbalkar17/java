package Oops;

public class day5_Polymorphism_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition(5,5);
		addition(5,5,5);
		addition(5,5,5,5);

	}
	//polymorphism---->poly=many,morph=forms+polymorphism=many forms

	
	public static void addition(int x,int y) {
		System.out.println(x+y);
	}
	
	public static void addition(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	
	public static void addition(int x,int y,int z, int a) {
		System.out.println(x+y+z+a);
	}
}
