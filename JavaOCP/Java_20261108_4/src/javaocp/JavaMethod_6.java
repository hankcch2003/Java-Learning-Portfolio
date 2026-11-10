package javaocp;

import java.util.Arrays;

public class JavaMethod_6 {

	public static void main(String[] args) {
		
		// 呼叫 test (int, double)：int 可以自動轉型為 double
		new JavaMethod_6().test(1, 1);
		
		// 呼叫可變參數方法，可以不傳入任何參數
		testVar();
		
		System.out.println("=".repeat(30));
		
		// Varargs：可以傳入多個 int 參數
		testVar(1, 2, 3);
		
		System.out.println("=".repeat(30));
		
		int b[] = {1, 2, 3, 4, 5};
		
		// int...a 本質上就是 int[]，可以直接傳入陣列
		testVarb(b);
		
		System.out.println("=".repeat(30));
		
		// 直接建立匿名 int 陣列並傳入方法
		testVarb(new int[] {11, 22, 33, 44, 55});
	}
	
	// int...a：可變參數，可以接收 0 個或多個 int 值，本質上是陣列
	static void testVar(int...a) {
		
		System.out.println(a);
		
		System.out.println(Arrays.toString(a));
	}
	
	// int[] a：接收 int 陣列，不能直接傳入多個獨立的 int 參數
	static void testVarb(int[] a) {
		
		System.out.println(a);
		
		System.out.println(Arrays.toString(a));
	}
	
	// Method Overloading：依照參數型態及順序決定呼叫哪個方法
	void test(int a, double b) {
		
		System.out.println("int, double");
		
		System.out.println("=".repeat(30));
	}
	
	void test(double a, String b) {
		
		System.out.println("double, String");
	}

}