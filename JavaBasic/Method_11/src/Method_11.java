public class Method_11 {

	static void checkTemperature(int temperature) {
		
		if (temperature < 20) {
			
			System.out.println("Wear a jacket.");

		} else {
			
			System.out.println("No jacket needed.");
		}

	}
	
	public static void main(String[] args) {
		
		checkTemperature(18);
	}

}