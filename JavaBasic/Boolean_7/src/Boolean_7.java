public class Boolean_7 {

	public static void main(String[] args) {
		
		int age = 16;
		
		boolean hasStudentCard = true;
		
		boolean isEligible = age < 18 || hasStudentCard == true;
		
		System.out.println(isEligible);
	}

}