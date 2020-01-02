package jp.ac.uryukyu.ie.e195765;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("ゲームを始める前にプレイヤーの名前を入力してね！\n(入力待ち)");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println(name + "さん。対戦よろしく！");
        System.out.println("ルールの説明をするよ！");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "さんと私、どちらかが先攻、どちらかが後攻となって1~30まで交互に数字を数え、先に30を言った方が負け！\n簡単なゲームだね！");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "さん。今、先攻が1,2,・・29 といえば勝ちじゃんか！と思ったよね？\nでもそこまで簡単なゲームじゃなくて、一回につき最大3つまでしか数字を言えないんだ！");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("例\nAさん「1」\nBさん「4」\nAさん「6」\n・\n・\n・\nAさん「29」\nBさん「30」");
        System.out.println("この場合、Bさんの負けだね！だいたい分かったかな？");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Order order = new Order();
        order.DecideOrder();

        }}


