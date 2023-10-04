package Oops;

public class day3_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object
		//program 1 object
		Student aarti=new Student();
		
		System.out.println(aarti.firstName);
		System.out.println(aarti.lastName);
		System.out.println(aarti.adharNo);
		aarti.displayName();

		
		Teacher aarti2=new Teacher();
		
		System.out.println(aarti2.salary);
		System.out.println(aarti2.firstName);
		System.out.println(aarti2.lastName);
		System.out.println(aarti2.adharNo);
		aarti2.displayName();
		aarti2.displaySalary();

		//program 2 object
		
		Teacher2 divya = new Teacher2("aarti","patil","123",10000);
		
		System.out.println(divya.firstName);
		System.out.println(divya.lastName);
		System.out.println(divya.adharno);
		divya.displayName();
		divya.displaySalary();


	}

}

//inheritance
//program 1
class Student{
	String firstName="sonali";
	String lastName="nimbalkar";
	String adharNo="123";
	
	public void displayName() {
		System.out.println(this.firstName+this.lastName);
	}
}

//Repetition
//class Teacher {
//	String firstName = "sonali";
//	String lastName = "nimbalkar";
//	String  adharNo = "123";
//	int salary = 100000;
//	
//	public void displayName() {
//		System.out.println(this.firstName + this.lastName);
//	}
//	public void displaySalary() {
//		System.out.println(this.salary)
//	}
//	
//}


//avoid repetition
class Teacher extends Student{
	int salary=100000;
	
	public void displaySalary() {
		System.out.println(this.salary);
	}

}

//program 2
class Student2 {
	String firstName;
	String lastName;
	String adharno;
	
	public Student2(String fn , String ln , String adhno) {	
		this.firstName = fn;
		this.lastName = ln;
		this.adharno = adhno;
		
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class Teacher2 extends Student2 {
	int salary ;
	public Teacher2(String fn, String ln, String adhno,int sy) {
		super(fn, ln, adhno);
		this.salary = sy;		
	}
	public void displaySalary() {
		
		System.out.println(this.salary);
	}
	
}


