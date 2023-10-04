package Oops;

public class day9C_SingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DatabaseB b = DatabaseB.createObj();
		b.getConnection();//connection to DB
		
		DatabaseB c =DatabaseB.createObj();
		c.getConnection();//connection to DB
	}

}

class DatabaseB{
	
	private static DatabaseB obj;//null
	private DatabaseB() {
		
	}
	
	public static DatabaseB createObj() {
		if(obj==null) {
			obj=new DatabaseB();
		}
		
		return obj;
	}
	
	public void getConnection() {
		System.out.println("connection to DB");
	}
	
	
	
}