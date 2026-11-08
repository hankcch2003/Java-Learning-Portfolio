package javaocp;

import java.util.Arrays;

public class JavaArray_6 {

	public static void main(String[] args) {
		
		// 陣列拷貝：arraycopy(來源陣列, 來源起始索引, 目的陣列, 目的起始索引, 拷貝長度)
		int arr[] = {5, 4, 3, 2, 1};
		
		// 將 arr[3]、arr[4] 複製到 arr[2]、arr[3]
		// 來源與目的陣列相同時，也能正確處理重疊區域

		System.arraycopy(arr, 3, arr, 2, 2);
		
		for (int x : arr) {
			
			System.out.print(x + "\t");
		}
		
		System.out.println();

		System.out.println("=".repeat(30));

		// int[] 直接輸出：顯示陣列物件的識別字串 (非真正記憶體位址)
		System.out.println(arr);
		
		// 使用 Arrays.toString() 輸出陣列中的所有元素
		System.out.println(Arrays.toString(arr));
		
		System.out.println("=".repeat(30));
		
		char b[] = {'8', '8', '6'};
		
		// char[] 直接輸出時，會顯示陣列中的字元內容
		System.out.println(b);
	}

}