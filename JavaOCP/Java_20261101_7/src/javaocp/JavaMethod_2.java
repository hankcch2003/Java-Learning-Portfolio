package javaocp;

public class JavaMethod_2 {

	public static void main(String[] args) {
		
		// 呼叫類別方法
		staticMethod1();
	}
	
	// static method：類別方法，不需要建立物件即可呼叫
	static void staticMethod1() {
		
		System.out.println("類別方法1");
		
		// 同一個 class 內，可以直接呼叫其他類別方法
		staticMethod2();
		
		// 也可以透過 class 名稱呼叫類別方法
		JavaMethod_2.staticMethod2();
		
		// this：代表目前物件，但 static 方法不能使用 this
		// this.objectMethod1();
		
		// 建立物件，呼叫物件方法
		new JavaMethod_2().objectMethod1();
	}
	
	// static method：類別方法
	static void staticMethod2() {
		
		System.out.println("類別方法2");
	}
	
	// instance method：實例方法，需要透過物件呼叫
	void objectMethod1() {
		
		System.out.println("物件方法1");
		
		// 實例方法可以直接呼叫同一個 class 的類別方法
		staticMethod2();
		
		// this：呼叫目前物件的其他實例方法
		this.objectMethod2();
	}
	
	// instance method：實例方法
	void objectMethod2() {
		
		System.out.println("物件方法2");
	}

}