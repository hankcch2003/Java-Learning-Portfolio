public class Array_28 {

	public static void main(String[] args) {
		
		int[][] numbers = {{10, 20, 30}, {5, 15}, {40, 25, 10}};
		
		int sum = 0;
		
		for (int row = 0; row < numbers.length; row++) {
			
			for (int col = 0; col < numbers[row].length; col++) {
				
				sum = sum + numbers[row][col];
			}

		}
		
		System.out.println(sum);
	}

}