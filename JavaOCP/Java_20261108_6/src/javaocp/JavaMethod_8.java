package javaocp;

public class JavaMethod_8 {

	public static void main(String...args) {
		
		// Varargs + Primitive Widening：每個 int 參數都轉換為 double，因此選擇 test(double...)
		test(1, 2, 3); // double a
		
		System.out.println("=".repeat(30));

		int[][] b = {{1, 2}, {3, 4}};
		
		// Varargs：int[][] 可以對應 int[]...，每個可變參數元素都是 int[]
		test(b); // int[] b
		
		System.out.println("=".repeat(30));

		int a[] = {1, 2, 3, 4};
		
		// Array Runtime Type：getClass() 取得執行時期的 Class 物件，getSimpleName() 取得類別簡單名稱
		System.out.println(a.getClass().getSimpleName()); // int[]
		
		System.out.println("=".repeat(30));
		
		// Array Superclass：getSuperclass() 取得陣列類別的直接父類別，所有陣列的直接父類別都是 Object
		System.out.println(a.getClass().getSuperclass().getSimpleName()); // Object
		
		// Method Overloading：int[] 無法轉型為 long[] 或 Object[]，但可以向上轉型為 Object
		analyze(a); // 呼叫 analyze(Object)，輸出 Object, ANSWER
		
		System.out.println("=".repeat(30));
		
		byte x = 1;
		
		short y = 2;
		
		// Binary Numeric Promotion：byte + short 的運算結果為 int，因此選擇 analyze(int)
		analyze(x + y); // int
	}
	
	// Array Type：int[] 無法轉型為 long[]，即使 int 可以自動轉型為 long
	static void analyze(long[] o) {
		
		System.out.println("long[]");
	}
	
	// Method Overloading：參數型態完全符合時，優先於 Primitive Widening 和 Autoboxing
	static void analyze(int o) {
		
		System.out.println("int");
	}
	
	// Primitive Widening：int 可以自動轉型為 long
	static void analyze(long o) {
		
		System.out.println("long");
	}
	
	// Autoboxing：int 可以自動裝箱為 Integer
	static void analyze(Integer o) {
		
		System.out.println("Integer");
	}
	
	// Reference Widening：Integer 可以向上轉型為 Number
	static void analyze(Number o) {
		
		System.out.println("Number");
	}
	
	// Array Type：Object[] 可以接收 Reference Array，例如 String[]，但不能接收 int[]
	static void analyze(Object[] o) {
		
		System.out.println("Object[]");
	}
	
	// Reference Widening：所有陣列型態 (包含 Primitive Array) 都可以向上轉型為 Object
	static void analyze(Object o) {
		
		System.out.println("Object, ANSWER");
	}
	
	// Varargs：可變參數，接收多個 double
	static void test(double...a) {
		
		System.out.println("double a");
	}
	
	// Varargs：每個可變參數的元素型態都是 int[]
	static void test(int[]...b) {
		
		System.out.println("int[] b");
		
		System.out.println("=".repeat(30));
		
		for (int[] x : b) {
			
			for (int y : x) {
				
				System.out.print(y + " ");
			}
			
			System.out.println();
		}

	}

}