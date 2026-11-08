public class Method_32 {

	static void countdown(int number) {
		
		if (number > 0) {
			
			System.out.println(number);
			
			countdown(number - 2);
		}

	}
	
	public static void main(String[] args) {
		
		countdown(10);
	}

}