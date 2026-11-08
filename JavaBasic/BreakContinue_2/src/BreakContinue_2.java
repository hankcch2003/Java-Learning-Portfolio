public class BreakContinue_2 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 10) {
			
			if (i % 2 == 0) {
				
				System.out.println(i);
			}
			
			if (i == 7) {
				
				break;	
			}
			
			i++;
		}

	}

}