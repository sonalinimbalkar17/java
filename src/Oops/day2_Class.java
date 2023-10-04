package Oops;

public class day2_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vehicle audi=new Vehicle();
		
		System.out.println(audi.color);//red
		System.out.println(audi.type);//sedane
		
		audi.displayColor();//red
		String ty=audi.displayType();
		System.out.println(ty);//sedane
		
		
		Vehicle audi2=new Vehicle();
		System.out.println(audi2.color);
		System.out.println(audi2.type);
		
		audi2.displayColor();
		String ty2=audi.displayType();
		System.out.println(ty2);
		
		audi2.color = "black";
		audi2.type = "SUV";
		
		audi2.displayColor();
		String ty3 = audi2.displayType();
		System.out.println(ty3);
		
		
		Vehicle2 audi3 = new Vehicle2("SUV","pink");
		audi3.displayColor();
		String ty5 = audi3.displayType();
		System.out.println(ty5);
		
		
		Vehicle2 audi4 = new Vehicle2("Sedane","red");
		audi4.displayColor();
		String ty4 = audi4.displayType();
		System.out.println(ty4);
		
		
		
		Vehicle3 audi5 = new Vehicle3();
		
		System.out.println(audi5.color);
		System.out.println(audi5.type);
		
		
		audi5.setColor("blue");
		audi5.setType("Jeep");
		
		System.out.println(audi5.color);//blue
		System.out.println(audi5.type);//jeep
		
	}

}

//user defined data type

class Vehicle{
	String type="sedane";
	String color="red";
	
	public void displayColor() {
		System.out.println(this.color);
	}
	public String displayType() {
		return this.type;
	}
}


 class Vehicle2{
	 String type;
	 String color;
	 
	 public Vehicle2(String ty,String cl) {
		 this.type=ty;
		 this.color=cl; 
     
	 }
	 public void displayColor() {
    	 System.out.println(this.color);
     }
	 public String displayType() {
		 return this.type;
	 }
 }

 
 class Vehicle3 {
		String color;
		String type;
		
	public String setColor(String cl) {
		this.color = cl;
		return this.color;
	}	
			
	public String setType(String ty) {
		this.type = ty;
		return this.type;
	}
	
	

}