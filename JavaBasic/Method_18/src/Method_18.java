public class Method_18 {

	static int add(int a, int b) {
		
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
		int result1 = add(10, 20);
		
		int result2 = add(10, 20, 30);
		
		System.out.println(result1);
		
		System.out.println(result2);
	}

}