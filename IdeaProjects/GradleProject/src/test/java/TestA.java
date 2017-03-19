import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestA {
    private static  WebDriver webdriver;
    @BeforeClass
    public static   void  setUP(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denys\\Desktop\\chromedriver_win32\\chromedriver.exe");
         webdriver = new ChromeDriver();
         webdriver.manage().window().maximize();

    }
    @Test
    public void name() throws Exception {
        webdriver.get("https://mail.ru/");
        Thread.sleep(2000);
        Assert.assertEquals("https://mail.ru/",webdriver.getCurrentUrl());

    }
    @AfterClass
    public  static  void tearDown(){
        webdriver.quit();
    }
}
