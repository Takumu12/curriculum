package study;

public class Task extends Calculator {
    
 // ① TaskクラスにCalculatorクラスを継承させなさい。

    /**
     * タスクの実行
     */
    public void doTask() {
        
        System.out.println("plusメソッドが1つの場合"+super.plus(10));
        
        
        System.out.println("plusメソッドが2つの場合"+super.plus(10,20));
       
        
        System.out.println("plusメソッドが3つの場合"+super.plus(10,20,30));
        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。

    }

}
