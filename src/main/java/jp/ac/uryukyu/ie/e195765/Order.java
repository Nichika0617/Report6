package jp.ac.uryukyu.ie.e195765;

import java.util.Scanner;

public class Order extends ThirtyGame {
    public void settingName(){
        waitMoment(2000);
        System.out.println("...説明に夢中でまだ名前を聞いてなかったね！");
        System.out.println("ゲームを始める前にプレイヤーの名前を教えてね！\n(入力待ち)");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        setName(name);
        System.out.println(name + "さんだね！対戦よろしく！");
    }
    public void DecideOrder() {
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
                System.out.println("分かった！" +getName()+ "さんが先攻だね！1~3の数字を言って始めてね！");
                while (true) {
                    PrayerAction act1 = new PrayerAction();
                    setCount(act1.PrayerAction(getCount()));
                    act1.judge(getName(),getCount());

                    ComputerAction act2 = new ComputerAction(getCount());
                    setCount(act2.ComputerAction(getCount()));
                    act2.judge(getName(),getCount());
                    if (getCount() >= 30) {
                        break;
                    }
                }
            } else if (getSelectedNumber() == 2) {
                System.out.println("分かった！私から始めるよ！！");
                while (true) {
                    ComputerAction act2 = new ComputerAction(getCount());
                    act2.ComputerAction(getCount());
                    act2.judge(getName(),getCount());

                    PrayerAction act1 = new PrayerAction();
                    act1.PrayerAction(getCount());
                    act1.judge(getName(),getCount());
                    if (getCount() >= 30) {
                        break;
                    }
                }
            }
        }
    }
}

