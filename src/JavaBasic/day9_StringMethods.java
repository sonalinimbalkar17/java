package JavaBasic;

public class day9_StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//methods of string
		//methods-----action,return types
		
		//charAt()
		String firstName="sonali";
		char q1=firstName.charAt(2);
		System.out.println(q1);//n
		
		//length()
		String lastName="nimbalkar";
		int q2=lastName.length();
		System.out.println(q2);//9
		
		//substring()
		String info="javascript";
		String q3=info.substring(2);
		System.out.println(q3);//vascript
		String q4=info.substring(3, 9);//last char not print
		System.out.println(q4);//ascrip
		
		//toUpperCase()
		String name="disha";
		String q5=name.toUpperCase();
		System.out.println(q5);//DISHA
		
		//toLowerCase()
		String name2="Disha";
		String q6=name2.toLowerCase();
		System.out.println(q6);//disha
		
		//trim()
		String city=" pune ";
		System.out.println(city.length());//6
		String q7=city.trim();
		System.out.println(q7.length());//4
		
		//startsWith()
		String city2="nagpur";
		boolean q8=city2.startsWith("n");
		System.out.println(q8);//true
		boolean q9=city2.startsWith("na");
		System.out.println(q9);//true
		
		//endsWith()
		String city3="Vaijapur";
		boolean q10=city3.endsWith("ur");
		System.out.println(q10);//true
		boolean q11=city3.endsWith("r");
		System.out.println(q11);//true
		
		//replace()
		String info2="I am learning javascript and javascript is great";
		String q12=info2.replace("I", "J");
		System.out.println(q12);
		
		//replaceFirst()
		String q13=info2.replaceFirst("javascript", "java");
		System.out.println(q13);
		
		//replaceAll()
		String q14=info2.replaceAll("javascript", "python");
		System.out.println(q14);
		
		//contains
		String q15="i am learning js";
		boolean a1=q15.contains("learning");
		System.out.println(a1);//true
		
		//indexOf()
		String city4="pune";
		int a2=city4.indexOf("u");
		System.out.println(a2);//1
		
		//lastIndexOf()
		String city5="vaijapur";
		int a3=city5.lastIndexOf("a");
		System.out.println(a3);//4
		
		// split()
		String info3 = "sonali-nimbalkar-7666985871";
		String [] vl = info3.split("-");  // {"sonali","nimbalkar","7666985871"}
		System.out.println(vl);
		//loop		
		for(int i = 0 ; i < vl.length ; i++) {
		System.out.println(vl[i]);
		}
		
		//isEmpty()
		String q16="";
		System.out.println(q16.isEmpty());//true
		
		//isBlank()
		String q17=" ";
		System.out.println(q17.isBlank());//true
		System.out.println(q17.isEmpty());//false
		
		//Equals()
		String a="hello";
		String b="hello";
		System.out.println(a.equals(b));//true
		
		//equalsIgnoreCase()
		String c="hello";
		String d="Hello";
		System.out.println(c.equalsIgnoreCase(d));//true
	}

}
