
import annotation.Proxy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utils.WebDriverFactory;

import java.lang.reflect.Method;

/**
 * Created by Billy on 7/5/2016.
 */
public class OriginTest {
    public static final String USER_E_MAIL = "thesunriseempire@ukr.net";
    public static final String PASSWORD = "Valentyn'sTask4";
    protected static String stuffName = "wrenches";

    public static final String HOME_PAGE = "http://www.canadiantire.ca/en.html";
    protected HomePage homePage;
    protected SignInPage signInPage;
    protected AccountPage accountPage;

    @BeforeMethod
    public void setUp(Method method) {
        System.setProperty("webdriver.chrome.driver", "D:/WorkSpace/chromedriver_win32/chromedriver.exe");
        homePage = new HomePage(WebDriverFactory.createDriver(method.isAnnotationPresent(Proxy.class)));
        Page.getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void quitFromThePage() {
        if (Page.getDriver() != null)
            Page.getDriver().quit();
    }
}
