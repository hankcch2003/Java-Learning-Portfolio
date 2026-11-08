package javaocp;

public class JavaArray_5 {

	public static void main(String[] args) {
		
		int a[] = new int[3];
		
		a[0] = 100;
		
		a[1] = 200;
		
		a[2] = 300;
		
		System.out.println("a 的長度為：" + a.length); // 3
		
		// 使用增強型 for 迴圈讀取陣列 a 的元素
		for (int x : a) {
			
			System.out.print(x + "\t");
		}
		
		System.out.println();
		
		System.out.println("=".repeat(30));
		
		int b[] = new int[4];
		
		// 將陣列 a 的元素逐一複製到陣列 b
		for (int m = 0; m < a.length; m++) {
			
			b[m] = a[m];
		}
		
		// 將陣列 b 的參考指定給 a，使 a 和 b 指向同一個陣列
		a = b;
		
		System.out.println("a 的長度為：" + a.length); // 4
		
		// 使用增強型 for 迴圈讀取陣列 a 的元素
		for (int x : a) {
			
			System.out.print(x + "\t");
		}
		
		System.out.println();
		
		// 使用增強型 for 迴圈讀取陣列 b 的元素
		for (int x : b) {
			
			System.out.print(x + "\t");
		}

	}

}