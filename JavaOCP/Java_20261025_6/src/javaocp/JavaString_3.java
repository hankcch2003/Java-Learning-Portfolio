package javaocp;

class Father {
	
	void ok() {
		
		System.out.println("I am father");
	}

}

class Son extends Father {
	
	@Override
	void ok() {
		
		System.out.println("I am Son");
	}
	
}

public class JavaString_3 {

	public static void main(String[] args) {
		
		String a = "hello java";
		
		// contains()：判斷字串是否包含指定文字，回傳 boolean
		System.out.println(a.contains("llo")); // true
		
		System.out.println(a.contains("lla")); // false
		
		System.out.println("=".repeat(30));
		
		String b = "https://www.java.com.tw";
		
		// startsWith()：判斷字串是否以指定文字開頭，回傳 boolean
		System.out.println(b.startsWith("https://")); // true
		
		System.out.println(b.startsWith("ftp://")); // false
		
		// endsWith()：判斷字串是否以指定文字結尾，回傳 boolean
		System.out.println(b.endsWith(".tw")); // true
		
		System.out.println(b.endsWith(".jp")); // false
		
		System.out.println("=".repeat(30));
		
		// isEmpty()：判斷字串長度是否為 0，回傳 boolean
		System.out.println("".isEmpty()); // true
		
		System.out.println(" ".isEmpty()); // false
		
		// isBlank()：判斷字串是否為空或只包含空白字元，回傳 boolean
		System.out.println("".isBlank()); // true
		
		System.out.println(" ".isBlank()); // true
		
		System.out.println("=".repeat(30));
		
		// equals()：比較字串內容是否相同，區分大小寫，回傳 boolean
		System.out.println("Java".equals("Java")); // true
		
		System.out.println("Java".equals("java")); // false
		
		// equalsIgnoreCase()：比較字串內容，忽略大小寫，回傳 boolean
		System.out.println("Java".equalsIgnoreCase("Java")); // true
		
		System.out.println("Java".equalsIgnoreCase("java")); // true
		
		System.out.println("=".repeat(30));
		
		StringBuilder sb1 = new StringBuilder("java");
		
		StringBuilder sb2 = new StringBuilder("java");
		
		// ==：比較兩個物件的參考是否相同，回傳 boolean
		System.out.println(sb1 == sb2); // false
		
		// equals()：StringBuilder 沒有覆寫 equals()，預設比較物件參考，回傳 boolean
		System.out.println(sb1.equals(sb2)); // false
		
		// toString()：將 StringBuilder 轉換成 String，回傳 String
		System.out.println(sb1.toString().equals(sb2.toString())); // true
	}

}