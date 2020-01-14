package jp.ac.uryukyu.ie.e195765;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ThirtyGame game = new ThirtyGame();
        System.out.println("来てくれてありがとう！");
        System.out.println("30いったら負けゲーム・・・って知ってる？");
        game.waitMoment(2000);
        System.out.println("_____________________________"+"\nまずルールの説明をするよ！");
        game.waitMoment(2000);
        System.out.println("ルールの説明を聞く？\n1→聞く！\n2→スキップする！");
        while(true){
            Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try {
            int number = Integer.parseInt(str);
            if (number == 1) {
                System.out.println("分かった！ルールの説明をするね！");
                game.waitMoment(2000);
                System.out.println("2人のうち、どちらかが先攻、どちらかが後攻となって1~30まで交互に数字を数え、先に30を言った方が負け！\n簡単なゲームだよ！");
                game.waitMoment(4000);

                System.out.println("今、先攻が1,2,・・29 と言ったら勝ちじゃんか！と思ったよね？\nでもそこまで簡単なゲームじゃなくて、一回につき最大3つまでしか数字を言えないんだ！");
                game.waitMoment(6000);

                System.out.println("______________\n例\nAさん「1」\nBさん「4」\nAさん「6」\n・\n・\n・\nBさん「27」\nAさん「29」\nBさん「30」\n______________");
                System.out.println("この場合、Bさんの負けだね！だいたい分かったかな？");
                game.waitMoment(3000);
                break;
            } else if(number == 2) {
                System.out.println("分かった！すぐにゲームを始めるね！");
                break;
            }else{
                System.out.println("1か2で答えてね！");
            }
        } catch (NumberFormatException e) {
            System.out.println("数字で答えてね！");
        }
        }


        Order order = new Order(); //先攻か後攻か決める
        String name = order.settingName();//プレイヤー名を入力してもらう
        int modeNumber = order.DecideMode();
        int AnsNumber = order.DecideOrder();
        game.ThirtyGame(name,AnsNumber,modeNumber);
        }
    }