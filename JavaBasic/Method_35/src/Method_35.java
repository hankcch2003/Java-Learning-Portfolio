public class Method_35 {

	static String getGrade(int score) {
		
		if (score >= 90) {
			
			return "A";

		} else if (score >= 80) {
			
			return "B";

		} else if (score >= 70) {
			
			return "C";

		} else if (score >= 60) {
			
			return "D";

		} else {
			
			return "F";
		}

	}
	
	static boolean isPassed(int score) {
		
		if (score >= 60) {
			
			return true;

		} else {
			
			return false;
		}

	}
	
	static void showResult(String name, int score) {
		
		String grade = getGrade(score);
		
		boolean passed = isPassed(score);
		
		System.out.println(name);
		
		System.out.println(score);
		
		System.out.println(grade);
		
		System.out.println(passed);
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		String[] names = {"Amy", "Bob", "Tom"};
		
		int[] grades = {95, 72, 45};
		
		for (int i = 0; i < 3; i++) {
			
			showResult(names[i], grades[i]);
		}

	}

}