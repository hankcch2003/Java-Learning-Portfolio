public class Operators_12 {

	public static void main(String[] args) {
		
		int firstNumber = 20;
		
		int secondNumber = 8;
		
		int result = firstNumber * secondNumber;
		
		result += 10;
		
		boolean isGreater = result > 100;
		
		boolean isEven = result % 2 == 0;
		
		boolean finalResult = isGreater && isEven;
		
		System.out.println(result);
		
		System.out.println(isGreater);
		
		System.out.println(isEven);
		
		System.out.println(finalResult);
	}

}