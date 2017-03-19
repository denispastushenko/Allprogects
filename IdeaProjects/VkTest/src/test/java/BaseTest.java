import listeners.TestLogListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.GroupsPage;
import pages.LogInPage;
import pages.WallPostsBlock;
import utils.PropertyConfiguration;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static utils.DriverUtils.createDriver;

@Listeners(TestLogListener.class)
public class BaseTest {

    protected LogInPage loginPage;
    protected GroupsPage groupsPage;
    protected WallPostsBlock wallPostsBlock;


    @BeforeMethod
    public LogInPage logIn() {
        setWebDriver(createDriver());
        baseUrl = PropertyConfiguration.getInstance().getStartUrl();
        loginPage = open("", LogInPage.class);
        getWebDriver().manage().window().maximize();
        return loginPage;
    }

    @AfterMethod
    public void tearDown() throws Exception {
        if (getWebDriver() != null) {
            getWebDriver().quit();
        }
    }


}
