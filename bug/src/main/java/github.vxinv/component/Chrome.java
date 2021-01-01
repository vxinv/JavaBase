package github.vxinv.component;

import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Slf4j
public class Chrome {

    private static final String TAG = "Chrome";

    WebDriver driver;

    @Value("${chrome.timeOutInSeconds}")
    long timeOutInSeconds;

    @Value("${chrome.timeOutInSeconds}")
    long sleepInMillis;

    @Value("${chrome.fileUrl}")
    String chromeUrl;

    /**
     * 显示的等待某个元素
     */


    @PostConstruct
    public void init() {
        System.setProperty("webdriver.chrome.driver", chromeUrl);
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


    public String get(String url) {
        driver.get(url);
        return driver.getPageSource();
    }

    /**
     * 显示等待要等待的对象出现
     * @param url
     * @param elementXpath
     * @return
     */
    public String get(String url,String elementXpath){
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds, sleepInMillis);
        WebElement element;
        try {
             element = wait.until(new ExpectedCondition<WebElement>() {
                @NullableDecl
                @Override
                public WebElement apply(@NullableDecl WebDriver driver) {
                    return driver.findElement(By.xpath(elementXpath));
                }
            });
        }catch (TimeoutException e){
            log.error("获取地址元素失败 {},元素{}",url,elementXpath);
            element = null;
        }
        if (element != null && element.isDisplayed()){
            return driver.getPageSource();
        }
        return null;
    }

    public WebDriver getDriver(String url,String xpath){
        return null;
    }

    /**
     * 模拟浏览器做一些动作
     */




}
