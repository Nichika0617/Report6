package jp.ac.uryukyu.ie.e195765;

import java.util.Scanner;

public class PrayerAction extends ThirtyGame {
    /**
     * プレイヤーの行動
     * @param count お互い言い合っている途中の現在の数字
     * @return プレイヤーが選択した数字
     */
    public int PrayerAction(int count) {
        while (true) {
            System.out.println("(入力待ち)");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if (count ==29){ //もし29で回ってきた場合、30しか言えないので、30以外の入力を受け付けない。
                try{
                    int number = Integer.parseInt(str);
                    if (number == 30){
                        return 30;
                    }else{
                        System.out.println("*30しか言えないよ！");
                    }
                }catch (NullPointerException e){
                    System.out.println("*数字で答えてね！");
                }

            }else{
                try {
                    int number = Integer.parseInt(str);
                    if (number - count <= 3 && number > count) { // 現在の数字<プレイヤーが発言可能な数字<=現在の数字+3
                        return number;
                    }
                    else {
                        int AbleNumber1 = count+1;//現在の数字に1、2、3を足した、プレイヤーが発言可能な数字を保存しておく
                        int AbleNumber2 = count+2;
                        int AbleNumber3 = count+3;

                        System.out.println("*"+AbleNumber1+","+AbleNumber2+","+AbleNumber3+"のどれかしか言えないよ！");//想定外の数字を入力された場合、入力可能な3つの数字を教える。
                    }
                } catch (NumberFormatException e) {
                    System.out.println("*数字で答えてね！");
                }
            }
        }
    }

    /**
     * プレイヤーが30を言ったとき、CPUが勝ちのセリフを出力するメソッド
     * @param name プレイヤー名
     */
    @Override
    public void judge(String name){ //プレイヤーのターンで終わった場合はコンピューターの勝ち。
            System.out.println("私の勝ち！！");
            waitMoment(2000);
            System.out.println("楽しかった！また遊ぼうね！\nいつでも相手するよ！");
        }
    }
