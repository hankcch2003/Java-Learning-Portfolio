package javaocp;

class Student {
	
	// Access Modifier：private 限制只能在宣告該成員的 class 內直接存取
	private String name;
	
	private int id, age;

	// Getter Method：回傳 private instance variable 的值，提供外部唯讀存取
	public String getName() {

		return name;
	}

	// Setter Method：透過 public method 提供外部修改 private instance variable 的方式
	public void setName(String name) {

		this.name = name;
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public int getAge() {

		return age;
	}

	// Encapsulation：透過 Setter Method 將資料驗證規則集中在類別內部
	public void setAge(int age) {

		if (age > 25) {
			
			System.out.println("輸入錯誤，年齡不能大於25");
			
			// this Keyword：this.age 指向 instance variable，age 指向 method parameter
			this.age = 25;

		} else {
			
			this.age = age;
		}

	}

}

class Person {
	
	// Access Modifier：未指定存取修飾詞時為 Package-private，同一個 package 內可以直接存取
	String name;
	
	void setName(String name) {
		
		String title = "Dr.";

		this.name = title + name;
	}
	
	// Method Overriding：覆寫 Object 類別繼承而來的 toString() 方法
	@Override
	public String toString() {
		
		return name;
	}

}

public class JavaMethod_9 {

	public static void main(String[] args) {
		
		// Object Creation：使用 new 建立 Student 物件，呼叫編譯器提供的預設無參數建構子
		Student s = new Student();
		
		// Method Invocation：傳入 50，觸發年齡驗證條件，將 age 設定為 25
		s.setAge(50);
		
		System.out.println(s.getAge()); // 25
		
		// Method Invocation：傳入 15，因為未超過 25，所以直接指定 age = 15
		s.setAge(15);
		
		System.out.println(s.getAge()); // 15
		
		System.out.println("=".repeat(30));
		
		// Object Creation：使用 new 建立 Person 物件，呼叫編譯器提供的預設無參數建構子
		Person p = new Person();
		
		// Method Invocation：傳入 Who，執行字串串接並將結果指定給 name
		p.setName("Who");
		
		// toString()：println(Object) 會呼叫物件的 toString()，輸出 Dr.Who
		System.out.println(p); // Dr.Who
	}

}