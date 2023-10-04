package Oops;

public class day4_Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object
		Teacher3 disha=new Teacher3("disha","nimbalkar","10",1000);
		System.out.println(disha.firstName);
		System.out.println(disha.lastName);
		System.out.println(disha.rollNo);
		System.out.println(disha.Salary);
		
		disha.displayName();
		disha.displaySalary();
		
	}

}

//inheritance
//types of inheritance
//1.single----student and teacher(2 class)

class Student3{
	String firstName;
	String lastName;
	String rollNo;
	public Student3(String fn,String ln,String rn) {
		this.firstName=fn;
		this.lastName=ln;
		this.rollNo=rn;
	}
	public void displayName() {
		System.out.println(this.firstName+this.lastName);
	}
}

class Teacher3 extends Student3{
	int Salary;
	public Teacher3(String fn,String ln,String rn,int sy) {
		super(fn,ln,rn);
		this.Salary=sy;
	}
	public void displaySalary(){
		System.out.println(this.Salary);
	}
}