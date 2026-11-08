public class IfElse_17 {

	public static void main(String[] args) {
		
		int age = 20;
		
		boolean hasTicket = true;
		
		boolean isBanned = false;
		
		if (age < 18) {
			
			System.out.println("Too young");
			
		} else if (age >= 18 && !hasTicket) {
			
			System.out.println("No ticket");
			
		} else if (age >= 18 && hasTicket == true && isBanned == true) {
			
			System.out.println("Banned");
			
		} else if (age >= 18 && hasTicket == true && !isBanned) {
			
			System.out.println("Enter");
			
		} else {
			
			System.out.println("Cannot enter");
		}

	}

}