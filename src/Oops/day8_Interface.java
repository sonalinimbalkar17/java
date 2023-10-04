package Oops;

public class day8_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle a=new Rectangle();
		a.getArea(10, 5);
		
	}

}
//
interface Polygon{
	public void getArea(int length,int breadth);
}

class Rectangle implements Polygon{

	@Override
	public void getArea(int length, int breadth) {
       System.out.println(length*breadth);		
	}
	
}