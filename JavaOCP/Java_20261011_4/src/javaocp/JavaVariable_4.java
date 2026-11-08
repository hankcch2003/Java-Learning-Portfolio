package javaocp;

public class JavaVariable_4 {

	public static void main(String[] args) {
		
		char w = '熱';
		
		char x = 29105;
		
		char y = '\u71b1';
		
		System.out.printf("w = %c, x = %c, y = %c\n", w, x, y);
		
		boolean z1 = false;
		
		System.out.println(z1);

		// 不同數字系統的表示
		int a = 65;
		
		int b = 0b1000001; // 二進制
		
		int c = 0101; // 八進制
		
		int d = 0x41; // 十六進制
		
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);
	}

}