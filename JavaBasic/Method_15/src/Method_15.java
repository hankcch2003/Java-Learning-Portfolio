public class Method_15 {

	static int getMax(int a, int b) {
		
		if (a < b) {
			
			return b;

		} else {
			
			return a;
		}

	}
	
	public static void main(String[] args) {
			
		int result = getMax(18, 25);
			
		System.out.println(result);
	}

}