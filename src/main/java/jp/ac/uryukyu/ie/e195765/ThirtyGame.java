package jp.ac.uryukyu.ie.e195765;

public class ThirtyGame {
    public String name;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;

    }

    private int count=0;
    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count = count;
    }

    private int SelectedNumber;//先攻高校を決める時に使用する
    public int getSelectedNumber(){
        return SelectedNumber;
    }
    public void setSelectedNumber(int SelectNumber){
        this.SelectedNumber = SelectNumber;
    }

    /**
     * コメントの遅延を行う
     * @param time 送らせたい時間 1000 = 1秒
     */
    public void waitMoment(int time) {
        try {
            Thread.sleep(time);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void judge(String name,int count){
        if(count >= 30){
            System.out.println("終わり！！");
        }

        }
    }


