package github.vxinv.component;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class ChromeTest {

    @Resource
    Chrome chrome;

    WebDriver driver;

    String fundInfo = "http://fundf10.eastmoney.com/ccmx_000001.html";

   /* @Before
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
    }*/

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
        System.out.println(chrome);
    }

    @Test
    public void testChrome() {
        System.out.println(chrome.get(fundInfo));
    }

    /**
     * 测试一个不存在的对象 模拟超时
     */
    @Test
    public void testGetNotExit(){
        String s = chrome.get(fundInfo, "//*[@id=\"bodydiv\"]/div[8]/div[3]/div[2]/div[3]/div");
        //System.out.println(s);
        Document doc = Jsoup.parse(s);
        // 获取一个单独的表格
        Element cctable = doc.getElementById("cctable");
        Elements tables = cctable.children();
        // 去掉最后一个
        tables.remove(tables.last());
        // 表格
        for (Element table : tables) {
            System.out.println("时间" + table.getElementsByTag("font").get(0).text());
            // 获取表格所有的列
            Elements trs = table.getElementsByTag("tr");
            for (int i = 1; i < trs.size(); i++) {
                Element tr = trs.get(i);
                Elements tds = tr.getElementsByTag("td");
                for (Element td : tds) {
                    System.out.println(td.text());
                }
            }
        }
    }

    /**
     * http://fundf10.eastmoney.com/jdzf_000001.html
     * 获取基金的基本信息
     */
    @Test
    public void testGetBaseInfo(){
        // 成立日期

        String baseinfo = "http://fundf10.eastmoney.com/jdzf_000001.html";
//        jdzftable
        String s = chrome.get(baseinfo,"//*[@id=\"jdzftable\"]");
        Document jdzftable = Jsoup.parse(s);
        Element ctable = jdzftable.getElementById("jdzftable");
        Elements uls = ctable.getElementsByTag("ul");
        for (int i = 1; i < uls.size(); i++) {
            Element ul = uls.get(i);
            Elements lis = ul.getElementsByTag("li");
            for (Element li : lis) {
                System.out.println(li.text());
            }
        }
    }
}
