package jp.ac.uryukyu.ie.e195765;

import java.util.Scanner;

public class PrayerAction extends ThirtyGame {
    public int PrayerAction(int count) {
        while (true) {
            System.out.println("(入力待ち)");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            try {
                int number = Integer.parseInt(str);
                setSelectedNumber(number);
                if (number - count <= 3 && number > count) {
                    setCount(number);
                    return number;
                } else {
                    int AbleNumber1 = count+1;
                    int AbleNumber2 = count+2;
                    int AbleNumber3 = count+3;

                    System.out.println(AbleNumber1+","+AbleNumber2+","+AbleNumber3+"のどれかしか言えないよ！");
                }
            } catch (NumberFormatException e) {
                System.out.println("数字で答えて!!");
            }
        }
    }
    @Override
    public void judge(String name,int count){
        if(getCount()>=30){
            System.out.println("私の勝ち！！");
            waitMoment(2000);
            System.out.println("楽しかった！いつでも相手するよ！\nまた遊ぼうね！");
        }
    }
}
