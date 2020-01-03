package jp.ac.uryukyu.ie.e195765;

public class ThirtyGame {
    public String name;

    /**
     * プレイヤーの名前を受け取るためのメソッド
     * @return String name プライヤーの名前
     */
    public String getName(){
        return name;
    }

    /**
     * プレイヤーの名前を設定するためのメソッド
     * @param name プレイヤー名
     */
    public void setName(String name) {
        this.name = name;

    }

    private int count = 0;

    /**
     * カウントゲーム中の現在の数を受け取るためのメソッド
     * @return int count 現在の数字
     */
    public int getCount(){
        return count;
    }

    /**
     * CPUやプレイヤーが言った数字を設定するためのメソッド
     * @param count
     */
    public void setCount(int count){
        this.count = count;
    }

    private int SelectedNumber;//先攻高校を決める時に使用する

    /**
     * 先攻か後攻かのプレイヤーの入力を受け取るためのメソッド
     * @return int SelectedNumber 1(先攻)か2(後攻)のどちらか
     */
    public int getSelectedNumber(){
        return SelectedNumber;
    }

    /**
     * 先攻か後攻かのプレイヤーの入力を保存するためのメソッド
     * @param SelectNumber 1か2を保存する
     */
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

    /**
     * ゲームを流すメソッド
     * @param name プレイヤー名
     * @param AnsOrder プレイヤーが選択した先攻か後攻かを決める数字
     */
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

    /**
     * ゲーム終了を判断するメソッド
     * @param name プレイヤー名
     */
    public void judge(String name){
        if(count >= 30){
            System.out.println("終了！！");
        }

        }
    }


