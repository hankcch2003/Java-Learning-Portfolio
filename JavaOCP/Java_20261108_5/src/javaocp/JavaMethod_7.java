package javaocp;

public class JavaMethod_7 {

	public static void main(String...args) {
		
		// 傳入 int 型態，優先呼叫完全符合的方法
		intPri(11); // 相同型態
	}
	
	// Method Overloading：參數型態完全相同，優先選擇
	static void intPri(int a) {
		
		System.out.println("相同型態");
	}
	
	// 自動轉型：int 可以自動轉型為 double
	static void intPri(double a) {
		
		System.out.println("自動轉型");
	}
	
	// 自動裝箱：int 可以自動裝箱為 Integer
	static void intPri(Integer a) {
		
		System.out.println("自動裝箱");
	}
	
	// Varargs：可變參數，只有其他適用方法都無法優先選擇時才考慮
	static void intPri(int...a) {
		
		System.out.println("變動參數型態");
	}

}