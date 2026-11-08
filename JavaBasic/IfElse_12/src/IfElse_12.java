public class IfElse_12 {

	public static void main(String[] args) {
		
		int age = 20;
		
		boolean hasID = true;
		
		if (age >= 18) {
			
			if (hasID == true) {
				
				System.out.println("Allowed");
				
			} else {
				
				System.out.println("ID required");
				
			}
			
		} else {
			
			System.out.println("Too young");		
		}
		
	}

}