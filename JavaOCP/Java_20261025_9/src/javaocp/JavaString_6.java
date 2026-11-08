package javaocp;

import javax.swing.JOptionPane;

public class JavaString_6 {

	public static void main(String[] args) {
		
		// 將 String 轉換成 Integer 物件 (包裝類別)
		Integer valueOf = Integer.valueOf("123");
		
		// 將 String 轉換成基本資料型態 int
		int int1 = Integer.parseInt("123");
		
		// 將數字轉換成 String 字串
		String valueOf2 = String.valueOf(123);
		
		System.out.println("valueOf = " + valueOf);
		
		System.out.println("int1 = " + int1);
		
		System.out.println("valueOf2 = " + valueOf2);
		
		// 顯示輸入視窗，並將輸入的 String 轉換成 int
		int no = Integer.parseInt(JOptionPane.showInputDialog("請輸入數字："));
		
		System.out.println(no + 5678);
		
		System.out.println("=".repeat(30));
		
		// 建立字串常值，存放在 String Pool (字串常數池)
		String a = "java";
		
		// intern() 取得 String Pool 中相同內容的字串參考，因此 a 與 b 指向同一個物件
		String b = a.intern();
		
		// 使用 new 建立新的 String 物件，與 a 指向不同物件
		String c = new String("java");
		
		// 取得 String Pool 中的 "java"，因此 d 與 a、b 指向同一個物件
		String d = c.intern();
		
		System.out.println("a == b 的結果為：" + (a == b)); // true
		
		System.out.println("a.equals(b) 的結果為：" + (a.equals(b))); // true
		
		System.out.println("a == c 的結果為：" + (a == c)); // false
		
		System.out.println("a.equals(c) 的結果為：" + a.equals(c)); // true
		
		System.out.println("c == d 的結果為：" + (c == d)); // false
		
		System.out.println("c.equals(d) 的結果為：" + c.equals(d)); // true
		
		System.out.println("b == d 的結果為：" + (b == d)); // true
		
		System.out.println("b.equals(d) 的結果為：" + b.equals(d)); // true
		
		System.out.println("a 的識別碼為：" + System.identityHashCode(a));
		
		System.out.println("b 的識別碼為：" + System.identityHashCode(b));
		
		System.out.println("c 的識別碼為：" + System.identityHashCode(c));

		System.out.println("d 的識別碼為：" + System.identityHashCode(d));
	}

}