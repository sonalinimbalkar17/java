package JavaBasic;

public class day4_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conditional statement
		//switch case
		// switch without break
			//program1
				String city = "nagpur";
				switch(city) {
				case "pune":
					System.out.println("MH");
				case "indore":
					System.out.println("MP");
				case "jaipur":
					System.out.println("RJ");
				default:
					System.out.println("Incorrect city name");
						
				}
				
				//switch case with break
				//program2
				String city2 = "indore";
				switch(city2) {
				case "pune":
					System.out.println("MH");
					break;
				case "jaipur":
					System.out.println("RJ");
					break;
				case "indore":
					System.out.println("MP");
					break;
				default:
					System.out.println("Incoorect city name");
				}
				
				
				// program 3
				
				String city3  = "pune";
				
				switch(city3) {
				case "pune":
				case "nagpur":
					System.out.println("MH");
					break;
				case "indore":
				case "bhopal":
					System.out.println("MP");
					break;
				case "udaipur":
				case "jaipur":
					System.out.println("RJ");
					break;
				default:
					System.out.println("Incorrect city");
				}
				
				
				// program 4
			    
				int a = 10;
				int b = 50;
				int c = 300;
				
				if(a > b && a > c) {
					System.out.println("a is greater");
				}
				else if(b > a && b > c) {
					System.out.println("b is greater");
				}
				else {
					System.out.println("c is greater");
				}
			
	}

}
                