package javaocp;

// 宣告抽象類別 Nook
abstract class Nook {
	
	// 宣告抽象方法，子類別必須實作
	abstract void mustDo();

}

// NookSon 繼承抽象類別 Nook
class NookSon extends Nook {

	// 表示覆寫父類別的方法
	@Override

	// 實作父類別的抽象方法
	void mustDo() {

	}

}

public class JavaWrappedClass_1 {

	public static void main(String[] args) {

		// 建立目前類別的物件
		JavaWrappedClass_1 a = new JavaWrappedClass_1();
		
		// 輸出物件資訊 (類別名稱及雜湊碼)
		System.out.println(a); // javaocp.JavaWrappedClass_1@8bcc55f

		// 使用 valueOf() 取得 Integer 物件，可能使用 Integer Cache
		Integer b = Integer.valueOf(13);
		
		System.out.println(b); // 13
		
		// 使用 intValue() 將 Integer 手動拆箱成 int
		int intValue = b.intValue();
		
		System.out.println(intValue); // 13
		
		// 將 String 轉換成 Integer，字串必須是有效的整數表示
		Integer c = Integer.valueOf("13");
		
		System.out.println(c); // 13
		
		// 使用 valueOf() 建立 Integer 物件
		Integer d = Integer.valueOf(13);
		
		System.out.println(d); // 13
		
		// 自動裝箱 (Autoboxing)：int 自動轉換成 Integer
		Integer x = 12;
		
		System.out.println(x); // 12
		
		// 自動拆箱 (Unboxing)：Integer 自動轉換成 int
		int y = x;
		
		System.out.println(y); // 12

		float e = 12.0f;
		
		System.out.println(e); // 12.0

		double g;
		
		// 擴大基本型別轉型 (Widening)：float 自動轉換成 double
		g = e;
		
		System.out.println(g); // 12.0
		
		// 自動裝箱：float 自動轉換成 Float 包裝類別
		Float f = 12.0f;
		
		System.out.println(f); // 12.0
		
		// 自動裝箱：double 自動轉換成 Double 包裝類別
		Double m = 12.0;
		
		System.out.println(m); // 12.0
		
		// int 常數 127 符合 byte 範圍，可窄化轉型後自動裝箱成 Byte
		Byte q = 127;
		
		System.out.println(q); // 127
		
		// 自動拆箱：Byte 轉換成 byte，再擴大轉型成 int
		int r = q;
		
		System.out.println(r); // 127
		
		// 使用 L 表示 long 常數，自動裝箱成 Long
		Long p = 1234L;
		
		System.out.println(p); // 1234

		Long o = 2147483648L;
		
		System.out.println(o); // 2147483648
	}

}