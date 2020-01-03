package jp.ac.uryukyu.ie.e195765;

import java.util.Random;

public class ComputerAction extends ThirtyGame{
    public ComputerAction(int count){
        super.setCount(count);
    }
    public int ComputerAction(int count){
        if(count >= 30){
            //何もしない
            return 30;
        }else{
            int[] NumberList = {count+1,count+2,count+3};
            if(count+1 == 29 || count+2 == 29 || count+3 == 29){
                System.out.println("お！！これは・・！");
                waitMoment(2000);
                System.out.println(29);
                return 29;
            }
            Random random = new Random();
            int ListLength = NumberList.length;
            int SayNumber = NumberList[random.nextInt(ListLength)];
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


