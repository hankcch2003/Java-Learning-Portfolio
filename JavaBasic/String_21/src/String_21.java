public class String_21 {

	public static void main(String[] args) {
		
		String firstName = "Chen";
		
		String lastName = "Cheng Han";
		
		String text = "Java Programming";
		
		int number = 10;
		
		String fullName = firstName + " " + lastName;
		
		int length = text.length();
		
		String upperText = text.toUpperCase();
		
		String lowerText = text.toLowerCase();
		
		int position = text.indexOf("Programming");
		
		String message = "The number is " + number;
		
		System.out.print(fullName + "\n");
		
		System.out.print(text + "\n");
		
		System.out.print(length + "\n");
		
		System.out.print(upperText + "\n");
		
		System.out.print(lowerText + "\n");
		
		System.out.print(position + "\n");
		
		System.out.println(message);
	}

}