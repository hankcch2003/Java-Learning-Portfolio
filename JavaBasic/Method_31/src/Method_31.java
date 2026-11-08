public class Method_31 {

	static void countdown(int number) {
		
		if (number > 0) {
			
			System.out.println(number);

			countdown(number - 1);
		}

	}
	
	public static void main(String[] args) {
		
		countdown(5);
	}

}