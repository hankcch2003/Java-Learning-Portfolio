package javaocp;

public class JavaMethod_1 {
	
	// static：靜態方法，不需要建立物件即可呼叫
	// int：回傳 int 型態的數值
	// int max：接收一個 int 型態的參數

	static int calcSum(int max) {
		
		int sum = 0;
		
		for (int m = 1; m <= max; m++) {
			
			sum += m;
		}
		
		// return：回傳計算結果
		return sum;
	}
	
	// public：任何 package 都可以存取
	// static：靜態方法
	// int：回傳 int 型態的數值
	// width、length：接收兩個 int 型態的參數

	public static int rectangle(int width, int length) {
		
		// 回傳矩形面積 (長 × 寬)
		return width * length;
	}

	public static void main(String[] args) {
		
		// 呼叫 calcSum()，計算 1 到指定數字的總和
		System.out.println("1 + 2 + 3 + .... + 100 = " + calcSum(100));
		
		System.out.println("1 + 2 + 3 + .... + 200 = " + calcSum(200));
		
		System.out.println("1 + 2 + 3 + .... + 300 = " + calcSum(300));
		
		System.out.println("=".repeat(30));
		
		// 呼叫 rectangle()，計算矩形面積
		System.out.println("長為 5，寬為 10，求得的矩形面積為：" + rectangle(5, 10));
	}

}