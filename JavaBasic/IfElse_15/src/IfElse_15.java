public class IfElse_15 {

	public static void main(String[] args) {
		
		int age = 17;
		
		boolean hasStudentCard = true;
		
		if (age < 18 || hasStudentCard == true) {
			
			System.out.println("Eligible");
			
		} else {
			
			System.out.println("Not eligible");		
		}

	}

}