package JavaBasic;

public class day2_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// comparison operator
		// < , > , <= , >= , != , ==

				boolean a = 8 < 9;
				System.out.println(a);//true

				System.out.println(8 > 9); // false
				System.out.println(8 == 8); // true
				System.out.println(8 != 9); // true
				System.out.println(8 <= 9); // true
				System.out.println(8 >= 9); // false
				System.out.println(8 < 9); // true
				System.out.println(8 > 9); // false
          
	
           //logical operator
				// && AND

				// true && true =====> true
				// false && true =====> false
				// true && false =====> false
				// false && false ====> false

				System.out.println(8 != 7 && 9 == 9);
				System.out.println(8 == 7 && 9 == 9);
				System.out.println(8 != 7 && 9 != 9);
				System.out.println(8 == 7 && 9 != 9);

				// || OR

				// true || true =====> true
				// false || true =====> true
				// true || false =====> true
				// false || false =====> false

				System.out.println(8 != 7 || 9 == 9); // true
				System.out.println(8 == 7 || 9 == 9); // true
				System.out.println(8 != 7 || 9 != 9); // true
				System.out.println(8 == 7 || 9 != 9); // false

				// not !

				System.out.println(!(9 == 9)); //false
				System.out.println(!(9 != 9));   //true
				
	}

}   