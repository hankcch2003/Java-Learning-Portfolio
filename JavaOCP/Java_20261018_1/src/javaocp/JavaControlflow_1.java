package javaocp;

public class JavaControlflow_1 {

	public static void main(Integer[] args) {
		
		System.out.println("asdfadf");
	}
	
	public static void main(char[] args) {
		
		System.out.println("asdfadf");
	}
	
	static int callbyValue(int var) {
		
		var = var * 200;
		
		return var;
	}
	
	public static void main(String[] args) {
		
		char ch = '\u0000';
		
		System.out.println(ch);

		int var = 200;
		
		System.out.println(callbyValue(var));
		
		System.out.println(var);
		
		int a = 9;
		
		if (a++ < 10) {
			
			System.out.println(a + "hello");

		} else {
			
			System.out.println(a + "no ok");
		}
		
		a = 9;
		
		if (++a < 10) {
			
			System.out.println(a + "hello");

		} else {
			
			System.out.println(a + "no ok");
		}
		
		System.out.println("這是傳進來的內容：" + args[0] + ", " + args[1]);
	
		// 比對參數需小於等於 int，即 byte、short、char、int、Byte、Short、Character、Integer、String、enum (列舉)	
		Character menu = 5;
		
		final int b = 3;
		
		switch (menu) {
		
		default:
			
			System.out.println("no digit");
			
			break;
		
		case 1:
			
			System.out.println("1");
			
			break;
			
		case 2:
			
			System.out.println("2");
			
			break;
			
		case b: // 比對子只能為 literal 或是 constant (常數)
			
			System.out.println("3");
			
			break;
		}

	}

}