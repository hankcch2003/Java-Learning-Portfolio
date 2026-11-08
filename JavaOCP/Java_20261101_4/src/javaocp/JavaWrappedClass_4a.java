package javaocp;

public class JavaWrappedClass_4a {

	// private：只能在同一個 class 內存取
	private int privateVar = 100;
	
	// default (沒有寫任何修飾子)：只能在同一個 package 內存取
	int defaultVar;
	
	// protected：同一個 package 內可以存取，不同 package 則必須透過繼承關係存取
	protected int protectedVar;
	
	// public：任何 package 的任何 class 都可以存取
	public int publicVar;
	
	// static：不需要建立物件，就可以透過 class 呼叫
	// int...var：Varargs，可接收零個或多個 int 參數

	static void aaa(int...var) {
		
		for (var x : var) {
			
			System.out.println(x);
		}

	}
	
	// main 方法的參數也可以使用 Varargs (可變長度參數)
	// String...args 等同於 String[] args

	public static void main(String...args) {
		
		// 傳入 int 陣列，也可以傳給 Varargs
		aaa(new int[] {120, 121, 122});
		
		System.out.println("=".repeat(30));

		// 直接傳入多個 int 數值，不需要自行建立陣列
		aaa(220, 221, 222);
		
		System.out.println("=".repeat(30));
		
		JavaWrappedClass_4a a = new JavaWrappedClass_4a();
		
		// private：同一個 class 內可以存取
		System.out.println(a.privateVar);
		
		// private：同一個 class 內可以存取
		a.privateVar = 100;
		
		// protected：同一個 package 可以存取
		a.protectedVar = 121;
		
		// default：同一個 package 可以存取
		a.defaultVar = 122;
		
		// private：同一個 class 內可以存取
		a.privateVar = 123;
	}

}

// interface：宣告介面，定義類別可以實作的規格
interface bbb {
	
	// interface 裡面的變數預設為 public static final
	// 等同於 public static final int bbb = 5;
	// public：公開
	// static：屬於介面，不需要建立物件
	// final：常數，不能重新指定值

	int bbb = 5;
}

class Second {
	
	// Inner Class：成員內部類別 (Member Inner Class)
	// 宣告在另一個 class 裡面的 class
	// 沒有使用 static，所以屬於非 static 內部類別

	class IAmInnerClass {
		
	}
	
	// instance method：實例方法，沒有回傳值，也沒有接收參數
	void test() {
		
		JavaWrappedClass_4a a = new JavaWrappedClass_4a();
		
		// public：任何 package 都可以存取
		a.publicVar = 120;
		
		// protected：同一個 package 可以存取
		a.protectedVar = 121;
		
		// default：同一個 package 可以存取
		a.defaultVar = 122;

		// private：只能在宣告它的 class 內存取
		// a.privateVar = 123;
	}

}