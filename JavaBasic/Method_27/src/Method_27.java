public class Method_27 {

	static void countDown(int number) {
		
		if (number > 0) {
			
			System.out.println(number);
			
			countDown(number - 1);
		}

	}
	
	public static void main(String[] args) {
		
		countDown(5);
	}

}