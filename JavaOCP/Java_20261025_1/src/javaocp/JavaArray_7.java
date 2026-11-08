package javaocp;

import java.util.Arrays;

import java.util.List;

import java.util.stream.Stream;

public class JavaArray_7 {

	public static void main(String[] args) {

		ok:

		for (int m = 1; m <= 5; m++) {
			
			for (int p = 1; p <= 5; p++) {
				
				if (p == 2) {
					
					break ok;
				}
				
				System.out.println("m = " + m + ", " + "p = " + p);
			}

		}
		
		System.out.println("=".repeat(30));
		
		int c = 4;
		
		// >>：帶符號右移，每右移 1 位，相當於除以 2 (正數情況下)
		System.out.println(c >> 1);
		
		// <<：左移，每左移 1 位，相當於乘以 2 (未發生溢位的情況下)
		System.out.println(c << 1);
		
		System.out.println("=".repeat(30));
		
		int a[] = {1, 2, 3, 4, 5};

		for (int x : a) {
			
			System.out.print(x + "\t");
		}
		
		System.out.println();

		System.out.println(Arrays.toString(a));
		
		System.out.println("=".repeat(30));
		
		// Arrays.asList() 可以將物件陣列轉換為 List
		// 但基本型別陣列 (例如 int[]) 不會自動拆解成個別元素
		// 因此會將整個 int[] 陣列視為單一元素，產生 List<int[]>

		List<int[]> list1 = Arrays.asList(a);

		System.out.println(list1);
		
		System.out.println("=".repeat(30));
		
		Integer b[] = {1, 2, 3, 4, 5};

		List<Integer> list2 = Arrays.asList(b);
		
		System.out.println(list2);

		// Arrays.asList() 回傳固定長度 (Fixed-size) 的 List
		// 可以使用 set() 修改既有元素，但不能使用 add() 或 remove() 改變元素數量
		
		list2.set(0, 120);
		
		System.out.println(list2);
		
		// 修改 List 中的元素，也會同步反映到原始陣列 b
		System.out.println(Arrays.toString(b));
		
		System.out.println("=".repeat(30));

		// Stream.of() 將 Integer[] 的元素逐一轉換成 Stream
		Stream.of(b).forEach(System.out::println);
	}

}