package javaocp;

public class JavaArray_3 {

	public static void main(String[] args) {

		// 二維陣列宣告
		int x[][] = new int[][] {{1, 2}, {22, 33, 44, 55}, {100}};
		
		System.out.println(x.length);
		
		for (int m = 0; m < x.length; m++) {
			
			System.out.println("x[" + m + "].length = " + x[m].length);
		}
		
		System.out.println("=".repeat(30));
		
		// 利用 standard for loop 輸出二維陣列的所有元素
		for (int m = 0; m < x.length; m++) {
			
			for (int p = 0; p < x[m].length; p++) {
				
				System.out.printf("x[%d][%d] = %d\t", m, p, x[m][p]);
			}
			
			System.out.println();
		}
		
		System.out.println("=".repeat(30));
		
		// 利用 enhanced for loop 輸出二維陣列的所有元素
		for (int[] row : x) {
			
			for (int value : row) {
				
				System.out.print(value + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("=".repeat(30));

		// 陣列的宣告、建立與元素值的指定
		// 1.宣告陣列變數
		int a[];

		// 2.建立陣列物件，配置 2 個 int 元素的空間
		a = new int[2];

		// 3.指定各陣列元素的值
		a[0] = 11;

		a[1] = 21;
		
		System.out.println("a[0] = " + a[0]);
		
		System.out.println("a[1] = " + a[1]);
		
		System.out.println("=".repeat(30));
		
		// 二合一：1.宣告 + 實體化、2.初始化
		int b[] = new int[2];
		
		b[0] = 11; b[1] = 22;
		
		System.out.println("b[0] = " + b[0]);
		
		System.out.println("b[1] = " + b[1]);
		
		System.out.println("=".repeat(30));
		
		// 二合一：1.宣告、2.實體化 + 初始化
		int c[];
		
		c = new int[] {88, 99};
		
		System.out.println("c[0] = " + c[0]);
		
		System.out.println("c[1] = " + c[1]);
		
		System.out.println("=".repeat(30));
		
		// 三合一：宣告 + 實體化 + 初始化
		int d[] = new int[] {11, 22, 33, 44, 55};
		
		System.out.println("d[0] = " + d[0]);
		
		System.out.println("d[1] = " + d[1]);
		
		System.out.println("d[2] = " + d[2]);
		
		System.out.println("d[3] = " + d[3]);
		
		System.out.println("d[4] = " + d[4]);		
	}

}