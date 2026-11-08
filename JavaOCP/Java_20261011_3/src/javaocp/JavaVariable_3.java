package javaocp;

public class JavaVariable_3 {

	private int x; // 物件變數，各自獨立維護
	
	private static int y; // 類別變數，大家共同維護，彼此干擾
	
	public static void main(String[] args) {
		
		// 宣告變數時可用底線來輔助視覺效果，方便閱讀
		// 但底線前後一定要為數字，不能是其他符號
		
		short a_ = (short)'A';
		
		int b[][] = {{1, 2}, {2, 3}};
		
		float c = 1.0F;
		
		byte $byte = 65;

		int d = 1_6_8_8_8;
		
		double e = 1_2.68;
		
		char f = 'A';
		
		byte g = 0b100_000_1;
		
		System.out.println("a_ = " + a_);
		
        System.out.println("b[0][0] = " + b[0][0]);
        
        System.out.println("c = " + c);
        
        System.out.println("$byte = " + $byte);
        
        System.out.println("d = " + d);
        
        System.out.println("e = " + e);
        
        System.out.println("f = " + f);
        
        System.out.println("g = " + g);
		
		JavaVariable_3 t1 = new JavaVariable_3();
		
		t1.x = 2;
		
		JavaVariable_3.y = 3;
		
		JavaVariable_3 t2 = new JavaVariable_3();
		
		t2.x = 4;
		
		JavaVariable_3.y = 5;
		
		System.out.println(t1.x + "," + JavaVariable_3.y); // 2,5
		
		System.out.println(t2.x + "," + JavaVariable_3.y); // 4,5
		
		System.out.println(t2.x + "," + JavaVariable_3.y); // 4,5
	}

}