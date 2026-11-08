package javaocp;

public class Java_datatype {

	static int intVar; //0
	
	static float floatVar; //0.0
	
	static char charVar; //\u0000(空字元)

	static boolean boolVar; //false
	
	static String stringVar; //null

	public static void main(String[] args) {
		
		int grade = 120;
		
		System.out.println("成績 = " + grade);

		System.out.println("intVar = " + intVar);
		
		System.out.println("floatVar = "+ floatVar);
		
		System.out.println("charVar = " + charVar);
		
		System.out.println("booleanVar = " + boolVar);
		
		System.out.println("stringVar = " + stringVar);
		
		System.out.println(2147483648L);
		
		byte a = 127;
		
		double b = 1.2;

		float c = 1.2f;
		
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
	}

}