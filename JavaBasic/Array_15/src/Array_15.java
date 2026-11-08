public class Array_15 {

	public static void main(String[] args) {
		
		int[] numbers = {5, 15, 25, 35, 45, 55};
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			sum = sum + numbers[i];
		}
		
		System.out.println(sum);
	}

}