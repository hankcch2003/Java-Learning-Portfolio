public class Method_28 {

	static int sumNumber(int number) {
		
		if (number > 0) {
			
			return number + sumNumber(number - 1);
				
		} else {
			
			return 0;
		}

	}
	
	public static void main(String[] args) {
		
		System.out.println(sumNumber(5));
	}

}