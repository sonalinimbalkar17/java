package JavaBasic;

public class day3_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conditional statement
		//if
		//if else
		//else if else
		
		
				//one input and multiple output
				// numT > 0 && numT <= 5 =======> 10 % discount
				// numT > 5 && numT <= 10 =======> 20 % discount
				// numT > 10 =======> 30 % discount
				int numT=10;
				if(numT > 0 && numT <= 5) {
					System.out.println("10% discount");
				}
				if(numT>5 &&  numT<=10) {
					System.out.println("20% discount");//true
				}
				if(numT>10) {
					System.out.println("30% discount");
				}
				
				// program 2

						int num = 20;
						if (num > 0 && num <= 5) {
							System.out.println("10 % discount");
						}

						else if (num > 5 && num <= 10) {
							System.out.println("20 % discount");
						}
						else if (num > 10) {//true
							System.out.println("30 % discount");
						}
						else {
							System.out.println("Incorrect input");
						}
						
				//program3
						
						int marks=90;
						if(marks>85) {
							System.out.println("Grade A");//true
						}
						if(marks>75) {
							System.out.println("Grade B");//true
						}
						if(marks>65) {
							System.out.println("Grade C");//true
						}
						
				//program 4
						int marksB=90;
						if(marksB>85) {//true
							System.out.println("Grade A");
						}
						else if(marksB>75) {
							System.out.println("Grade B");
						}
						else if(marksB>65) {
							System.out.println("Grade C");
						}
						else {
							System.out.println("fail please try again");
						}
						
				//program 5
						int a=100;
						int b=200;
						
						if(a>b) {
							System.out.println("a is greter");
						}
						else {
							System.out.println("b is greter");
						}
				
				//program 6
						int x = 10;
						int y = 50;
						int z = 300;
						
						if(x > y && x > z) {
							System.out.println("x is greater");
						}
						else if(y > x && y > z) {
							System.out.println("y is greater");
						}
						else {//true
							System.out.println("Z is greater");
						}
						
						
				         //program 7
						//ternary operator
						
						int c=20;
						int d=40;
						
						if(c>d) {
							System.out.println("c is greter");
						}
						else {//true
							System.out.println("d is greter");
						}
						
						String result=c>d? "c is greter":"d is greter";
						System.out.println(result);
						
				
						// program 8
						
						int age = 18;
						String result2 = age >= 17 ? "can drive":"cannot drive";
						System.out.println(result2);
						
			

		

	}

}
