public class Boolean_10 {

	public static void main(String[] args) {
		
		int age = 17;
		
		boolean hasStudentCard = true;
		
		boolean isBanned = false;
		
		boolean canJoin = (age >= 18 || hasStudentCard == true) && isBanned == false;
		
		System.out.println(canJoin);
	}

}