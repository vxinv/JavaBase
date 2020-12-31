package component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Chrome {

    WebDriver driver;

    @Value("")
    long timeOutInSeconds;


    long sleepInMillis;


    /**
     * 显示的等待某个元素
     */


    @PostConstruct
    public void init() {
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


    @PreDestroy
    public void dispose() {
        driver.quit();
    }


}
