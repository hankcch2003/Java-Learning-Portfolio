package javaocp;

public class JavaString_2 {

	public static void main(String[] args) {

        char x[] = {'j', 'a', 'v', 'a'};
		
		String temp = "";
		
		for (char y : x) {
			
			temp += y;
		}
		
		System.out.println(temp); // java
		
		System.out.println("=".repeat(30));
		
		// 使用 String 的建構子，將 char[] 轉換成 String
		String fast = new String(x);
		
		System.out.println("fast = " + fast);
		
		System.out.println("=".repeat(30));
		
		// StringBuilder 是可變物件 (Mutable)，修改內容不會建立新的 StringBuilder 物件
        StringBuilder sb = new StringBuilder("hello");
		
		System.out.println("sb 的識別碼為：" + System.identityHashCode(sb));
		
		sb.append("java");

		System.out.println("sb 的內容為：" + sb); // hellojava
		
		System.out.println("結合後 sb 的識別碼為：" + System.identityHashCode(sb));
		
		System.out.println("=".repeat(30));

		// String 是不可變物件 (Immutable)，concat() 不會直接修改原本的字串
		String a = "hello";
		
		System.out.println("a 的識別碼為：" + System.identityHashCode(a));
		
		a.concat("java");
		
		System.out.println("a 的內容為：" + a); // hello
		
		System.out.println("結合後 a 的識別碼為：" + System.identityHashCode(a));
		
		System.out.println("=".repeat(30));
		
		String b = "hello";
		
		System.out.println("b 的識別碼為：" + System.identityHashCode(b));
		
		// 將 concat() 回傳的新 String 物件重新指定給 b
		b = b.concat("java");
		
		System.out.println("b 的內容為：" + b); // hellojava
		
		System.out.println("結合後 b 的識別碼為：" + System.identityHashCode(b));
	}

}