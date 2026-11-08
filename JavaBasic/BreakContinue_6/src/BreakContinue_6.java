public class BreakContinue_6 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == 6) {
				
				break;
			}
			
			if (i % 2 == 0) {
				
				System.out.println(i);
			}
			
		}

	}

}