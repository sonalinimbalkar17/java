package Oops;

public class day9_SingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//access modifiers
		//public,protected,default and private
		
		PersonD d=new PersonD();
		d.display();
		
		PersonE e=new PersonE();
		e.display();
		
		PersonF f=new PersonF();
		f.display2();
		
		PersonG g=new PersonG();
		g.display();
		g.display2();
		
		
		
		
	}

}

class PersonD{
	
	void display() {
		System.out.println("Hello world ...");
	}
}

class PersonE{
	public void display() {
		System.out.println("Hello world ...");
	}
}

class PersonF{
	private void display() {
		System.out.println("Hello world ...");
	}
	
	public void display2() {
		System.out.println("Hello world 2");
		this.display();
	}
}

class PersonG{
	protected void display() {
		System.out.println("Hello world ...");
	}
	public void display2() {
		System.out.println("Hello world 2");
		this.display();
	}
}