public class Method_16 {

	static int doubleNumber(int number) {
		
		return number * 2;
	}
	
	public static void main(String[] args) {
		
		for (int number = 1; number <= 5; number++) {
			
			int result = doubleNumber(number);

			System.out.println("Double of " + number + " is " + result);
		}

	}

}