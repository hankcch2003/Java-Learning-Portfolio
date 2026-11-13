package javaocp;

public class JavaInheritance_2 {

	public static void main(String[] args) {
		
		// Constructor Invocation：建立 Taipei 物件，啟動整個建構子呼叫鏈
		new Taipei();
	}

}

class Person1 {
	
	Person1() {
		
		System.out.println("我是人類");
	}

}

class Asia extends Person1 {
	
	Asia() {
		
		// Implicit Super Constructor：未明確呼叫 this() 或 super() 時，編譯器自動插入 super()
		System.out.println("我是亞洲人");
	}

}

class Taiwan extends Asia {
	
	Taiwan() {
		
		System.out.println("我是台灣人");
		
		System.out.println("=".repeat(30));
	}
	
	Taiwan(int a) {
		
		System.out.println("我是台灣人");
	}

}

class Taipei extends Taiwan {

	Taipei() {
		
		// Constructor Chaining：this(1) 呼叫同一個 class 的 Taipei(int) 建構子，必須放在第一個敘述
		this(1);
		
		System.out.println("=".repeat(30));

		System.out.println("我是台北人");
	}
	
	Taipei(int a) {
		
		// Constructor Chaining：this(1, 2) 呼叫同一個 class 的 Taipei(int, int) 建構子
		this(1, 2);
		
		System.out.println("這是台北有一個參數的建構子：" + a);
	}
	
	Taipei(int a, int b) {
		
		// Implicit Super Constructor：自動呼叫直接父類別 Taiwan() 建構子
		System.out.println("這是台北有兩個參數的建構子：" + a + ", " + b);
	}
	
}