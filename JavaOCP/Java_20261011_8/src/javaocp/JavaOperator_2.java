package javaocp;

import java.util.Scanner;

public class JavaOperator_2 {

	public static void main(String[] args) {
		
		// XOR（互斥或）：相同為 false，相異為 true
		System.out.println(10 < 3 ^ 10 < 3); // false
		
		System.out.println(10 < 3 ^ 10 > 3); // true
		
		System.out.println(10 > 3 ^ 10 < 3); // true
		
		System.out.println(10 > 3 ^ 10 > 3); // false
		
		// 三元運算子
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		do {

			System.out.print("請輸入成績：");
			
			score = sc.nextInt();
			
			// 利用三元運算子判斷評語
			// A：>= 90，B：80~89，C：70~79，D：60~69，E：< 60
			
			String level = score >= 90? "A": score >= 80? "B": score >= 70? "C": score >= 60? "D": "E";
			
			System.out.println("您的成績：" + score + " 分，等級為 " + level);
			
			System.out.println();

		} while (score != 0);

		// 邏輯運算子 & (and 看成乘法)
		int a = 1;
		
		System.out.println(10 < 3 & a++ > 0); // false
		
		System.out.println("a = " + a); // a = 2
		
        int b = 1;
		
		System.out.println(10 < 3 & b++ > 0); // false
		
		System.out.println("b = " + b); // b = 2
		
		sc.close();
	}

}