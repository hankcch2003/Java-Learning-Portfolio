public class BreakContinue_9 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 10) {
			
			if (i == 8) {
				
				break;
			}
			
			if (i % 2 == 0) {
				
				i++;
				
				continue;
			}
			
			System.out.println(i);
			
			i++;
		}

	}

}