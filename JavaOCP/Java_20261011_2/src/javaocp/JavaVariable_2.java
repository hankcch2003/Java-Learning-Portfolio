package javaocp;

public class JavaVariable_2 {
	
	// 宣告物件變數，物件變數是由 new 出來的物件各自獨立維護，類別是無法存取物件變數
	// 類別方法無法直接存取物件變數，需產生類別物件才可存取
	
	int objectVar;

	public static void main(String[] args) {
		
		var aaa = 1;
		
		var bbb = 'c';
		
		System.out.println(aaa); // 1

	    System.out.println(bbb); // c

		// System.out.println(objectVar); // 此行編譯錯誤，類別方法無法直接存取
		
		JavaVariable_2 p1 = new JavaVariable_2();
		
		JavaVariable_2 p2 = new JavaVariable_2();
		
		// System.out.println(JavaVariable_2.objectVar); // 無法直接透過類別來存取
		
		System.out.println(p1.objectVar); // 0
		
		System.out.println(p2.objectVar); // 0
		
		p1.objectVar = 666;
		
		p2.objectVar = 999;
		
		System.out.println("=".repeat(50));
		
        System.out.println(p1.objectVar); // 666
		
		System.out.println(p2.objectVar); // 999
	}
	
	int aaa(int b) {
		
		return 1;
	}

}