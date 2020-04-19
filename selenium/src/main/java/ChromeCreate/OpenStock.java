package ChromeCreate;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.Logs;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class OpenStock {


    @Test
    public void openStock(){
        //设置本地chromedriver地址
        System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");

        //创建无Chrome无头参数
        ChromeOptions chromeOptions=new ChromeOptions();

        // 创建无头的配置
        ChromeOptions noScreen = new ChromeOptions();
        String[] op = {"enable-automation"};
        chromeOptions.setExperimentalOption("excludeSwitches",op);
        noScreen.setExperimentalOption("excludeSwitches",op);
        noScreen.addArguments("--headless");
        noScreen.setHeadless(true);
        HashMap map = new HashMap<String, Integer>(1);
        map.put("profile.managed_default_content_settings.images",2);
        chromeOptions.setExperimentalOption("prefs",map);
        chromeOptions.setHeadless(true);
        //创建Drive实例
        WebDriver driver = new ChromeDriver(chromeOptions);
        String url = "http://quote.eastmoney.com/sh601318.html";
        driver.get(url); // 打开指定的网站

        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie);
        }


        /*for (int i = 0; i < 10000; i++) {
            WebElement element = driver.findElement(By.xpath("/html/body/div[13]/div[2]/div[2]/div[1]/div[2]/div[2]/table/tbody"));
            System.out.println(element.getText());
            WebElement element2 = driver.findElement(By.xpath("/html/body/div[13]/div[2]/div[2]/div[1]/div[4]/table/tbody"));
            System.out.println(element2.getText());
            WebElement element3 = driver.findElement(By.xpath("/html/body/div[13]/div[2]/div[2]/div[1]/div[6]/div/table/tbody"));
            System.out.println(element3.getText());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

    }


}
