import org.testng.annotations.Test;
import pages.Page;

/**
 * Created by Billy on 7/5/2016.
 */

public class EntranceTest extends OriginTest {
    @Test
    public void entranceTest() {
        Page.getDriver().get(OriginTest.HOME_PAGE);
        signInPage = homePage.clickOnSignInButton();
        accountPage = signInPage.accountSignIn(USER_E_MAIL, PASSWORD);
        accountPage.greetingsMessageAssertEquals(USER_E_MAIL);
    }

    @Test
    public void waresTest() {
        Page.getDriver().get(OriginTest.HOME_PAGE);
        homePage.clickOnSignInButton()
                .accountSignIn(USER_E_MAIL, PASSWORD)
                .greetingsMessageAssertEquals(USER_E_MAIL)
                .moveToSearchResults(stuffName)
                .moveToStuff()
                .clickOnAddCartButton()
                .totalAmountAssertEquals();
    }
}
