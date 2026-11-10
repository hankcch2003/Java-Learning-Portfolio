package javaocp;

public class JavaMethod_5 {

	public static void main(String[] args) {
		
		new JavaMethod_5().first();
	}
	
	void first() {
		
		int i = 5;
		
		// 建立 Value 物件，i 初始值為 15
		Value v = new Value();
		
		v.i = 25;
		
		// 呼叫 second：傳入物件參考值的副本及基本資料型態的值
		second(v, i);
		
		System.out.println(v.i); // 20
	}
	
	void second(Value v, int i) {
		
		// 修改區域變數 i，不影響 first() 裡面的 i
		i = 0;
		
		// 透過參考值修改原本物件的 i
		v.i = 20;
		
		// 建立新的 Value 物件，i = 15
		Value val = new Value();
		
		// 將區域變數 v 指向新物件，不影響 first() 裡面的 v
		v = val;
		
		System.out.println(v.i + " " + i); // 15 0
	}

}

class Value {
	
	// int 成員變數的初始值為 15
	int i = 15;
}