package jp.ac.uryukyu.ie.e195765;

public class ThirtyGame {
    private String name;

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
     * ゲームを進行するメソッド
     * @param name プレイヤーの名前
     * @param AnsOrder プレイヤーが先攻か後攻かの質問に答えた数字。 1(先攻)か2(後攻)
     * @param AnsMode プレイヤーが難易度選択の時に答えた数字 1(ノーマルモード)か2(ハードモード)
     */
    public void ThirtyGame(String name,int AnsOrder,int AnsMode){
        if (AnsOrder== 1) {
            PlayerFirst(name,AnsMode);
        }else if (AnsOrder == 2){
            CPUFirst(name,AnsMode);
        }
    }

    /**
     * プレイヤーが後攻(CPUが先攻)の時のゲームを進行するメソッド
     * @param name プレイヤー名
     * @param AnsMode プレイヤーが難易度選択の時に答えた数字 1(ノーマルモード)か2(ハードモード)
     */
    public void CPUFirst(String name ,int AnsMode){ //プレイヤーが後攻の場合
        System.out.println("やった！！先攻だ！！");
        waitMoment(1000);
        System.out.println("私から始めるよ！！");
        if(AnsMode == 1){ //ノーマルモード
            while (true) {
                ComputerAction act2 = new ComputerAction(getCount());
                setCount(act2.ComputerAction(getCount()));
                if (getCount() >= 30) {
                    act2.judge(name);
                    break;
                }
                PrayerAction act1 = new PrayerAction();
                setCount(act1.PrayerAction(getCount()));
                if (getCount() >= 30) {
                    act1.judge(name);
                    break;
                }
            }

    }else if (AnsMode == 2) {  //ハードモード
            while (true) {
                HardMode act2 = new HardMode(getCount());
                setCount(act2.HardMode(getCount()));
                if (getCount() >= 30) {
                    act2.judge(name);
                    break;
                }
                PrayerAction act1 = new PrayerAction();
                setCount(act1.PrayerAction(getCount()));
                if (getCount() >= 30) {
                    act1.judge(name);
                    break;
                }
            }

        }
}

    /**
     * プレイヤーが先攻(CPUが後攻)の時のゲームを進行するメソッド
     * @param name プレイヤー名
     * @param AnsMode プレイヤーが難易度選択の時に答えた数字 1(ノーマルモード)か2(ハードモード)
     */
    public void PlayerFirst(String name ,int AnsMode){ //プレイヤーが先攻の場合
        System.out.println("後攻か・・頑張ろ！！");
        waitMoment(1000);
        System.out.println( name + "さんが先攻だね！1~3の数字を言って始めてね！");
        if(AnsMode == 1){//ノーマルモード
        while (true) {
        PrayerAction act1 = new PrayerAction();
        setCount(act1.PrayerAction(getCount()));
        if (getCount() >= 30) {
            act1.judge(name);
                break;
        }
        ComputerAction act2 = new ComputerAction(getCount());
        setCount(act2.ComputerAction(getCount()));
        if (getCount() >= 30) {
            act2.judge(name);
            break;
        }
}
        }else if (AnsMode == 2){//ハードモード
            while (true) {
                PrayerAction act1 = new PrayerAction();
                setCount(act1.PrayerAction(getCount()));
                if (getCount() >= 30) {
                    act1.judge(name);
                    break;
                }
                HardMode act2 = new HardMode(getCount());
                setCount(act2.HardMode(getCount()));
                if (getCount() >= 30) {
                    act2.judge(name);
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


