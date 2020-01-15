package jp.ac.uryukyu.ie.e195765;

import java.util.Random;


public class HardMode extends ThirtyGame{
    public HardMode(int count) {
        super.setCount(count);
    }

    /**
     * コンピューター行動
     * @param count お互い言い合っている途中の現在の数字
     * @return コンピューターが返答した数字
     */
    public int HardMode(int count){
        if(count >= 30){
            //何もしない
            return 30;
        }else {
            int[] NumberList = {count + 1, count + 2, count + 3};
            int ReturnAbleNumber1 = NumberList[0];
            int ReturnAbleNumber2 = NumberList[1];
            int ReturnAbleNumber3 = NumberList[2];
            if(ReturnAbleNumber1 % 4 == 1){
                System.out.println(ReturnAbleNumber1);
                return ReturnAbleNumber1;
                }else if(ReturnAbleNumber2 % 4 == 1){
                System.out.println(ReturnAbleNumber2);
                return ReturnAbleNumber2;
                }else if (ReturnAbleNumber3 % 4 == 1){
                System.out.println(ReturnAbleNumber3);
                return ReturnAbleNumber3;
            }else {
                Random random = new Random();
                String [] wordList = {"ふむふむ・・","なるほど・・","えっと・・・"};
                System.out.println(wordList[random.nextInt(wordList.length)]);
                System.out.println(ReturnAbleNumber1);
                return ReturnAbleNumber1;
            }

            }
    }

    /**
     * 負けたときに負けのセリフを出力するメソッド
     * @param name プレイヤー名
     */
    @Override
    public void judge(String name){ // コンピューターのターンで終わった場合、プレイヤーの勝ち
        System.out.println("負けた・・・");
        waitMoment(2000);
        System.out.println("本気でやっても負けるなんて");
        System.out.println(name+"さん、強いね！！\nありがとう！また遊ぼうね！");
    }
}


