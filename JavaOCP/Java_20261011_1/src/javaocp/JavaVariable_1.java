package javaocp;

public class JavaVariable_1 {

    static int staticVar = 100; // 類別變數，所有物件共用

    static int staticVar2;

    public static void main(String[] args) {

        // 區域變數取得類別變數的值
        int localStaticVar2 = JavaVariable_1.staticVar2;

        System.out.println(localStaticVar2);

        int localVar = 666; // 區域變數

        localVar = 667;

        System.out.println("localVar = " + localVar);

        {
            // 宣告一個 block 區塊
            int blockVar = 111;

            blockVar = 222;

            System.out.println("blockVar = " + blockVar);
        }

        // blockVar = 222; 編譯錯誤，因為區域變數只存在於宣告的區塊內

        JavaVariable_1.staticVar = 555;

        System.out.println("staticVar = " + JavaVariable_1.staticVar);

        // 建立兩個 JavaVariable_1 類別物件
        // 語法：類別名稱 物件名稱 = new 類別名稱()

        JavaVariable_1 p1 = new JavaVariable_1();

        JavaVariable_1 p2 = new JavaVariable_1();

        System.out.println("=".repeat(50));

        // 使用類別名稱存取 static 類別變數
        System.out.println("初始值：" + JavaVariable_1.staticVar2);

        JavaVariable_1.staticVar2 = 111;

        System.out.println("設定為 111：" + JavaVariable_1.staticVar2);

        JavaVariable_1.staticVar2 = 666;

        System.out.println("設定為 666：" + JavaVariable_1.staticVar2);

        JavaVariable_1.staticVar2 = 999;

        System.out.println("設定為 999：" + JavaVariable_1.staticVar2);

        System.out.println("=".repeat(50));

        // 透過兩個物件呼叫實例方法
        p1.hello();

        p2.hello();

        // 不同物件看到的 static 變數仍是同一份
        System.out.println("p1 看到的 staticVar2：" + JavaVariable_1.staticVar2);

        System.out.println("p2 看到的 staticVar2：" + JavaVariable_1.staticVar2);
    }

    void hello() {

        // localVar = 111;
        // 編譯錯誤：localVar 是 main() 的區域變數，不能直接在 hello() 方法中使用

        JavaVariable_1.staticVar = 556;

        System.out.println("hello() 修改 staticVar = " + JavaVariable_1.staticVar);
    }

}