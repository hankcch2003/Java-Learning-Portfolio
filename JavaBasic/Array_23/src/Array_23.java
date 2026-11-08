public class Array_23 {

	public static void main(String[] args) {
		
		int[][] numbers = {{10, 20, 30}, {40, 50, 60}};
		
		numbers[0][1] = 25;
		
		numbers[1][2] = 65;
		
		System.out.println(numbers[0][1]);
		
		System.out.println(numbers[1][2]);
	}

}