package javaocp;

// 宣告 Shirt 商品類別
class Shirt {
	
	// 宣告靜態變數，所有 Shirt 物件共用，作為商品編號計數器
	public static int no = 1;
	
	// 宣告商品編號實例變數
	public int shirtID;
	
	// 宣告商品顏色代碼，使用 char 字元型別
	public char colorCode;
	
	// 宣告商品尺寸，使用 String 字串型別
	public String size;
	
	// 宣告商品價格，使用 private 實現封裝
	private double price;
	
	// 宣告商品描述
	public String description;
	
	// 宣告有四個參數的建構子 (Parameterized Constructor)
	public Shirt(char colorCode, String size, double price, String description) {

		// 將目前 no 指派給商品編號，再將 no 加 1
		shirtID = no++;
		
		// 使用 this 指向目前物件的 colorCode 實例變數
		this.colorCode = colorCode;
		
		// 將傳入的 size 參數指定給目前物件的 size
		this.size = size;
		
		// 將傳入的 price 參數指定給目前物件的 price
		this.price = price;
		
		// 將傳入的 description 參數指定給目前物件的 description
		this.description = description;
	}

	// Setter：設定商品價格
	public void setPrice(double price) {
		
		// 判斷商品價格是否小於或等於 0
		if (price <= 0) {
			
			// 價格不合法時輸出錯誤訊息
			System.out.println("商品價格不能小於或等於 0 元");

		} else {
			
			// 價格合法時，修改目前物件的商品價格
			this.price = price;
		}

	}
	
	// Getter：取得商品價格
	public double getPrice() {
		
		// 回傳目前物件的商品價格
		return price;
	}
	
	// 宣告實例方法，顯示商品完整資訊
	public void displayInformation() {
		
		System.out.println("商品編號：" + shirtID);
		
		System.out.println("商品顏色：" + colorCode);
		
		System.out.println("商品尺寸：" + size);
		
		System.out.println("商品價格：" + price);
		
		System.out.println("商品描述：" + description);
	}

}

public class JavaWrappedClass_3 {

	public static void main(String[] args) {
		
		// 使用 new 建立 Shirt 物件，呼叫有四個參數的建構子
		Shirt p1 = new Shirt('C', "XXL", 20000, "秋冬最新款");
		
		// 建立第二個 Shirt 物件，商品編號會自動遞增
		Shirt p2 = new Shirt('M', "M", 10000, "秋冬最新款女裝");
		
		// 建立第三個 Shirt 物件，商品編號會再次自動遞增
		Shirt p3 = new Shirt('Y', "S", 5000, "秋冬最新款童裝");

		// 呼叫 p1 的 displayInformation() 方法，輸出第一件商品資訊
		p1.displayInformation();
		
		System.out.println("=".repeat(30));

		// 呼叫 p2 的 displayInformation() 方法，輸出第二件商品資訊
		p2.displayInformation();
		
		System.out.println("=".repeat(30));

		// 呼叫 p3 的 displayInformation() 方法，輸出第三件商品資訊
		p3.displayInformation();
		
		System.out.println("=".repeat(30));
		
		// 呼叫 Setter，將第三件商品的價格修改成 3000
		p3.setPrice(3000);
		
		// 呼叫 Getter，取得第三件商品修改後的價格
		System.out.println(p3.getPrice());
		
		// 再次呼叫 displayInformation()，確認商品價格已經更新
		p3.displayInformation();
	}

}