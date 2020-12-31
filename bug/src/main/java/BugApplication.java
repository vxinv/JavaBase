import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BugApplication {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Volumes/OD_MAC/App/JavaBase/bug/bin/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium/chrome/79.0.3945.36/chromedriver");
        ChromeOptions options = new ChromeOptions();
        //是否启用浏览器界面的参数
        //无界面参数
        options.addArguments("--headless");
        //禁用沙盒 就是被这个参数搞了一天
        options.addArguments("no-sandbox");
        //WebDriver driver = new ChromeDriver(options);
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://fund.10jqka.com.cn/datacenter/sy/kfs/gpx/");

        Thread.sleep(8000);
        //将页面滚动条拖到底部
        for (int i = 0; i < 40; i++) {
            int next = 30 * i;
            String script = "window.scrollTo(100," + next + ");";
            ((JavascriptExecutor) driver).executeScript(script);
            Thread.sleep(300);
        }
        System.out.println(driver.getPageSource());


    }
}
