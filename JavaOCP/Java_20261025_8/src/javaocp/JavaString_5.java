package javaocp;

import java.util.Arrays;

import java.util.stream.Stream;

public class JavaString_5 {

	public static void main(String[] args) {
		
		String a = "Red, Green, Blue";
		
		// split()：依照指定分隔符號切割字串，回傳 String[]
		String[] s = a.split(",");
		
		System.out.println(Arrays.toString(s)); // [Red,  Green,  Blue]
		
		System.out.println("=".repeat(30));
		
		// toUpperCase()：將英文字母轉換成大寫
		System.out.println("helloHowAreYou".toUpperCase()); // HELLOHOWAREYOU
		
		// toLowerCase()：將英文字母轉換成小寫
		System.out.println("helloHowAreYou".toLowerCase()); // hellohowareyou
		
		// toCharArray()：將 String 轉換成 char[]
		char[] charArray = "helloHowAreYou".toCharArray();
		
		for (char x : charArray) {
			
			System.out.println(x);
		}
		
		System.out.println("=".repeat(30));
		
		// trim()：移除字串前後 U+0020 以下的空白及控制字元
		System.out.println("begin" + " java ".trim() + "end"); // beginjavaend
		
		// trim()：無法移除全形空白
		System.out.println("begin" + "　java　".trim() + "end"); // begin　java　end
		
		// strip()：移除字串前後 Unicode 空白
		System.out.println("begin" + " java ".strip() + "end"); // beginjavaend
		
		// strip()：可以移除全形空白
		System.out.println("begin" + "　java　".strip() + "end"); // beginjavaend
		
		System.out.println("=".repeat(30));
		
		// stripLeading()：只移除字串前面的 Unicode 空白
		System.out.println("begin" + " java ".stripLeading() + "end"); // beginjava end
		
		// stripLeading()：只移除前面的全形空白
		System.out.println("begin" + "　java　".stripLeading() + "end"); // beginjava　end
		
		// stripTrailing()：只移除字串後面的 Unicode 空白
		System.out.println("begin" + " java ".stripTrailing() + "end"); // begin javaend
		
		// stripTrailing()：只移除後面的全形空白
		System.out.println("begin" + "　java　".stripTrailing() + "end"); // begin　javaend
		
		System.out.println("=".repeat(30));
		
		// replace()：將所有符合的舊內容替換成新內容
		System.out.println("helloocp".replace("o", "pass")); // hellpasspasscp
		
		System.out.println("=".repeat(30));
		
		String b = "hello\n java \n how \nare you";
		
		// lines()：依照換行符號將字串轉換成 Stream<String>
		Stream<String> lines = b.lines();
		
		// count()：計算 Stream 中的元素數量，屬於終端操作 (Terminal Operation)
		System.out.println(lines.count()); // 4
		
		System.out.println("=".repeat(30));
		
		// repeat()：將字串重複指定次數
		System.out.println("ocp819 pass".repeat(10));
		
		System.out.println("=".repeat(30));
		
		String c = null;
		
		// +：串接字串，null 會轉換成文字 "null"
		System.out.println("hello" + c); // hellonull
		
		// concat()：將另一個字串串接在原字串後面
		// 注意："hello".concat(null) 會拋出 NullPointerException

		System.out.println("hello".concat(" java")); // hello java
	}

}