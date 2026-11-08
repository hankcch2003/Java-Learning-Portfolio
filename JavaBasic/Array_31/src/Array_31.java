public class Array_31 {

	public static void main(String[] args) {
		
		int[][] scores = {{80, 75, 90}, {60, 85}, {95, 70, 88, 92}};
		
		int sum = 0;
		
		for (int row = 0; row < scores.length; row++) {
			
			for (int score : scores[row]) {
				
				sum = sum + score;
			}

		}
		
		System.out.println(sum);
	}

}