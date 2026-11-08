public class Array_30 {

	public static void main(String[] args) {
		
		int[][] numbers = {{10, 20, 30}, {5, 15}, {40, 25, 10}};
		
		int sum = 0;
		
		for (int[] rol : numbers) {
			
			for (int number : rol) {
				
				sum = sum + number;
			}
			
		}
		
		System.out.println(sum);
	}

}