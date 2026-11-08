public class Method_17 {

	static int squareNumber(int number) {
		
		return number * number;
	}
	
	public static void main(String[] args) {
		
		for (int number = 1; number <= 5; number++) {
			
			int result = squareNumber(number);
			
			System.out.println("Square of " + number + " is " + result);
		}

	}

}