package jp.ac.uryukyu.ie.e195765;

import java.util.Scanner;

public class Order extends ThirtyGame {
    public String settingName(){
        waitMoment(2000);
        System.out.println("あっ...説明に夢中でまだ名前を聞いてなかったね！");
        System.out.println("ゲームを始める前にプレイヤーの名前を教えてね！\n(入力待ち)");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        setName(name);
        System.out.println(name + "さんだね！対戦よろしく！");
        return name;
    }
    public int DecideOrder() {
        waitMoment(2000);
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
}

