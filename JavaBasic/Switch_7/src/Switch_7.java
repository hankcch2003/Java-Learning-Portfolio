public class Switch_7 {

	public static void main(String[] args) {
		
		char operation = '+';
		
		int num1 = 10;
		
		int num2 = 5;
		
		switch (operation) {
		
		case '+':
			
			System.out.println(num1 + num2);
			
		break;
		
		case '-':
			
			System.out.println(num1 - num2);
			
		break;
		
		case '*':
			
			System.out.println(num1 * num2);
			
		break;
		
		case '/':
			
			System.out.println(num1 / num2);
			
		break;
		
		default:
			
			System.out.println("Invalid operation");
		}

	}

}