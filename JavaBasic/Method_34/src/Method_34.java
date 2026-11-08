public class Method_34 {

	static int factorial(int number) {
		
		if (number <= 1) {
			
			return 1;

		} else {
			
			return number * factorial(number - 1);
		}

	}
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.println(factorial(i));
		}

	}

}