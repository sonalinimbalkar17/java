package Oops;

public class day1_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object create
		//calling output
		Person sona=new Person();
		System.out.println(sona.firstName);
		System.out.println(sona.lastName);
		System.out.println(sona.age);
	    sona.displayName();//sonalinimbalkar
		
		Person disha=new Person();
		System.out.println(disha.firstName);
		System.out.println(disha.lastName);
		System.out.println(disha.age);
		
		disha.firstName = "sonali2" ;
		disha.lastName = "nimbalkar2";
		disha.age = 23;
		disha.displayName();//sonali2nimbalkar2
		
		// Setting the values at the tym of object creation
		
				Person2 aarti2  = new Person2("aarti","patil",20);
				System.out.println(aarti2.firstName);
				System.out.println(aarti2.lastName);
				System.out.println(aarti2.age);
				
				

				Person2 aarti3  = new Person2("disha","nimbalkar",16);
				System.out.println(aarti3.firstName);
				System.out.println(aarti3.lastName);
				System.out.println(aarti3.age);
				
				
				

		
	}

}
class Person{
	String firstName="sonali";
	String lastName="nimbalkar";
	int age=23;
	
	public void displayName() {
		System.out.println(this.firstName+this.lastName);
	}
		
}

class Person2{
	String firstName;
	String lastName;
	int age;
	
	public Person2(String fn,String ln,int ag) {
		this.firstName=fn;
		this.lastName=ln;
		this.age=ag;
	}

public void displayName() {
	System.out.println(this.firstName+this.lastName);
}
}