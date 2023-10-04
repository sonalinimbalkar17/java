package Oops;

public class day6B_Polymorphism_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SonB Sahil=new SonB("shivaji","nimbalkar","dattu","sahil");
		Sahil.displayName();//sahilnimbalkar//dattunimbalkar//shivajinimbalkar
				
	}

}

class GrandFatherB{
	String FirstName;
	String LastName;
	
	public GrandFatherB(String fn , String ln) {
		this.FirstName=fn;
		this.LastName=ln;
	}
	public void displayName() {
		System.out.println(this.FirstName+this.LastName);
	}
}
class Father extends GrandFatherB{
	String fname;
	public Father(String fn,String ln, String ffn) {
		super(fn,ln);
		this.fname=ffn;
	}
	public void displayName() {
		System.out.println(this.fname+this.LastName);
		super. displayName();
	}
}

class SonB extends Father{
	String sname;
	public SonB(String fn,String ln,String ffn, String ssn) {
		super(fn,ln,ffn);
		this.sname=ssn;
	}
	public void displayName() {
		System.out.println(this.sname+this.LastName);
		super.displayName();
	}
	
}