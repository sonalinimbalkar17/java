package Oops;

public class day5B_Polymorphism_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SBI Vaijapur = new SBI();
		Vaijapur.loan();
		Vaijapur.save();
	}
	
}
//different class , same method and same signature (inheritance)
// overriding

 class WorldBank{
	 public void loan() {
		 System.out.println("i am loan from WorldBank ");
	 }
	 public void save() {
		 System.out.println("i am save from WorldBank");
	 }
 }
 class SBI extends WorldBank {
		
		public void loan() {
			System.out.println("I am loan from sbi");
		}
		
		public void save() {
			System.out.println("I am save from sbi");
		}
	}

	class  IDBI extends WorldBank{
		public void loan() {
			System.out.println("I am loan from IDBI");
		}
		
		public void save() {
			System.out.println("I am save from IBDI");
		}
	}