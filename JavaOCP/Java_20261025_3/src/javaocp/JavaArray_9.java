package javaocp;

public class JavaArray_9 {

	public static void main(String[] args) {
		
		// 建立不規則二維陣列 (Jagged Array)，每一列可以有不同長度
		String a[][] = new String[2][];
		
		a[0] = new String[2];
		
		a[1] = new String[5];
		
		int i = 97;
		
		// a.length 代表列數，這裡每一列都只執行兩次
		for (int m = 0; m < a.length; m++) {
			
			for (int p = 0; p < a.length; p++) {
				
				a[m][p] = "" + i;
				
				i++;
			}

		}
		
		for (String[] x : a) {
			
			for (String y : x) {
				
				System.out.print(y + "\t");
			}
			
			System.out.println();
		}
	
	}

}