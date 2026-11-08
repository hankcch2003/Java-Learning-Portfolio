public class While_11 {

	public static void main(String[] args) {
		
		int i = 1;
		
		do {
			
			if (i < 3) {
				
				System.out.println("Small");
				
			} else if (i == 3) {
				
				System.out.println("Three");
				
			} else {
				
				System.out.println("Large");
			}
			
			i++;		
		}
		
		while (i <= 5);
	}

}