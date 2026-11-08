public class Array_29 {

	public static void main(String[] args) {
		
		String[][] items = {{"Apple", "Banana"}, {"Cat", "Dog", "Bird"}, {"Red", "Blue"}};
		
		for (String[] row : items) {
			
			for (String item : row) {
				
				System.out.println(item);
			}

		}

	}

}