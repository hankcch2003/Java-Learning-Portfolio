public class Boolean_9 {

	public static void main(String[] args) {
		
		int age = 20;
		
		boolean hasTicket = true;
		
		boolean isBanned = false;
		
		boolean canEnter = age >= 18 && hasTicket == true && isBanned == false;
		
		System.out.println(canEnter);
	}

}