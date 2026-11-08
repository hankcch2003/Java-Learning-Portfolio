package javaocp;

import java.util.Arrays;

public class JavaArray_8 {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 5, 4, 5};
		
		int b[] = {1, 2, 3, 4, 5};
		
		// Arrays.compare() 依照字典順序 (Lexicographical Order) 比較兩個陣列
		// 第一個不相同的元素進行比較，a[2] > b[2]，因此回傳正數
		
		System.out.println(Arrays.compare(a, b)); // 1
		
		System.out.println("=".repeat(30));
		
        int c[] = {1, 2, 3, 4, 5};
		
		int d[] = {1, 2, 3, 4, 5};
		
		int e[] = {1, 2, 6, 4, 5};
		
		// Arrays.mismatch() 回傳兩個陣列第一個不相同元素的索引位置
		// 如果兩個陣列完全相同，則回傳 -1
		// 如果前面元素都相同，但陣列長度不同，則回傳較短陣列的長度
		
		System.out.println(Arrays.mismatch(c, d)); // -1
		
		System.out.println(Arrays.mismatch(c, e)); // 2
		
		System.out.println("======== 陣列排序 ========");
		
		Integer m[] = {11, 5, 88, 23, 8, 130, 120};

		// 使用 Lambda 表達式搭配 Comparator，自訂物件陣列的排序方式
		// y - x：降冪排序 (Descending Order)

		Arrays.sort(m, (x, y) -> y - x);
		
		System.out.println(Arrays.toString(m));
		
		System.out.println("=".repeat(30));
	}

}