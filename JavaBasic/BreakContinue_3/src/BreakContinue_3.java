public class BreakContinue_3 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 10) {
			
			if (i % 3 == 0) {
				
				i++;
				
				continue;

			} else {
				
				System.out.println(i);
				
				i++;
			}
			
		}

	}

}