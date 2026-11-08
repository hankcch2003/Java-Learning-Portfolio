package javaocp;

class Father {
	
	void method() {
	}

}

// 宣告一個類別用來繼承 Father
class Son extends Father {
	
	@Override
	void method() {
	}

}

public class JavaConstant_1 {

	public static void main(String[] args) {
		
		System.out.println("hello");
		
		System.out.println("hello");
		
		System.out.print("javaocp");
		
		System.out.print("javaocp");
		
		System.out.println();
		
		// final 修飾語
		// 1.變數加上 final 為常數，無法再更改值
		// 2.類別加上 final 無法被繼承
		// 3.方法加上 final 無法被覆寫
		
		final int a = 100;
		
		System.out.println(a);

		byte aa = 1;
		
		short bb = aa; // 自動轉型為 short
		
		int cc = 5;
		
		bb = (short)cc; // 需強制轉型為 short
		
		System.out.println(aa);
		
		System.out.println(bb);
		
		System.out.println(cc);

		System.out.println("long 的大小為：" + Long.BYTES + " Byte，最大值為：" + Long.MAX_VALUE);
		
		System.out.println("float 的大小為：" + Float.BYTES + " Byte，最大值為：" + Float.MAX_VALUE);
		
		// long 可自動轉型為 float
		long dd = 1;
		
		float ee = 1;
		
		dd = (long)ee; // 需強制轉型為 long
		
		ee = dd; // 小變大可自動轉型
		
        System.out.println(dd);
		
		System.out.println(ee);
		
		int big = 257;
		
		byte small = (byte)big; // 需強制轉型為 byte
		
		System.out.println("big = " + big);
		
		System.out.println("small = " + small);
	}

}