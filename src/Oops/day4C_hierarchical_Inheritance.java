package Oops;

public class day4C_hierarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object
		
		SonA sahil=new SonA("nirmala","nimbalkar","sahil");
		DaughterB disha=new DaughterB("nirmala","nimbalkar","disha");
		System.out.println(sahil.firstName);//nirmala
		System.out.println(sahil.lastName);//nimbalkar
		System.out.println(sahil.sname);//sahil
		sahil.displayMName();//nirmala nimbalkar
		sahil.displaySName();//sahil nimbalkar
		
		System.out.println(disha.firstName);
		System.out.println(disha.lastName);
		System.out.println(disha.dname);
		disha.displayMName();
		disha.displayDName();


	}

}
//3.hierarchical (3 class)
//1 parent 2 child

class Mother{
	String firstName;
	String lastName;
	public Mother(String fn,String ln) {
		this.firstName=fn;
		this.lastName=ln;
	}
	public void displayMName() {
		System.out.println(this.firstName+this.lastName);
	}
}

class SonA extends Mother{
	String sname;
	public SonA(String fn,String ln,String sn) {
		super(fn,ln);
		this.sname=sn;
	}
	public void displaySName() {
		System.out.println(this.sname+this.lastName);
	}
}

class DaughterB extends Mother{
	String dname;
	public DaughterB(String fn,String ln,String dn) {
		super(fn,ln);
		this.dname=dn;
	}
	public void displayDName() {
		System.out.println(this.dname+this.lastName);
	}
}