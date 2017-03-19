package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.testng.Assert.assertEquals;
import static utils.WaitUtils.customDelay;

/**
 * Created by Billy on 7/5/2016.
 */
public class AccountPage extends Page {
    public AccountPage(WebDriver webDriver) {super(webDriver);}

    @FindBy(xpath = "//div[@class='dashboard-welcome__welcome-msg']")
    private WebElement greetingsMessage;

    @FindBy(xpath = "//input[@id='global-search__input']")
    private WebElement stuffSearchField;

    @FindBy(xpath = "//input[@class='global-search__submit']")
    private WebElement searchButton;

    public AccountPage greetingsMessageAssertEquals(String userEmail) {
        String correctMessage = String.format("Welcome, %s", userEmail);
        assertEquals(customDelay(visibilityOf(greetingsMessage)).getText(), correctMessage);
        return this;
    }

    public SearchResultPage moveToSearchResults(String string){
        WaitUtils.customDelay(visibilityOf(stuffSearchField)).sendKeys(string);
        WaitUtils.waitForClickableElement(searchButton).click();
        return new SearchResultPage(Page.getDriver());
    }


}
