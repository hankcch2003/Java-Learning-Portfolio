public class Method_20 {

	static int calculate(int a, int b) {
		
		return a + b;
	}
	
	static int calculate(int a, int b, int c) {
		
		return a + b + c;
	}
	
	static double calculate(double a, double b) {
		
		return a + b;
	}
	
	public static void main(String[] args) {

		int result1 = calculate(10, 20);
		
		int result2 = calculate(10, 20, 30);
		
		double result3 = calculate(2.5, 3.5);
		
		System.out.println(result1);
		
		System.out.println(result2);
		
		System.out.println(result3);
	}

}