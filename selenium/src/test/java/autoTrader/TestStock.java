package autoTrader;



public class TestStock {
    //证券代码	证券名称	股票余额	可用余额	成本价	市价	盈亏	盈亏比(%)	市值	交易市场	持股天数
    //000078	海王生物	400	400	7.323	7.170	-69.990	-2.09	2868.000	深圳Ａ股	1
    //002239	奥特佳	500	500	2.350	2.620	127.640	11.49	1310.000	深圳Ａ股	2

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try {
//            runtime.exec("cmd /c start E:\\同花顺\\xiadan.exe");
//            Thread.sleep(3000);
            Thread.sleep(4000);
            Trader.buy("000078", "1.11", "1000");

        } catch ( Exception e) {
            e.printStackTrace();
        }
    }
}
