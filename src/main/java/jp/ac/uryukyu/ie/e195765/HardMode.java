package jp.ac.uryukyu.ie.e195765;

import java.util.Random;
import java.util.function.ToDoubleBiFunction;

public class HardMode extends ThirtyGame{
    public HardMode(int count){
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
        }else{
            int[] NumberList = {count+1,count+2,count+3};

            for(int i = 0; i<NumberList.length; i++){
            }
            if(count+1 == 29 || count+2 == 29 || count+3 == 29){//もし発現可能な数字の中に29が合ったら29を返す。(勝ちに行く)
                System.out.println("お！！これは・・！");
                waitMoment(2000);
                System.out.println(29);
                return 29;
            }if(count+1 == 30 ){//もし次が30だった場合(30を言って負ける。それ以上に進まない)
                waitMoment(2000);
                System.out.println(30);
                return 30;
            }
            Random random = new Random();
            int ListLength = NumberList.length;
            int SayNumber = NumberList[random.nextInt(ListLength)]; //0以上3未満の0,1,2の中からランダムで返し、その番号に対応した配列の値を返す。
            waitMoment(2000);
            System.out.println(SayNumber);
            return SayNumber;
        }
    }

    @Override
    public void judge(String name){
        System.out.println("負けた！！");
        waitMoment(2000);
        System.out.println(name+"さん、強いね！！\nありがとう！また遊ぼうね！");
    }
}


