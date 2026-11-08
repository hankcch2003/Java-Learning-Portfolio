public class Array_27 {

	public static void main(String[] args) {
		
		int[][] numbers = {{10, 20, 30}, {40, 50}, {60, 70, 80, 90}};
		
		for (int row = 0; row < numbers.length; row++) {
			
			for (int col = 0; col < numbers[row].length; col++) {
				
				System.out.println(numbers[row][col]);
			}

		}
		
	}

}