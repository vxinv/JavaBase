package autoTrader;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.logging.Logger;

/**
 * 封装了 买 卖  撤单 操作
 */
public class Trader {

    static Robot robot;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


    /**
     * 卖出
     * @param StockNcode 代码
     * @param price     价格
     * @param stockNumber 数量
     */
    public static  void buy(String StockNcode,String  price, String stockNumber){
            // 按下F2  买入
            click(KeyEvent.VK_F1);
            // 输入证券代码
            input(StockNcode);
            // 输入价格
            input(price);
            // 按下向下键
            click(KeyEvent.VK_DOWN);
            // 输入数量
            input(stockNumber);
            // 按下确认键
            click(KeyEvent.VK_ENTER);
            // 按下Y 确认买入
            click(KeyEvent.VK_Y);
            click(KeyEvent.VK_Y);
        }

    public static void sell(String StockNcode,String  price, String stockNumber){
        // 按下F2  买入
        click(KeyEvent.VK_F2);
        // 输入证券代码
        input(StockNcode);
        // 输入价格
        input(price);
        // 按下向下键
        click(KeyEvent.VK_DOWN);
        // 输入数量
        input(stockNumber);
        // 按下确认键
        click(KeyEvent.VK_ENTER);
        // 按下Y 确认买入
        click(KeyEvent.VK_Y);
        click(KeyEvent.VK_Y);
    }

    public static void  cancel (String StockNcode,String  price, String stockNumber){
        // 按下F2  买入
        click(KeyEvent.VK_F3);
        // 输入证券代码
        input(StockNcode);
        // 输入价格
        input(price);
        // 按下向下键
        click(KeyEvent.VK_DOWN);
        // 输入数量
        input(stockNumber);
        // 按下确认键
        click(KeyEvent.VK_ENTER);
        // 按下Y 确认买入
        click(KeyEvent.VK_Y);
        click(KeyEvent.VK_Y);
    }


    /**
     * 按键
     */
    public static  void click(int keyEvent){
        robot.keyPress(keyEvent);
        robot.keyRelease(keyEvent);
    }

    /**
     *
     * @param value  输入的字符
     */
    public static void input (String value){
        int baseNum = 0x30;
        for (char c : value.toCharArray()) {
            // 输入价格时
            if (c == '.'){
                click(KeyEvent.VK_PERIOD);
                continue;
            }
            // 其余的 字符 变为 数字
            int i = Integer.parseInt(String.valueOf(c));
            click(baseNum+i);
        }
    }



}
