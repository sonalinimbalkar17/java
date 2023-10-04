package Oops;

public class day4B_Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object
		
		Son sahil=new Son("shivaji","nimbalkar","dattu","sahil");
		
		System.out.println(sahil.firstName);//shivaji
		System.out.println(sahil.lastName);//nimbalkar
		System.out.println(sahil.fname);//dattu
		System.out.println(sahil.sname);//sahil
		
		sahil.displayGName();//shivajinimbalkar
		sahil.displayFName();//dattunimbalkar
		sahil.dispaySName();//sahilnimbalkar

	}
}
//2.Multilevel (3 class)
//grandfather----father---son

class GrandFather{
	String firstName;
	String lastName;
	public GrandFather(String fn,String ln) {
		this.firstName=fn;
		this.lastName=ln;
	}
	public void displayGName() {
		System.out.println(this.firstName+this.lastName);
	}
}

class Father4 extends GrandFather{
	String fname;
	
	public Father4(String fn,String ln,String ffn) {
		super(fn,ln);
		this.fname=ffn;
	}
	public void displayFName() {
	System.out.println(this.fname+this.lastName);
	}
}

class Son extends Father4{
	String sname;
	public Son(String fn,String ln,String ffn,String sn) {
		super(fn,ln,ffn);
		this.sname=sn;
	}
	public void dispaySName() {
		System.out.println(this.sname+this.lastName);
	}
}