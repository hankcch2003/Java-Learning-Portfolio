package javaocp;

public class JavaArray_1 {

	public static void main(String[] args) {
		
		// 陣列的宣告、建立與元素值的指定
		// 1.宣告陣列變數
		int[] score;
		
		// 2.建立陣列物件，配置 5 個 int 元素的空間
		score = new int[5];
		
		// 3.將 0~100 的隨機整數指定給各陣列元素
		score[0] = (int)(Math.random() * 101);
		
		score[1] = (int)(Math.random() * 101);
		
		score[2] = (int)(Math.random() * 101);
		
		score[3] = (int)(Math.random() * 101);
		
		score[4] = (int)(Math.random() * 101);
		
		// 使用增強型 for 迴圈 (Enhanced for loop) 走訪陣列，並輸出每個元素的值
		for (int x : score) {
			
			System.out.print(x + " ");
		}

	}

}