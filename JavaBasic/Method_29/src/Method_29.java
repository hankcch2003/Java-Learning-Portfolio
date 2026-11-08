public class Method_29 {

	static int sumNumbers(int number) {
		
		if (number > 0) {
			
			return number + sumNumbers(number - 1);

		} else {
			
			return 0;
		}

	}
	
	public static void main(String[] args) {

		System.out.println(sumNumbers(5));
	}

}