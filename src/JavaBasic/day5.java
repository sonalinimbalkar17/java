package JavaBasic;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    
		int q1=GreaterNum(10,50,30);
		
		switch(q1) {
		case 1:
			System.out.println("x is greater");
			break;
			
		case 2:
			System.out.println("y is greater");
			break;
			
		case 3:
			System.out.println("z ia greater");
			break;
		}
		
		
		
	}

	private static int GreaterNum(int x, int y, int z) {
		if(x>y && x>z) {
			return 1;
		}
		else if(y>z && y>x) {
			return 2;
		}
		else {
			return 3;
		}
	}

}