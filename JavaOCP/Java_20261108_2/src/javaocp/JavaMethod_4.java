package javaocp;

import java.util.Arrays;

public class JavaMethod_4 {

	public static void main(String[] args) {
		
		int a = 100;
		
		System.out.println("呼叫 callByValue 方法前的 a = " + a); // 100
		
		System.out.println("=".repeat(30));
		
		// 呼叫 callByValue：傳入基本資料型態的值，方法內修改不會影響原本的變數
		callByValue(a);
		
		System.out.println("呼叫 callByValue 方法後的 a = " + a); // 100

		System.out.println("=".repeat(30));

		int b[] = {10, 20, 30, 40, 50};
		
		System.out.println("呼叫 callByAddress 方法前的 b = " + Arrays.toString(b)); // [10, 20, 30, 40, 50]
		
		System.out.println("=".repeat(30));
		
		// 呼叫 callByAddress：傳入陣列參考值的副本，方法內修改陣列元素會影響原本的陣列
		callByAddress(b);
		
		System.out.println("呼叫 callByAddress 方法後的 b = " + Arrays.toString(b)); // [110, 120, 130, 140, 150]
	}
	
	// callByValue：基本資料型態採用 Pass by Value，修改區域參數不影響原本變數
	static void callByValue(int a) {
		
		System.out.println("callByValue 方法內，未加總前的 a = " + a); // 100
		
		a += 100;
		
		System.out.println("callByValue 方法內，加總後的 a = " + a); // 200

		System.out.println("=".repeat(30));
	}
	
	// callByAddress：陣列參考型態也是 Pass by Value，但可以透過參考值修改原陣列內容
	static void callByAddress(int b[]) {
		
		System.out.println("callByAddress 方法內，加總前的 b = " + Arrays.toString(b)); // [10, 20, 30, 40, 50]

		for (int m = 0; m < b.length; m++) {
			
			b[m] += 100;
		}
		
		System.out.println("callByAddress 方法內，加總後的 b = " + Arrays.toString(b)); // [110, 120, 130, 140, 150]
		
		System.out.println("=".repeat(30));
	}

}