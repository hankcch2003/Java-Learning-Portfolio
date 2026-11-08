package javaocp;

public class JavaControlflow_3 {

	public static void main(String[] args) {
		
		// 前測條件迴圈：先判斷，再執行，可能一次都不執行
		int y = 10;

		while (y <= 10) {
			
			System.out.println("y = " + y);
			
			y++;
		}
		
		System.out.println("=".repeat(30));
		
		// 後測條件迴圈：先執行，再判斷，至少執行一次
		int z = 10;
		
		do {
			
			System.out.println("z = " + z);
		}
		
		while (z < 10);
		
		System.out.println("=".repeat(30));

		// 傳統 for 迴圈：可透過索引值存取或修改陣列元素
		int a[] = {1, 2, 3, 4, 5};
		
		for (int m = 0; m < a.length; m++) {
			
			System.out.print(a[m] + " ");
		}
		
		System.out.println();
		
		System.out.println("=".repeat(30));
		
		// 增強型 for 迴圈 (Enhanced for loop)
		// 語法：for (元素型別 變數名稱 : 陣列或集合) {敘述}
		// 優點：語法簡潔，適合依序走訪所有元素
		// 限制：無法直接取得索引值，重新指定基本型別變數不會修改原陣列

		for (int x : a) {
			
			System.out.println(x);
			
			x = 100;
		}

	}

}