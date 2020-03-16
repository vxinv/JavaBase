package autoTrader;


import com.sun.jna.platform.win32.WinDef;
import mmarquee.automation.UIAutomation;
import mmarquee.automation.controls.*;

import javax.sound.midi.SoundbankResource;

public class UiTest {
    public static void main(String[] args) {

        UIAutomation automation = UIAutomation.getInstance();
        // Build the application details up, ready for launching
        // Build the application details up, ready for launching
        Application application = new Application(new ElementBuilder()
                                .automation(automation)
                                .applicationPath("E:\\同花顺\\xiadan.exe"));
        try {
            application.launchOrAttach();
            Window window = automation.getDesktopWindow("网上股票交易系统5.0");
            window.focus();
            System.out.println(window.getTitleBar().getName());
            AutomationBase controlByName = window.getControlByName("买入[F1]");


            System.out.println(controlByName.getClassName());
            System.out.println(controlByName.getProcessId());
            System.out.println(window);
            System.out.println(window.getTitleBar());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
