public class BreakContinue_10 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 12) {
			
			if (i == 10) {
				
				break;
			}
			
			if (i % 3 == 0) {
				
				i++;
				
				continue;
			}
			
			System.out.println(i);
			
			i++;
		}

	}

}