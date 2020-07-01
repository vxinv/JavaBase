package ChromeCreate;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;

public class OpenStock {


    @Test
    public void openStock(){

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
        ChromeOptions chromeOptions=new ChromeOptions();
        HashMap map = new HashMap<String, Integer>(1);
        //map.put("profile.managed_default_content_settings.images",2);
        chromeOptions.setExperimentalOption("prefs",map);
        chromeOptions.setHeadless(false);
        //创建Drive实例
        WebDriver driver = new ChromeDriver(chromeOptions);
        String url = "https://www.zhipin.com/web/geek/recommend";
        driver.get(url); // 打开指定的网站




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
