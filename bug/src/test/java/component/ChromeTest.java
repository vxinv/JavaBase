package component;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeTest {

    WebDriver driver;

    String fundInfo = "http://fundf10.eastmoney.com/ccmx_000001.html";

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Volumes/OD_MAC/App/JavaBase/bug/bin/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium/chrome/79.0.3945.36/chromedriver");
        ChromeOptions options = new ChromeOptions();
        //是否启用浏览器界面的参数
        //无界面参数
        options.addArguments("--headless");
        //禁用沙盒 就是被这个参数搞了一天
        options.addArguments("no-sandbox");
        //WebDriver driver = new ChromeDriver(options);
        driver = new ChromeDriver(options);
    }

    @Test
    public void testGetFundInfo() throws InterruptedException {
        driver.get(fundInfo);
        //"//*[@id=\"cctable\"]/div[2]/div/table"
        /*WebElement element = driver.findElement(By.xpath("//*[@id=\"cctable\"]/div[1]/div/table"));
        System.out.println(driver.getPageSource());*/
        /**
         * 第二个餐食  代表最大等待时间 秒为单位
         * 第三个代表 再次检测的间隔 毫秒为单位
         */
        WebDriverWait wait = new WebDriverWait(driver, 10, 500);
        WebElement element = wait.until(new ExpectedCondition<WebElement>() {
            @NullableDecl
            @Override
            public WebElement apply(@NullableDecl WebDriver driver) {
                return driver.findElement(By.xpath("//*[@id=\"bodydiv\"]/div[8]/div[3]/div[2]/div[3]/div"));
            }
        });
        System.out.println(element.getText());


    }
}
