public class Array_24 {

	public static void main(String[] args) {
		
		String[][] colors = {{"Red", "Blue"}, {"Green", "Yellow"}, {"Black", "White"}};
		
		colors[0][1] = "Purple";
		
		colors[2][0] = "Orange";
		
		System.out.println(colors[0][1]);
		
		System.out.println(colors[2][0]);
	}

}