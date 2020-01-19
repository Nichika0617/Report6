package jp.ac.uryukyu.ie.e195765;

import java.util.Random;

public class ComputerAction extends ThirtyGame{
    public ComputerAction(int count){
        super.setCount(count);
    }

    /**
     * ノーマルモードのCPUの行動
     * @param count お互い言い合っている途中の現在の数字
     * @return コンピューターが返答した数字
     */
    public int ComputerAction(int count){
        if(count >= 30){
            //何もしない
            return 30;
        }else{
            int[] NumberList = {count+1,count+2,count+3}; //発現可能な3つの数字を配列に入れる
            if(count+1 == 29 || count+2 == 29 || count+3 == 29){//もし発現可能な数字の中に29が合ったら29を返す。(勝ちに行く)
                System.out.println("お！！これは・・！");
                waitMoment(2000);
                System.out.println(29);
                return 29;
            }if(count+1 == 30 ){//もし次が30だった場合(30を言って負ける。それ以上に進まない)
                System.out.println("んーーーー・・・");
                waitMoment(2000);
                System.out.println(30);
                return 30;
            }
            Random random = new Random();
            int ListLength = NumberList.length;
            int SayNumber = NumberList[random.nextInt(ListLength)]; //0以上3未満の0,1,2の中からランダムで返し、その番号に対応した配列の値を返す。
            String [] wordList = {"ドキドキ・・","わくわく・・","えっと・・・"};
            System.out.println(wordList[random.nextInt(wordList.length)]);
            waitMoment(2000);
            System.out.println(SayNumber);
            return SayNumber;
        }
    }

    /**
     * 負けたときに負けのセリフを出力するメソッド
     * @param name プレイヤー名
     */
    @Override
    public void judge(String name){ //コンピューターのターンで終わった場合、プレイヤーの勝ち。
        System.out.println("負けた！！");
            waitMoment(2000);
            System.out.println(name+"さん、強いね！！\nありがとう！また遊ぼうね！");
    }
}


