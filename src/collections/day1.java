package collections;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person sonali=new Person("sonali","nimbalkar");
		Person shweta=new Person("shweta","gorse");
		Person kalyani=new Person("kalyani","hadole");
		Person shital=new Person("shital","jadhav");
		Person kirti=new Person("kirti","pawar");

		//Person [] students=new Person[5];
		Person [] students= {sonali,shweta,kalyani,shital};
		//for loop
		for(int i=0;i<=students.length;i++) {
			System.out.println(students[i].first_name);
			System.out.println(students[i].last_name);
			students[i].displayName();
		}
		//for each loop
		for(Person student:students) {
			System.out.println(student.first_name);
			System.out.println(student.last_name);
			student.displayName();
		}
		
		
		
		
		
	}

}
//user defined data types
//properties and methods

class Person{
	String first_name;
	String last_name;
	
	public Person(String fn,String ln) {
		this.first_name=fn;
		this.last_name=ln;
	}
	public void displayName() {
		System.out.println(this.first_name+this.last_name);
	}
	
}