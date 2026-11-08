public class Math_11 {

	public static void main(String[] args) {
		
		int firstNumber = -25;
		
		int secondNumber = 16;
		
		int base = 3;
		
		int exponent = 2;
		
		double decimalNumber = 8.7;
		
		int absoluteNumber = Math.abs(firstNumber);
		
		int maxNumber = Math.max(firstNumber, secondNumber);
		
		int minNumber = Math.min(firstNumber, secondNumber);
		
		double squareRoot = Math.sqrt(secondNumber);
		
		double power = Math.pow(base, exponent);
		
		long roundedNumber = Math.round(decimalNumber);
		
		double ceilingNumber = Math.ceil(decimalNumber);
		
		double floorNumber = Math.floor(decimalNumber);
		
		int randomNumber = (int)(Math.random() * 101);
		
		System.out.println(absoluteNumber);
		
		System.out.println(maxNumber);
		
		System.out.println(minNumber);
		
		System.out.println(squareRoot);
		
		System.out.println(power);
		
		System.out.println(roundedNumber);
		
		System.out.println(ceilingNumber);
		
		System.out.println(floorNumber);
		
		System.out.println(randomNumber);
	}

}