public class Method_9 {

	static void showScore(String name, int math, int english) {
		
		System.out.println("Name" + ": " + name);
		
		System.out.println("Total" + ": " + (math + english));
	}
	
	public static void main(String[] args) {
		
		showScore("Tom", 85, 90);
	}

}