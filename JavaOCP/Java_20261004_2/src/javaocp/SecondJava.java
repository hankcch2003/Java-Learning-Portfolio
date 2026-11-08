package javaocp;

public class SecondJava {

	public static void main(String[] args) {
		
		new SecondJava().aaa();
		
		bbb();
	}

	int aaa() {
		
		System.out.println("這是物件方法");
		
		return 1;
	}
	
	static void bbb() {
		
		System.out.println("這是類別方法");
	}

}