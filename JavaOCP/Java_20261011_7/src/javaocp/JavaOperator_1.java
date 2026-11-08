package javaocp;

public class JavaOperator_1 {

	public static void main(String[] args) {
		
		// 算術運算子會將結果存在 int 暫存，所以運算後的資料型態皆為 int
		// 遞增/遞減運算子及複合指定運算子則不會存到 int 暫存

		byte a = 1;
		
		// a = a + 1; 編譯錯誤，int 無法自動轉為 byte
		
		a = (byte)(a + 1); // 需強制轉型為 byte
		
		System.out.println("a = " + a);
		
		// 複合指定運算子
		byte b = 1;
		
		b += 1;
		
		System.out.println("b = " + b);
		
		// 遞增運算子 ++
		byte c = 1;
		
		c++;
		
		System.out.println("c = " + c);
		
		byte d = 2;
		
		++d;
		
		System.out.println("d = " + d);
		
		int x = 5, y = 6, z = 0;
		
		z = x++ + ++x+y++ + ++x+ ++y+x++;
		
		System.out.printf("x = %d, y = %d, z = %d\n", x, y, z);
	}

}