package javaocp;

public class JavaWrappedClass_5 {

	// public：任何 package 都可以存取
	// int b：final 實例變數，每個物件各自擁有一份

	public final int b;
	
	public static void main(String[] args) {
		
		// new：建立物件，呼叫無參數建構子
		new JavaWrappedClass_5();

	}
	
	// Constructor：無參數建構子
	// 建構子名稱與 class 名稱相同，沒有回傳型態

	JavaWrappedClass_5() {
		
		// this()：呼叫同一個 class 的其他建構子
		// 必須放在建構子的第一行
		// 傳入 121，呼叫一個參數的建構子
		
		this(121);
		
		System.out.println("這是無參數建構子");
		
		// new：建立另一個物件，呼叫兩個參數的建構子
		new JavaWrappedClass_5(120, 121);

		// 呼叫實例方法，傳入參數 120
		test(120);
	}
	
	// Constructor Overloading：建構子多載 (一個參數)
	JavaWrappedClass_5(int a) {
			
		b = 200;
		
		System.out.println("這是有一個參數的建構子：" + a);
	}
	
	// Constructor Overloading：建構子多載 (兩個參數)
	JavaWrappedClass_5(int a, int c) {
		
		b = a;
		
		System.out.println("這是有兩個參數的建構子：" + a + ", " + c);
	}
	
	// instance method：實例方法
	// void：沒有回傳值
	// int a：接收一個 int 參數
	
	void test(int a) {
		
		System.out.println("這是有一個參數的方法：" + a);
	}

}