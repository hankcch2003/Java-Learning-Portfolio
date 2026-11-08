public class IfElse_13 {

	public static void main(String[] args) {
		
		int score = 85;
		
		boolean hasBonus = false;
		
		if (score >= 60) {
			
			if (hasBonus == true) {
				
				System.out.println("Pass with bonus");
				
			} else {
				
				System.out.println("Pass");
				
			}
			
		} else {
			
			System.out.println("Fail");		
		}

	}

}