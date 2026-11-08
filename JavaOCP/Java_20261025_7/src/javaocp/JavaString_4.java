package javaocp;

public class JavaString_4 {

	public static void main(String[] args) {
		
		// substring()：擷取字串指定位置的內容，回傳 String
		System.out.println("javaocp".substring(4)); // ocp
		
		System.out.println("javaocp".substring(2, 5)); // vao
		
		System.out.println("=".repeat(30));
		
		String a = "hello java, how are you, java is good";
		
		// indexOf()：找出指定文字第一次出現的位置，回傳 int，找不到回傳 -1
		System.out.println(a.indexOf("o")); // 4
		
		// lastIndexOf()：找出指定文字最後一次出現的位置，回傳 int，找不到回傳 -1
		System.out.println(a.lastIndexOf("o")); // 35
		
		System.out.println(a.lastIndexOf("ooo")); // -1
		
		// length()：取得字串長度，回傳 int
		System.out.println("a 的字串長度為：" + a.length()); // 37
		
		System.out.println("=".repeat(30));
		
		// charAt()：取得指定索引位置的字元，回傳 char
		System.out.println("hellojava".charAt(5)); // 'j'
		
		System.out.println("=".repeat(30));

		// compareTo()：比較兩個字串的 Unicode 值差異，回傳 int
		System.out.println("java".compareTo("java")); // 0
		
		System.out.println("java".compareTo("Java")); // 32
		
		System.out.println("java".compareTo("lava")); // -2
		
		System.out.println("java".compareTo("java123456")); // -6
		
		// compareToIgnoreCase()：忽略大小寫比較兩個字串，回傳 int
		System.out.println("java".compareToIgnoreCase("Java")); // 0
	}

}