public class While_10 {

	public static void main(String[] args) {
		
		int i = 1;
		
		do {
			
			if (i % 2 == 0) {
				
				System.out.println("Even");
				
			} else {
				
				System.out.println("Odd");
			}
			
			i++;	
		}
		
		while (i <= 5);
	}

}