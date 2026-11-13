package javaocp;

// Default Constructor：編譯器自動提供無參數建構子，並隱含呼叫父類別的 super()
class Son extends Father {
	
}

class Father {
	
	// Constructor Overloading：同一個類別可以定義多個參數列表不同的建構子
	Father(int a) {
		
		System.out.println("這是有一個參數的建構子");
	}
	
	Father() {
		
		System.out.println("這是無參數的建構子");
	}
	
	int money;
	
	String properties;
	
	void earnmoney() {
		
		System.out.println("白手起家");
	}

}

public class JavaInheritance_1 {

	public static void main(String[] args) {
		
		// Object Creation：建立 Son 物件，先隱含呼叫 Father 的無參數建構子
		Son s = new Son();
		
		System.out.println("=".repeat(30));
		
		// Inheritance：Son 繼承 Father 的 instance variable，int 預設值為 0
		System.out.println(s.money); // 0
		
		// Reference Type Default Value：String 屬於 Reference Type，instance variable 預設值為 null
		System.out.println(s.properties); // null
		
		// Inheritance：子類別可以呼叫從父類別繼承而來的 instance method
		s.earnmoney(); // 白手起家
		
		System.out.println("=".repeat(30));
		
		// Object Creation：建立 Dog 物件，呼叫 Dog 的無參數建構子
		Dog d = new Dog();
		
		// Constructor Chaining：Dog 透過 super("狗類") 呼叫 Animal(String) 建構子，將 name 初始化為狗類
		System.out.println(d.name); // 狗類
	}

}

class Animal {
	
	String name;
	
	// Parameterized Constructor：宣告有參數建構子後，編譯器不會自動提供無參數建構子
	Animal(String name) {
		
		// this Keyword：this.name 指向 instance variable，name 指向 constructor parameter
		this.name = name;
	}

}

class Dog extends Animal {
	
	// super()：明確呼叫父類別的有參數建構子，因為 Animal 沒有無參數建構子
	Dog() {
		
		super("狗類");
	}

}