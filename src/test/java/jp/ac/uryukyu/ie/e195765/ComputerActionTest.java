package jp.ac.uryukyu.ie.e195765;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerActionTest {
    /**
     * 返答可能な3つの数字の中に30も含まれる場合、30と言って自滅せずに29を返しているか確認するテスト。
     */
    @Test
    void computerActionReturn29() {
        ComputerAction cpu26 = new ComputerAction(26);
        assertEquals(29,cpu26.ComputerAction(26));//26で回ってきた時
        ComputerAction cpu27 = new ComputerAction(27);
        assertEquals(29,cpu27.ComputerAction(27));//27で回って来た時
        ComputerAction cpu28 = new ComputerAction(28);
        assertEquals(29,cpu28.ComputerAction(28));//28で回って来た時
        //乱数で奇跡的に29を返答している可能性もあるので、複数回実行する。
        assertEquals(29,cpu26.ComputerAction(26));
        assertEquals(29,cpu27.ComputerAction(27));
        assertEquals(29,cpu28.ComputerAction(28));

            }

    /**
     * 返答可能な最小の数字が30の場合、31や32は返さずに30を返して負けているかを確認するテスト
     */
    @Test
    void computerActionReturn30(){
        ComputerAction cpu29 = new ComputerAction(29);
        assertEquals(30,cpu29.ComputerAction(30)); //29を渡された時に31や32ではなく、しっかりと30を返しているか確認するテスト
        //乱数で奇跡的に30を返している可能性もあるので、複数回実行する。
        assertEquals(30,cpu29.ComputerAction(30));
        assertEquals(30,cpu29.ComputerAction(30));
        assertEquals(30,cpu29.ComputerAction(30));
    }

    }
