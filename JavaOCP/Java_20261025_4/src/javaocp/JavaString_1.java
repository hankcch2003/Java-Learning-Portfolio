package javaocp;

public class JavaString_1 {

	public static void main(String[] args) {
		
		// 使用 new 建立 String 物件，每次都會建立新的物件
		String a = new String("java");
		
		String b = new String("java");
		
		// 字串常值會使用 String Pool，相同內容的字串會共用同一個物件
		String c = "java";
		
		String d = "java";
		
		// == 比較兩個變數是否參考同一個物件
		System.out.println(a == b); // false
		
		System.out.println(c == d); // true
		
		System.out.println(a == c); // false
		
		System.out.println("=".repeat(30));
		
		// identityHashCode() 取得物件的識別雜湊碼，並非真正的記憶體位址
		// Integer.toHexString() 將整數轉換成十六進位字串
		
		System.out.println("a 的識別碼 = " + Integer.toHexString(System.identityHashCode(a)));
		
		System.out.println("b 的識別碼 = " + Integer.toHexString(System.identityHashCode(b)));
		
		System.out.println("c 的識別碼 = " + Integer.toHexString(System.identityHashCode(c)));
		
		System.out.println("d 的識別碼 = " + Integer.toHexString(System.identityHashCode(d)));
		
		System.out.println("=".repeat(30));
		
        a = new String("java");
		
		System.out.println("a 的識別碼 = " + Integer.toHexString(System.identityHashCode(a)));
		
		System.out.println("=".repeat(30));

		// equals() 比較 String 的字串內容是否相同
		System.out.println(a.equals(b)); // true
		
		System.out.println(c.equals(d)); // true
		
		System.out.println(a.equals(c)); // true
	}

}