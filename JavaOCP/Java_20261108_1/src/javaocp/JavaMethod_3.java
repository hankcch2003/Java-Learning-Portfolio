package javaocp;

import java.util.Arrays;

public class JavaMethod_3 {

	public static void main(String[] args) {
		
		// Boolean.parseBoolean：只有字串 "true" (不區分大小寫) 才回傳 true，其他情況回傳 false
		Boolean aa = Boolean.parseBoolean("abc");
		
		// Boolean.valueOf：將 String 轉換成 Boolean 物件，傳入 null 會回傳 Boolean.FALSE
		Boolean bb = Boolean.valueOf((String) null);
		
		System.out.println(aa); // false
		
		System.out.println(bb); // false
		
		System.out.println("=".repeat(30));
		
		// compareTo：比較兩個字串的字典順序，回傳第一個不同字元的 Unicode 差值
		System.out.println("agcd".compareTo("aecd")); // 2 ('g' - 'e' = 2)
		
		System.out.println("=".repeat(30));
		
		int a[] = {2, 4, 6, 8, 10};
		
		int b[] = {2, 4, 8, 8, 10};
		
		// Arrays.mismatch：回傳兩個陣列第一個不相同元素的索引值，從 0 開始
		System.out.println(Arrays.mismatch(a, b)); // 2
		
		// Arrays.compare：比較兩個陣列的字典順序，回傳負數、0 或正數，不保證回傳實際元素差值
		System.out.println(Arrays.compare(b, a)); // 1 (b > a)
	}

}