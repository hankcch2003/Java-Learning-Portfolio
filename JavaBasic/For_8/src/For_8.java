public class For_8 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			if (i < 4) {
				
				System.out.println("Small");
				
			} else if (i == 4) {
				
				System.out.println("Four");
				
			} else if (i > 4 && i <= 7) {
				
				System.out.println("Medium");
				
			} else {
				
				System.out.println("Large");
			}
			
		}

	}

}