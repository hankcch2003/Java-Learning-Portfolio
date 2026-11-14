# Java Learning Portfolio (Java 學習作品集)

Java 基礎程式設計與 Oracle Java SE 11 Developer Certification（1Z0-819）考試準備作品集。

## 專案簡介

本專案用來整理 Java 程式設計的學習成果，包含 Java 基礎語法、物件導向程式設計、資料型別、運算子、流程控制、陣列、字串、方法及 Java API 等練習。

除了 Java 基礎練習，也持續整理 Oracle Java SE 11 Developer Certification（1Z0-819）的考點程式範例、語法測試及學習內容。

本專案以 Java SE 11 作為認證考試準備目標，並使用 Java SE 21 作為主要開發環境，透過實際撰寫及執行程式，加深對 Java 語法及程式設計概念的理解。

本作品集依照學習日期及主題分類，方便查閱、測試及持續更新。

## 技術與工具

| 類別 | 技術或工具 |
|---|---|
| 程式語言 | Java |
| 考試版本 | Java SE 11 |
| 開發版本 | Java SE 21 |
| 基礎練習 | Java Basic |
| 認證準備 | Oracle Java SE 11 Developer Certification（1Z0-819） |
| 開發環境 | Windows |
| 開發工具 | Java IDE、Visual Studio Code |
| 命令列工具 | Windows CMD |
| 版本控制 | Git、GitHub |

本專案以 Java SE 11 作為 1Z0-819 考試準備方向，並使用 Java SE 21 進行練習。由於不同 Java 版本之間可能存在語法及 API 差異，練習時會特別留意版本相容性。

## 專案結構

```text
Java-Learning-Portfolio/
├── JavaBasic/
│   ├── Array_1/
│   │   └── src/
│   │       └── Array_1.java
│   ├── Boolean_1/
│   │   └── src/
│   │       └── Boolean_1.java
│   ├── For_1/
│   │   └── src/
│   │       └── For_1.java
│   ├── Method_1/
│   │   └── src/
│   │       └── Method_1.java
│   └── ...
│
├── JavaOCP/
│   ├── Java_20261004_1/
│   │   └── src/
│   ├── Java_20261011_1/
│   │   └── src/
│   ├── Java_20261018_1/
│   │   └── src/
│   ├── Java_20261025_1/
│   │   └── src/
│   ├── Java_20261101_1/
│   │   └── src/
│   ├── Java_20261108_1/
│   │   └── src/
│   └── ...
│
├── .gitignore
└── README.md
```

## 一、Java 基礎練習

`JavaBasic/`

整理 Java 基礎語法與程式練習，涵蓋：

- Hello World、Java 語法及程式註解
- 變數、常數及識別字
- 基本資料型別與型別轉換
- 數字、數學運算及運算子
- 字串（String）操作
- 布林值（Boolean）
- 條件判斷（if、else）
- 多重條件判斷（switch）
- 迴圈（for、while）
- break 與 continue
- 陣列（Array）
- 方法（Method）
- 方法參數、回傳值及相關練習

每個主題使用獨立資料夾保存程式碼，並透過編號區分不同練習。

此區域主要用來建立 Java 程式設計基礎，熟悉語法規則及基本程式邏輯。

## 二、Oracle Java SE 11 Developer（1Z0-819）考試準備

`JavaOCP/`

依照 Oracle Java SE 11 Developer（1Z0-819）考試範圍及學習順序整理相關程式範例。

目前整理的學習內容包括：

| 學習日期 | 主要練習內容 |
|---|---|
| 2026-10-04 | Java 基礎語法、Package、Data Types |
| 2026-10-11 | Variables、Constants、Java Format、Operators |
| 2026-10-18 | Control Flow、Arrays |
| 2026-10-25 | Arrays、String |
| 2026-11-01 | Wrapper Classes、Methods |
| 2026-11-08 | Methods、Method Overloading、Varargs、Pass by Value、Encapsulation、Constructors、Inheritance |

### 練習內容

- Java 變數、常數及資料型別
- 基本型別與參考型別
- 運算子及運算式
- 流程控制與條件判斷
- 陣列及陣列操作
- String 類別與字串操作
- Wrapper Classes（包裝類別）
- Methods（方法）及相關語法
- Boolean.parseBoolean() 與 Boolean.valueOf() 的使用
- String.compareTo() 字串比較
- Arrays.mismatch() 與 Arrays.compare() 陣列比較
- Pass by Value（傳值呼叫）及參考型別參數的操作
- Method Overloading（方法多載）
- Varargs（可變參數）
- 方法多載的選擇優先順序、自動轉型及自動裝箱
- Access Modifiers（存取修飾詞）
- Encapsulation（封裝）
- Getter 與 Setter Methods
- this Keyword（this 關鍵字）
- Object Class 與 toString() 方法
- Constructors（建構子）
- Default Constructor（預設建構子）
- Constructor Overloading（建構子多載）
- Constructor Chaining（建構子串接）
- Inheritance（繼承）
- super Keyword（super 關鍵字）
- Implicit Super Constructor（隱含父類別建構子呼叫）
- Instance Variables（實例變數）及預設值

### 2026-11-08 學習內容整理

本次練習涵蓋 Methods、Method Overloading、Varargs，以及物件導向程式設計的基本概念。

主要內容：

**1. Method Overloading 與 Varargs**

- Primitive Widening（基本型別擴大轉型）
- Autoboxing（自動裝箱）
- Reference Widening（參考型別向上轉型）
- Varargs（可變參數）
- 多載方法的選擇優先順序
- Primitive Array 與 Reference Array 的型別差異
- Array Runtime Type（陣列執行時期型別）
- getClass()、getSimpleName()、getSuperclass()
- Binary Numeric Promotion（二元數值提升）

**2. Encapsulation 與 Access Modifiers**

- private、public 與 Package-private
- Getter 與 Setter Methods
- 使用 Setter 集中管理資料驗證
- this Keyword 的使用
- Object Class 的 toString() 方法覆寫

**3. Constructors 與 Inheritance**

- Default Constructor（預設建構子）
- Parameterized Constructor（有參數建構子）
- Constructor Overloading（建構子多載）
- Constructor Chaining（建構子串接）
- this() 與 super() 的使用
- Implicit Super Constructor（隱含父類別建構子呼叫）
- extends 關鍵字與類別繼承
- 子類別存取父類別繼承而來的成員
- Instance Variables 的預設值

### 程式碼整理方式

每次學習依照日期建立獨立資料夾，例如：

`JavaOCP/Java_20261101_1/`

`JavaOCP/Java_20261108_1/`

各資料夾內使用 `src/` 保存 Java 原始程式碼，並依照不同考點及練習內容建立對應的 Java 類別。

部分練習使用 Package 管理類別，方便熟悉 Java 套件及類別的組織方式。

此區域以考點理解及語法測試為主，持續累積 1Z0-819 考試準備所需的實作經驗。

## 三、開發環境

開始執行前，請先準備：

- Windows 開發環境
- JDK 21（Java Development Kit）
- 支援 Java 的 IDE 或 Visual Studio Code
- Windows CMD 或其他終端機
- Git（用於版本控制）
- GitHub 帳號（用於遠端程式碼管理）

本專案主要使用 Java SE 21 作為開發環境，並以 Java SE 11 作為 1Z0-819 考試準備的目標版本。

可使用以下指令確認 Java 開發環境：

```bash
java -version
javac -version
```

- `java -version`：確認 Java 執行環境版本。
- `javac -version`：確認 Java 編譯器版本。

### Java 版本相容性檢查

由於本專案使用 Java SE 21 作為開發環境，而認證考試以 Java SE 11 為準備目標，因此需要留意版本差異。

可以使用以下指令檢查程式是否符合 Java SE 11 的語言及 API 相容性：

```bash
javac --release 11 -d out YourClass.java
```

`--release 11` 可以指定 Java SE 11 的語言規則及 API 版本進行編譯檢查。

## 四、本機執行方式

### 1. 取得專案

使用 Git Clone 下載 GitHub Repository：

```bash
git clone https://github.com/hankcch2003/Java-Learning-Portfolio.git
```

進入專案目錄：

```bash
cd Java-Learning-Portfolio
```

### 2. 確認 Java 開發環境

在 CMD 輸入：

```bash
java -version
javac -version
```

確認已安裝 JDK，且 Java 執行環境及編譯器可以正常使用。

### 3. 執行 Java Basic 練習

例如執行 HelloWorld 練習：

```bash
javac -d out JavaBasic/HelloWorld_1/src/HelloWorld_1.java
```

編譯完成後執行：

```bash
java -cp out HelloWorld_1
```

其中：

- `javac`：Java 編譯器。
- `-d out`：指定編譯後的 `.class` 檔案輸出目錄。
- `java -cp out`：指定類別搜尋路徑並執行程式。

實際執行時，請依照欲測試的練習資料夾及 Java 類別名稱調整檔案路徑。

### 4. 執行 Java OCP 練習

OCP 練習依照不同日期及考點建立獨立資料夾。

若程式包含 Package，編譯及執行時需要依照 Package 名稱指定完整類別路徑。

例如：

```bash
javac -d out JavaOCP/Java_20261101_1/src/javaocp/JavaWrappedClass_1.java
```

執行：

```bash
java -cp out javaocp.JavaWrappedClass_1
```

若程式使用其他 Package，請依照原始程式碼中的 `package` 宣告調整執行名稱。

部分練習可能需要先確認類別是否包含 `main()` 方法，才能直接執行。

### 5. 使用 IDE 執行

也可以使用支援 Java 的 IDE 開啟個別練習資料夾。

執行前請確認：

- 已正確設定 JDK。
- Java 原始程式碼沒有編譯錯誤。
- Package 與資料夾結構符合程式碼宣告。
- 執行的類別包含適當的程式進入點。

各練習以獨立測試為主，方便依照不同考點進行編譯、執行及結果確認。

## 五、開發過程中的問題與解決方式

### 1. Git 無法識別提交作者

**遇到的問題**

第一次執行 `git commit` 時，出現：

```text
Author identity unknown

fatal: unable to auto-detect email address
```

**原因**

Git 尚未設定提交紀錄使用的作者名稱及電子郵件。

**解決方式**

設定 Git 作者資訊：

```bash
git config --global user.name "你的 GitHub 使用者名稱"
git config --global user.email "你的 GitHub 關聯電子郵件"
```

再透過以下指令確認：

```bash
git config --global --list
```

完成設定後重新執行 Git Commit。

### 2. Git 分支名稱調整

**遇到的需求**

建立本機 Git Repository 後，預設分支名稱為 `master`，希望統一使用 GitHub 常見的 `main` 分支名稱。

**解決方式**

執行：

```bash
git branch -M main
```

確認目前分支：

```bash
git branch
```

若顯示：

```text
* main
```

代表分支名稱已成功修改。

### 3. 設定 GitHub 遠端 Repository

**遇到的需求**

本機 Git Repository 建立完成後，需要連接 GitHub 遠端 Repository，才能將程式碼上傳至雲端。

**解決方式**

新增遠端 Repository：

```bash
git remote add origin https://github.com/hankcch2003/Java-Learning-Portfolio.git
```

確認遠端設定：

```bash
git remote -v
```

確認顯示正確的 GitHub Repository 網址。

### 4. GitHub Push 需要進行身分驗證

**遇到的情況**

第一次執行 Git Push 時，CMD 顯示：

```text
info: please complete authentication in your browser...
```

**原因**

GitHub 需要確認使用者身分，才能授權本機 Git 上傳程式碼。

**解決方式**

依照提示開啟瀏覽器，完成 GitHub 身分驗證及授權。

完成授權後重新確認 CMD 是否出現成功推送的訊息。

### 5. Git safe.directory 安全目錄設定

**遇到的問題**

在 Windows 環境執行 Git 指令時，出現：

```text
fatal: detected dubious ownership in repository
```

**原因**

Git 偵測到專案資料夾的檔案系統無法記錄或確認擁有者資訊，因此基於安全性考量，暫時拒絕操作該目錄。

**解決方式**

將專案資料夾加入 Git 安全目錄：

```bash
git config --global --add safe.directory E:/Java-Learning-Portfolio
```

完成設定後，即可重新執行 Git 指令。

### 6. 確認本機與 GitHub 同步狀態

當程式碼完成修改及推送後，可以透過以下指令確認目前 Git 狀態：

```bash
git status
```

若顯示：

```text
On branch main
Your branch is up to date with 'origin/main'.

nothing to commit, working tree clean
```

代表目前本機工作目錄沒有尚未提交的修改，且本機分支已與遠端追蹤分支同步。

### 7. Java 編譯與執行問題排查

**常見問題**

- `javac` 無法辨識：確認 JDK 是否正確安裝，以及 PATH 環境變數設定。
- 找不到類別：確認編譯輸出目錄及 Classpath 設定。
- Package 錯誤：確認 `package` 宣告與類別執行名稱。
- 找不到 `main()` 方法：確認欲執行的類別是否包含程式進入點。
- Java 版本不相容：確認 JDK 版本及程式使用的 Java 語法與 API。

**排查方式**

1. 使用 `java -version` 確認 Java 執行環境。
2. 使用 `javac -version` 確認編譯器。
3. 檢查 Java 原始程式碼及 Package 宣告。
4. 確認編譯輸出目錄與執行類別名稱。
5. 查看 CMD 或 IDE 顯示的完整錯誤訊息。

將問題分成環境設定、程式編譯及程式執行三個部分，有助於縮小問題範圍。

## 六、Git 與 GitHub 版本控制

本專案使用 Git 管理 Java 練習程式，並透過 GitHub 保存遠端 Repository。

**GitHub Repository：**

https://github.com/hankcch2003/Java-Learning-Portfolio

**本機專案目錄：**

`E:\Java-Learning-Portfolio`

**主要分支：**

`main`

### 日常更新方式

新增或修改 Java 程式及 README.md 後，可以依序執行：

```bash
git status
git add .
git commit -m "Update: Java OCP practice"
git push
```

### 常用 Git 指令

| 指令 | 功能 |
|---|---|
| `git status` | 查看目前檔案狀態 |
| `git add .` | 將變更加入暫存區 |
| `git commit -m "訊息"` | 建立版本紀錄 |
| `git push` | 推送至 GitHub |
| `git pull` | 取得遠端最新變更 |
| `git log --oneline` | 查看 Commit 紀錄 |
| `git branch` | 查看目前分支 |
| `git remote -v` | 查看遠端 Repository 設定 |

本專案透過 `.gitignore` 排除不需要納入版本控制的檔案，例如 IDE 暫存資料、編譯產物及不適合公開的課程教材。

## 七、目前學習成果

透過本專案，持續練習及整理以下內容：

- 使用 Java 撰寫基礎程式及語法練習。
- 熟悉變數、資料型別、運算子及流程控制。
- 練習陣列、字串及方法的使用方式。
- 建立 Java 物件導向程式設計的基礎。
- 依照 Oracle Java SE 11 Developer（1Z0-819）考試範圍整理程式範例。
- 使用 Java SE 21 進行程式編譯及執行。
- 學習 Java SE 11 與 Java SE 21 之間的語法及 API 差異。
- 使用 Package 管理 Java 類別。
- 練習 Method Overloading、Varargs 及 Pass by Value。
- 熟悉 String、Wrapper Classes 及 Arrays 相關 API。
- 學習 Encapsulation、Constructors 及 Inheritance。
- 使用 Git 管理程式碼版本。
- 使用 GitHub 保存及展示 Java 學習成果。
- 記錄開發環境設定、版本控制及常見問題排查方式。

本作品集主要整理 Java 基礎語法、Oracle Java SE 11 Developer（1Z0-819）考試準備，以及相關 Java 練習成果。

## 八、更新說明（Updates）

本作品集將隨著 Java 學習進度持續更新，逐步新增 Java 程式練習、1Z0-819 考點整理、範例程式及相關學習文件。

新增內容將依照主題分類整理，並同步更新本 README.md，以呈現目前的學習進度及學習成果。

## 九、Git 上傳指令

在 Windows CMD 或 VS Code 終端機中，先進入專案資料夾：

```bash
E:
cd E:\Java-Learning-Portfolio
```

確認目前 Git 狀態：

```bash
git status
```

將修改過的檔案加入暫存區：

```bash
git add .
```

建立 Commit：

```bash
git commit -m "Update README: Java SE 11 OCP and Java SE 21 practice"
```

推送至 GitHub：

```bash
git push origin main
```

確認推送結果：

```bash
git status
```

若顯示：

```text
On branch main
Your branch is up to date with 'origin/main'.

nothing to commit, working tree clean
```

代表本機修改已提交，且本機分支與遠端分支同步。