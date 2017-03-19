package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

import static utils.WaitUtils.customDelay;

/**
 * Created by Billy on 7/10/2016.
 */
public class SearchResultPage extends  Page {
    public SearchResultPage(WebDriver webDriver) {super(webDriver);}

    @FindBy(xpath = "//a[@href='/en/pdp/maximum-metric-double-ratcheting-combo-12-pc-0581259p.html#srp']")
    private WebElement selectedStuff;

    public SelectedStuffPage moveToStuff() {
         WaitUtils.waitForClickableElement(selectedStuff).click();
        return new SelectedStuffPage(Page.getDriver());
    }
}
