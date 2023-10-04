package JavaBasic;

public class day8_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string
		//properties and methods
		//string stores the value by index
		String first_name=new String("sonali");
		String last_name="nimbalkar";
		System.out.println(first_name);//sonali
		System.out.println(last_name);//nimbalkar
		
		String city="pune";
		System.out.println(city);//pune
		
		System.out.println(city.charAt(0));
		System.out.println(city.charAt(1));
		System.out.println(city.charAt(2));
		System.out.println(city.charAt(3));

		// printing every character of string
		//for loop
		String city2="vaijapur";
		for (int i = 0; i <city2.length(); i++) {
			//System.out.println(i);
			System.out.println(city2.charAt(i));
		}
		
		// print the characters in reverse
		// length -1 is always the last index
		
		for(int i=city2.length()-1;i>=0;i--) {
			System.out.println(city2.charAt(i));
		}
		
		// program 2 
		
				// int + int            =====> int 
				// int + string         =====> string 
				// string + int         =====> string 
				// string + string      ======> string 
				
				
				int a = 10;
				int b = 50;
				String c = "hello";
				System.out.println(a+b+c);
				System.out.println(b+c+a);
				System.out.println(c+a+b);
				
				
				String first_namea = "sonali";
				String last_nameb = "nimbalakar";
			
				System.out.println("My firstname is "+first_namea +" my lastName name is "+last_nameb);
				
				String greeting = "hello";
				String greet = greeting.concat("world !");
				System.out.println(greet);
				
				
				// charAt()
				// length()
				// contact()
				
				// program 3
				
				String firstName2 = "aarti";
				String q1 = firstName2.toUpperCase();
				System.out.println(q1);
				
				// program 4
				

				String firstName3 = "AARTI";
				String q2 = firstName3.toLowerCase();
				System.out.println(q2);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
