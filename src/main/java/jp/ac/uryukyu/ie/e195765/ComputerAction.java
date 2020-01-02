package jp.ac.uryukyu.ie.e195765;

import java.util.Random;

public class ComputerAction extends ThirtyGame{
    public ComputerAction(int count){
        super.setCount(count);
    }
    public int ComputerAction(int count){
        int[] NumberList = {count+1,count+2,count+3};
        Random random = new Random();
        int ListLength = NumberList.length;
        int SayNumber = NumberList[random.nextInt(ListLength)];
        waitMoment(2000);
        System.out.println(SayNumber);
        setCount(SayNumber);
        return SayNumber;
    }

    @Override
    public void judge(String name,int count){
        if(count >= 30){
        System.out.println("負けた！！");
            waitMoment(2000);
            System.out.println(name+"さん、強いね！！\nありがとう！また遊ぼうね！");
        }
    }
}


