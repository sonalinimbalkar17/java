package Oops;

public class day8C_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TeacherN Disha=new TeacherN("sonali","nimbalkar",23,"30000");
		Disha.displayCountryName();
		Disha.displayName();
	}

}

interface Rule{
	public void displayCountryName();
}

class StudentN{
	String firstName;
	String lastName;
	int age;
	
	public StudentN(String fn,String ln,int age) {
		this.firstName=fn;
		this.lastName=ln;
		this.age=age;
	}
	public void displayName() {
		System.out.println(this.firstName+this.lastName);
	}
}

class TeacherN extends StudentN implements Rule{

	String salary;
	public TeacherN(String fn,String ln,int age,String salary) {
		super(fn,ln,age);
		this.salary=salary;
	}
	@Override
	public void displayCountryName() {
		System.out.println("india");		
	}
	
}