package javaocp;

public class JavaFormat_1 {

	public static void main(String[] args) {
		
		System.out.println(10 / 3); // 3，整數相除為整除
		
		System.out.println(10 / 3.); // 3.3333333333333335，浮點數相除才有小數
		
		System.out.println(10 / 3f); // 3.3333333，浮點數相除才有小數
		
		int x = 4, y = 2;
		
		System.out.println(x + y + " = (x + y) = " + x + y);
		
		System.out.println(x + y + " = (x + y) = " + (x + y));
		
		// 格式化輸出：格式字元需與資料型態完全相同，沒有所謂的小變大自動轉型
		// 格式字元如右：整數 %d，浮點數 %f，字元 %c，字串 %s，布林 %b
		
		String name = "巨匠電腦";
		
		byte age = 40;
		
		double height = 170.123;
		
		char blood = 'A';
		
		boolean gender = true;
		
		System.out.printf("我的名字：%s，今年 %d 歲，身高：%.2f，血型：%c，性別：%b\n", name, age, height, blood, gender);

		// 字串結合：整數結合字串，會轉為字串
		System.out.println(1234 + 5678); // 6912
		
		System.out.println("1234" + "5678"); // 12345678
		
		System.out.println(12 + 34 + "56" + (78 + 10)); // 465688
	}

}