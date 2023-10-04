package Oops;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser("chrome");
		launchBrowser("chrome",101);
		launchBrowser("chrome",102,"1200 * 800");
		
		
		
	}
	public static void launchBrowser(String browserName) {
		System.out.println(browserName+ "launch successfully");
	}

	public static void launchBrowser(String browserName, int version) {
		System.out.println(browserName+ "launch successfully"+ "with version"+ version);
	}

	public static void launchBrowser(String browserName, int version, String setting) {
		System.out.println(browserName+ "launch successfully"+ "with version" + version);
		System.out.println("Setting used to launch the browser"+ setting);
	}

}
