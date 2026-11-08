package javaocp;

public class JavaControlflow_2 {

	public static void main(String[] args) {
		
		// break：立即結束所在的迴圈或 switch
		// continue：跳過本次迴圈剩餘的程式碼，進入下一次迭代
		// label：標記迴圈，讓 break 或 continue 指定跳轉目標
		
		for (int m = 1; m <= 10; m++) {
			
			if (m == 3) {
				
				continue;
			}
			
			System.out.println("m = " + m);
		}
		
		System.out.println("=".repeat(30));
		
		// 未指定標籤時，break 與 continue 只作用於最內層的迴圈
		// 使用標籤時，可透過 break 或 continue 指定外層迴圈

		outerLoop:

		for (int m = 1; m <= 5; m++) {
			
			for (int p = 1; p <= 3; p++) {
				
				if (p == 2) {
					
					break outerLoop;
				}

				System.out.printf("m = %d, p = %d\n", m, p);
			}

		}
		
		System.out.println("=".repeat(30));

		for (int m = 1; m <= 5; m++) {
			
			for (int p = 1; p <= m; p++) {
				
				System.out.println("*");
			}

		}
		
		System.out.println("=".repeat(30));
		
		for (int m = 1; m <= 10; m++) {

			System.out.print(m + " ");
		}

		System.out.println();

		System.out.println("=".repeat(30));
		
		for (int m = 10; m >= 1; m--) {
			
			System.out.print(m + " ");
		}
		
		System.out.println();

		System.out.println("=".repeat(30));
		
		for (int m = 1; m <= 10; m += 2) {
			
			System.out.print(m + " ");
		}

	}

}