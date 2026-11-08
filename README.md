# Java Learning Portfolio (Java 學習作品集)

Java 基礎程式設計與 Oracle Java SE 21 Developer Certification（OCP-819）的學習及實作紀錄。

## 專案簡介

本專案用來整理 Java 程式設計的學習成果，包含 Java 基礎語法、物件導向程式設計、資料型別、運算子、流程控制、陣列、字串、方法及 Java API 等練習。

除了 Java 基礎練習，也持續整理 Oracle Java SE 21 Developer Certification（OCP-819）的考點程式範例、語法測試及學習紀錄。

本作品集以實際完成的練習與程式碼為主，依照學習日期及主題分類，方便查閱、測試及持續更新。

## 技術與工具

| 類別 | 技術或工具 |
|---|---|
| 程式語言 | Java |
| Java 版本 | Java SE 21 |
| 基礎練習 | Java Basic |
| 認證準備 | Oracle Java SE 21 Developer Certification（OCP-819） |
| 開發環境 | Windows |
| 開發工具 | Java IDE、Visual Studio Code |
| 命令列工具 | Windows CMD |
| 版本控制 | Git、GitHub |

本專案包含 Java 基礎語法練習及 OCP-819 考試準備程式範例；不代表所有 Java SE 21 考試範圍均已完成，也不代表已取得 Oracle Java 認證。

## 專案結構

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
    │   └── ...
    │
    ├── .gitignore
    └── README.md

## 一、Java 基礎練習

`JavaBasic/`

整理 Java 基礎語法與程式實作練習，涵蓋：

* Hello World、Java 語法及程式註解
* 變數、常數及識別字
* 基本資料型別與型別轉換
* 數字、數學運算及運算子
* 字串（String）操作
* 布林值（Boolean）
* 條件判斷（if、else）
* 多重條件判斷（switch）
* 迴圈（for、while）
* break 與 continue
* 陣列（Array）
* 方法（Method）
* 方法參數、回傳值及相關練習

每個主題使用獨立資料夾保存程式碼，並透過編號區分不同練習。

此區域主要用來建立 Java 程式設計基礎，熟悉語法規則及基本程式邏輯。

## 二、Oracle Java SE 21 OCP-819 考試準備

`JavaOCP/`

依照學習日期及練習順序整理 Oracle Java SE 21 Developer Certification（OCP-819）相關程式範例。

目前整理的學習內容包括：

| 學習日期 | 主要練習內容 |
|---|---|
| 2026-10-04 | Java 基礎語法、Package、Data Types |
| 2026-10-11 | Variables、Constants、Java Format、Operators |
| 2026-10-18 | Control Flow、Arrays |
| 2026-10-25 | Arrays、String |
| 2026-11-01 | Wrapper Classes、Methods |

### 練習內容

* Java 變數、常數及資料型別
* 基本型別與參考型別
* 運算子及運算式
* 流程控制與條件判斷
* 陣列及陣列操作
* String 類別與字串操作
* Wrapper Classes（包裝類別）
* Methods（方法）及相關語法

### 程式碼整理方式

每次學習依照日期建立獨立資料夾，例如：

`JavaOCP/Java_20261101_1/`

各資料夾內使用 `src/` 保存 Java 原始程式碼，並依照不同考點及練習內容建立對應的 Java 類別。

部分練習使用 Package 管理類別，方便熟悉 Java 套件及類別的組織方式。

此區域以考點理解、程式執行結果及語法測試為主，持續累積 OCP-819 考試準備所需的實作經驗。

## 三、開發環境

開始執行前，請先準備：

* Windows 開發環境
* JDK 21（Java Development Kit）
* 支援 Java 的 IDE 或 Visual Studio Code
* Windows CMD 或其他終端機
* Git（用於版本控制）
* GitHub 帳號（用於遠端程式碼管理）

本專案以 Java SE 21 為 OCP-819 學習及考試準備的目標版本。

可使用以下指令確認 Java 開發環境：

    java -version
    javac -version

`java -version` 用來確認 Java 執行環境版本。

`javac -version` 用來確認 Java 編譯器版本。

若使用其他 JDK 版本，請留意不同 Java 版本之間的語法及 API 差異。

## 四、本機執行方式

### 1. 取得專案

使用 Git Clone 下載 GitHub Repository：

    git clone https://github.com/hankcch2003/Java-Learning-Portfolio.git

進入專案目錄：

    cd Java-Learning-Portfolio

### 2. 確認 Java 開發環境

在 CMD 輸入：

    java -version
    javac -version

確認已安裝 JDK，且 Java 執行環境及編譯器可以正常使用。

### 3. 執行 Java Basic 練習

例如執行 HelloWorld 練習：

    javac -d out JavaBasic/HelloWorld_1/src/HelloWorld_1.java

編譯完成後執行：

    java -cp out HelloWorld_1

其中：

* `javac`：Java 編譯器。
* `-d out`：指定編譯後的 `.class` 檔案輸出目錄。
* `java -cp out`：指定類別搜尋路徑並執行程式。

實際執行時，請依照欲測試的練習資料夾及 Java 類別名稱調整檔案路徑。

### 4. 執行 Java OCP 練習

OCP 練習依照不同日期及考點建立獨立資料夾。

若程式包含 Package，編譯及執行時需要依照 Package 名稱指定完整類別路徑。

例如：

    javac -d out JavaOCP/Java_20261101_1/src/javaocp/JavaWrappedClass_1.java

執行：

    java -cp out javaocp.JavaWrappedClass_1

若程式使用其他 Package，請依照原始程式碼中的 `package` 宣告調整執行名稱。

部分練習可能需要先確認類別是否包含 `main()` 方法，才能直接執行。

### 5. 使用 IDE 執行

也可以使用支援 Java 的 IDE 開啟個別練習資料夾。

執行前請確認：

* 已正確設定 JDK。
* Java 原始程式碼沒有編譯錯誤。
* Package 與資料夾結構符合程式碼宣告。
* 執行的類別包含適當的程式進入點。

各練習以獨立測試為主，方便依照不同考點進行編譯、執行及結果確認。

## 五、開發過程中的問題與解決方式

### 1. Git 無法識別提交作者

遇到的問題

第一次執行 `git commit` 時，出現：

    Author identity unknown

    fatal: unable to auto-detect email address

原因

Git 尚未設定提交紀錄使用的作者名稱及電子郵件。

解決方式

設定 Git 作者資訊：

    git config --global user.name "你的 GitHub 使用者名稱"
    git config --global user.email "你的 GitHub 關聯電子郵件"

再透過以下指令確認：

    git config --global --list

完成設定後重新執行 Git Commit。

這是本專案版本控制初始化過程中實際遇到並解決的問題。

### 2. Git 分支名稱調整

遇到的需求

建立本機 Git Repository 後，預設分支名稱為 `master`，希望統一使用 GitHub 常見的 `main` 分支名稱。

解決方式

執行：

    git branch -M main

確認目前分支：

    git branch

若顯示：

    * main

代表分支名稱已成功修改。

### 3. 設定 GitHub 遠端 Repository

遇到的需求

本機 Git Repository 建立完成後，需要連接 GitHub 遠端 Repository，才能將程式碼上傳至雲端。

解決方式

新增遠端 Repository：

    git remote add origin https://github.com/hankcch2003/Java-Learning-Portfolio.git

確認遠端設定：

    git remote -v

確認顯示正確的 GitHub Repository 網址。

### 4. GitHub Push 需要進行身分驗證

遇到的情況

第一次執行 Git Push 時，CMD 顯示：

    info: please complete authentication in your browser...

原因

GitHub 需要確認使用者身分，才能授權本機 Git 上傳程式碼。

解決方式

依照提示開啟瀏覽器，完成 GitHub 身分驗證及授權。

完成授權後重新確認 CMD 是否出現成功推送的訊息。

本專案已成功完成 GitHub 瀏覽器驗證及第一次 Git Push。

### 5. 確認本機與 GitHub 同步狀態

當程式碼完成修改及推送後，可以透過以下指令確認目前 Git 狀態：

    git status

若顯示：

    On branch main
    Your branch is up to date with 'origin/main'.

    nothing to commit, working tree clean

代表目前本機工作目錄沒有尚未提交的修改，且本機分支已與遠端追蹤分支同步。

### 6. Java 編譯與執行問題排查

常見問題

* `javac` 無法辨識：確認 JDK 是否正確安裝，以及 PATH 環境變數設定。
* 找不到類別：確認編譯輸出目錄及 Classpath 設定。
* Package 錯誤：確認 `package` 宣告與類別執行名稱。
* 找不到 `main()` 方法：確認欲執行的類別是否包含程式進入點。
* Java 版本不相容：確認 JDK 版本及程式使用的 Java 語法。

排查方式

1. 使用 `java -version` 確認 Java 執行環境。
2. 使用 `javac -version` 確認編譯器。
3. 檢查 Java 原始程式碼及 Package 宣告。
4. 確認編譯輸出目錄與執行類別名稱。
5. 查看 CMD 或 IDE 顯示的完整錯誤訊息。

將問題分成環境設定、程式編譯及程式執行三個部分，有助於縮小問題範圍。

## 六、Git 與 GitHub 版本控制

本專案使用 Git 管理 Java 練習程式，並透過 GitHub 保存遠端 Repository。

GitHub Repository：

https://github.com/hankcch2003/Java-Learning-Portfolio

本機專案目錄：

`F:\Java-Learning-Portfolio`

主要分支：

`main`

### 日常更新方式

新增或修改 Java 程式後，可以依序執行：

    git add .

    git commit -m "Update: Java OCP practice"

    git push

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

本專案透過 `.gitignore` 排除不需要納入版本控制的檔案，例如 IDE 暫存資料、編譯產物及不適合公開的課程教材。

## 七、目前學習成果

透過本專案，持續練習及整理以下內容：

* 使用 Java 撰寫基礎程式及語法練習。
* 熟悉變數、資料型別、運算子及流程控制。
* 練習陣列、字串及方法的使用方式。
* 建立 Java 物件導向程式設計的基礎。
* 依照 Oracle Java SE 21 OCP-819 考試範圍整理程式範例。
* 透過實際編譯及執行程式確認語法與執行結果。
* 使用 Package 管理 Java 類別。
* 使用 Git 管理程式碼版本。
* 使用 GitHub 保存及展示 Java 學習成果。
* 記錄開發環境設定、版本控制及常見問題排查方式。

本作品集主要整理 Java 基礎語法、Oracle Java SE 21 OCP-819 證照考試準備，以及相關程式實作練習，記錄學習過程中的程式碼、考點整理與實作成果。

## 八、更新說明（Updates）

本作品集將隨著 Java 學習進度持續更新，逐步新增 Java 程式練習、OCP-819 考點整理、範例程式及相關學習文件。

新增內容將依照主題分類整理，並同步更新本 README.md，以呈現目前的學習進度及實作成果。