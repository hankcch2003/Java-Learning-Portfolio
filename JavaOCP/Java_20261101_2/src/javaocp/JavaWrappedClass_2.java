package javaocp;

public class JavaWrappedClass_2 {

	public static void main(String[] args) {
		
		// 自動裝箱 (Autoboxing)：int 自動轉換成 Integer
		// 127 位於 Integer Cache 預設快取範圍 -128 到 127

		Integer a = 127;
		
		// 自動裝箱 (Autoboxing)：int 自動轉換成 Integer
		// 127 位於 Integer Cache 預設快取範圍，因此會取得快取物件

		Integer b = 127;

		// 自動裝箱 (Autoboxing)：int 自動轉換成 Integer
		// 128 超出 Integer Cache 預設快取範圍

		Integer c = 128;
		
		// 自動裝箱 (Autoboxing)：int 自動轉換成 Integer
		// 128 超出 Integer Cache 預設快取範圍，通常會建立不同物件

		Integer d = 128;
		
		// 使用 valueOf() 取得 Integer 物件
		// 120 位於 Integer Cache 預設快取範圍 -128 到 127

		Integer e = Integer.valueOf(120);

		// 使用 valueOf() 取得 Integer 物件
		// 120 位於 Integer Cache 預設快取範圍，因此會取得相同快取物件

		Integer f = Integer.valueOf(120);
		
		// 使用 == 比較兩個物件的參考是否相同
		// a 和 b 都是 127，位於 Integer Cache，因此參考相同

		System.out.println("a == b：" + (a == b)); // true
		
		// 使用 == 比較兩個物件的參考是否相同
		// 128 超出預設快取範圍，因此通常是 false

		System.out.println("c == d：" + (c == d)); // false

		// 使用 == 比較兩個物件的參考是否相同
		// 120 位於快取範圍，因此是 true

		System.out.println("e == f：" + (e == f)); // true
	}

}