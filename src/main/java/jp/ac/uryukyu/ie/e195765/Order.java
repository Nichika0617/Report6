package jp.ac.uryukyu.ie.e195765;

import java.util.Scanner;

public class Order extends ThirtyGame {
    /**
     * プレイヤーの名前を入力してもらい、設定するメソッド
     * @return String name プレイヤー名
     */
    public String settingName(){
        waitMoment(2000);
        System.out.println("あっ...まだ名前を聞いてなかったね！");
        System.out.println("ゲームを始める前にプレイヤーの名前を教えてね！\n(入力待ち)");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        setName(name);
        System.out.println(name + "さんだね！対戦よろしく！");
        return name;
    }

    /**
     * 先攻か後攻かをプレイヤーに決めてもらうためのメソッド
     * @return 1(先攻)か2(後攻)
     */
    public int DecideOrder() {
        waitMoment(1000);
        System.out.println("じゃあゲームを始めるよ！先攻、後攻どっちにする？1か2で答えてね！\n1→先攻\n2→後攻");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            try {
                int number = Integer.parseInt(str);
                setSelectedNumber(number);
                if (getSelectedNumber() <= 2) {
                    //何もせず次に進む
                } else {
                    System.out.println("1か2で答えてね！");
                }
            } catch (NumberFormatException e) {
                System.out.println("数字で答えてね！");
            }
            if (getSelectedNumber() == 1) {
                return 1;
            } else if (getSelectedNumber() == 2) {
                return 2;
            }
        }
    }
    public int DecideMode(){
        waitMoment(2000);
        System.out.println("難易度はどうする？1か2で答えてね！\n1→ノーマル\n2→ハード(最強)");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            try {
                int number = Integer.parseInt(str);
                setSelectedNumber(number);
                if (getSelectedNumber() <= 2) {
                    //何もせず次に進む
                } else {
                    System.out.println("1か2で答えてね！");
                }
            } catch (NumberFormatException e) {
                System.out.println("数字で答えてね！");
            }
            if (getSelectedNumber() == 1) {
                System.out.println("のんびり楽しもうね！");
                return 1;
            } else if (getSelectedNumber() == 2) {
                System.out.println("本気でいいの！？");
                waitMoment(2000);
                System.out.println("いざ、勝負！！");
                return 2;
            }
        }


    }
}