public class While_6 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 10) {
			
			if (i < 5) {
				
				System.out.println("Small");
				
			} else if (i == 5) {
				
				System.out.println("Five");
				
			} else {
				
				System.out.println("Large");
			}
			
			i++;		
		}

	}

}