package jp.ac.uryukyu.ie.e195765;

public class ThirtyGame {
    public String name;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;

    }

    private int count = 0;
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
    public void ThirtyGame(String name,int AnsOrder){
        if (AnsOrder== 1) {
            System.out.println("分かった！" + name + "さんが先攻だね！1~3の数字を言って始めてね！");
            while (true) {
                PrayerAction act1 = new PrayerAction();
                setCount(act1.PrayerAction(getCount()));
                if (getCount() >= 30) {
                    act1.judge(getName());
                     break;
                }
                ComputerAction act2 = new ComputerAction(getCount());
                setCount(act2.ComputerAction(getCount()));
                if (getCount() >= 30){
                    act2.judge(name);
                    break;
            }
            }
        } else if (AnsOrder == 2) {
            System.out.println("分かった！私から始めるよ！！");
            while (true) {
                ComputerAction act2 = new ComputerAction(getCount());
                setCount(act2.ComputerAction(getCount()));
                if (getCount() >= 30) {
                    act2.judge(getName());
                    break;
                }
                PrayerAction act1 = new PrayerAction();
                setCount(act1.PrayerAction(getCount()));
                if (getCount() >= 30) {
                    act1.judge(getName());
                    break;
                }
            }

        }
    }
    public void judge(String name){
        if(count >= 30){
            System.out.println("終了！！");
        }

        }
    }


