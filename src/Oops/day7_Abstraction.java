package Oops;

public class day7_Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object IDBI2
		IDBI2 Vaijapur=new IDBI2();
		Vaijapur.save();
		Vaijapur.loan();
		
		//object SBI2
		SBI2 india=new SBI2();
		india.save();
		india.loan();
	}

}
//Abstraction
// No object creation for abstract class

abstract class Baroda{
	
	public abstract void save();
	public abstract void loan();
}

class IDBI2 extends Baroda{
	@Override
	public void save() {
     System.out.println("save from IDBI2");		
	}

	@Override
	public void loan() {
	     System.out.println("loan from IDBI2");		
		
	}
}

class SBI2 extends Baroda{

	@Override
	public void save() {
    System.out.println("save the SBI2");		
	}

	@Override
	public void loan() {
	    System.out.println("loan the SBI2");		
		
	}
	
}