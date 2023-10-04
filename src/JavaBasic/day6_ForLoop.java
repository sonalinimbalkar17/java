package JavaBasic;

public class day6_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//loops
		//==> to perform repetative operation based on condition
		//for loop
		//for loop syntax
		//for(intialization;conditionChack;increment/decrement){
	    //statements
	//}
		//program1
		//print 5 time hello
		for(int i=1;i<=5;i++) {
			System.out.println("hello");
		}
		
		//program2
		//print 1 to 5
		for(int i=1;i<=5;i++) {//2//3//4//5//6
			System.out.println(i);//1//2//3//4//5
		}
		
		//program3
		//print 5 to 1
		for(int i=5;i>=1;i--) {
			System.out.println(i);
		}
		
		//program4
		//print table of 2
		for(int i=2;i<=20;i=i+2) {
			System.out.println(i);
		}
		
		//program5
		//print table of 2(reverse)
		for(int i=20;i>=2;i=i-2){
			System.out.println(i);
		}
		
		//program6
		//print table of 5
		for(int i=5;i<=50;i=i+5) {
			System.out.println(i);
		}
		
		// break statement with for loop

		for (int i = 0; i <= 5; i++) { // 1 // 2 //3
			if (i == 3) {
				break;
			}
			System.out.println(i); // 0 // 1 // 2
		}

		for (int i = 5; i >= 1; i--) { // 4 // 3
			System.out.println(i);// 5 //4 //3
			if (i == 3) {
				break;
			}
		}

  
		//continue statement with for loop
		
		for(int i=0;i<=5;i++) {
			if(i==3){
				continue;
			}
			System.out.println(i);//0//1//2//3//4//5
		}
		
	} 

}
