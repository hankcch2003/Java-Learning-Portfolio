package javaocp;

public class JavaArray_4 {

	public static void main(String[] args) {
		
		// 二維非對稱型陣列的宣告、建立與元素值的指定
		// 1.宣告陣列變數
		int a[][];
		
		// 2.建立外層陣列，配置 3 個元素，用來存放一維陣列的參考
		a = new int[3][];
		
		// 3.分別建立每一列的一維整數陣列，且各列的長度不同
		a[0] = new int[2];
		
		a[1] = new int[4];
		
		a[2] = new int[1];
		
		// 4.將指定的整數值存入各列的陣列元素
		a[0][0] = 1;
		
		a[0][1] = 2;
		
		a[1][0] = 22;
		
		a[1][1] = 33;
		
		a[1][2] = 44;
		
		a[1][3] = 55;
		
		a[2][0] = 100;
		
		// 5.利用 enhanced for loop 輸出二維陣列的所有元素
		for (int[] row : a) {
			
			for (int value : row) {
				
				System.out.print(value + "\t");
			}
			
			System.out.println();
		}

	}

}