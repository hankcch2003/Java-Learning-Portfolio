package javaocp;

public class JavaString_7 {

	public static void main(String[] args) {

		StringBuilder c = new StringBuilder("hello java");
		
		// 依序在尾端加入 " ocp pass"、索引 6 插入 "good "、刪除索引 11～15、將索引 6～9 替換成 "best"，最後擷取索引 6～9
		String d = c.append(" ocp pass").insert(6, "good ").delete(11, 16).replace(6, 10, "best").substring(6, 10);
		
		System.out.println(c); // hello best ocp pass
		
		System.out.println(d); // best
		
		System.out.println("=".repeat(30));
		
		// 建立初始容量為 8 的 StringBuilder
		StringBuilder sb = new StringBuilder(8);
		
		// 在尾端加入 "java"
		sb.append("java");
		
		// 查看目前字串的長度
		System.out.println(sb.length()); // 4
		
		// 查看目前字串的容量
		System.out.println(sb.capacity()); // 8
		
		System.out.println("=".repeat(30));
		
		// 建立內容為 "hello" 的 StringBuffer (具執行緒安全特性)
		StringBuffer sb1 = new StringBuffer("hello");
		
		sb1.append("ok");
		
		// 建立內容為 "hello" 的 StringBuilder (不具執行緒安全保證)
		StringBuilder sb2 = new StringBuilder("hello");
		
		sb2.append("ok");
		
		System.out.println(sb1); // hellook
		
		System.out.println(sb2); // hellook
		
		System.out.println("=".repeat(30));
		
		String s = "123";
		
		if (s.length() > 2) {
			
			// 將 "456" 串接到字串，但沒有重新指定給 s
			s.concat("456");
		}
		
		// 迴圈執行 3 次，每次將 "x" 串接到 s 並重新指定
		for (int x = 0; x < 3; x++) {
			
			s += "x";
		}
		
		System.out.println("s = " + s); // 123xxx
		
		System.out.println("=".repeat(30));
		
		String a = "A ";
		
		// 將 "B " 串接到 a，並重新指定
		a = a.concat("B ");
		
		String b = "C ";
		
		// 將 b 串接到 a，並重新指定
		a = a.concat(b);
		
		// 將 "C" 替換成 "D"，但沒有重新指定給 a，因此 a 不變
		a.replace("C", "D");
		
		// 再次將 b 串接到 a，並重新指定
		a = a.concat(b);
		
		System.out.println(a); // A B C C
	}

}