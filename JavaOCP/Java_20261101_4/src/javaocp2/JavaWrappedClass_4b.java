package javaocp2;

// import：匯入其他 package 的 public class，讓目前的 class 可以使用它
import javaocp.JavaWrappedClass_4a;

public class JavaWrappedClass_4b {

	public static void main(String[] args) {
		
		// Second：如果是 javaocp 裡的 default class，不同 package 不能直接存取
		// Second s = new Second();
		
		JavaWrappedClass_4a a = new JavaWrappedClass_4a();
		
		// public：不同 package 也可以存取
		a.publicVar = 120;
		
		// protected：不同 package 的非子類別不能直接存取
		// a.protectedVar = 120;
		
		// default：不同 package 不能存取
		// a.defaultVar = 120;
		
		// private：只能在宣告它的 class 內存取
		// a.privateVar = 120;
	}

}

// TestOK 繼承 JavaWrappedClass_4a
// extends：表示 TestOK 是 JavaWrappedClass_4a 的子類別

class TestOK extends JavaWrappedClass_4a {
	
	// instance method：實例方法，沒有回傳值，也沒有接收參數
	void test() {
		
		// 建立 TestOK 自己的物件
		TestOK t = new TestOK();
		
		// public：任何 package 都可以存取
		t.publicVar = 500;
		
		// protected：不同 package 的子類別可以存取
		// 透過子類別型別的物件 t 存取 protected 成員
		
		t.protectedVar = 500;
		
		// default：不同 package 不能存取，即使繼承也不行
		// t.defaultVar = 500;
		
		// private：只能在 JavaWrappedClass_4a 內存取
		// t.privateVar = 500;	
	}

}