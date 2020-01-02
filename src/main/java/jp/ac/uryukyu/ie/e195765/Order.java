package jp.ac.uryukyu.ie.e195765;

import java.util.Scanner;

public class Order extends ThirtyGame {
    public void DecideOrder() {
        System.out.println("じゃあゲームを始めるよ！先攻、後攻どっちにする？1か2で答えてね！\n1→先攻\n2→後攻");
        int number = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            try {
                number = Integer.parseInt(str);
                if (number <= 2) {
                    break;
                } else {
                    System.out.println("1か2で答えてね！");
                }
            } catch (NumberFormatException e) {
                System.out.println("1か2で答えてね！");
            }
            if (number == 1) {
                new PrayerAction(getName());
            } else if (number == 2) {
                new ComputerAction();
            }


        }

    }}

