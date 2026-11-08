public class Method_30 {

	static int sumRange(int start, int end) {
		
		if (end > start) {
			
			return end + sumRange(start, end - 1);

		} else {
			
			return end;
		}

	}
	
	public static void main(String[] args) {
		
		System.out.println(sumRange(5, 10));
	}

}