package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

import static utils.WaitUtils.customDelay;

/**
 * Created by Billy on 7/10/2016.
 */
public class SelectedStuffPage extends Page {
    public SelectedStuffPage(WebDriver webDriver) {super(webDriver);}

    @FindBy(xpath = "//span[@class='add-to-cart__button-text global-form-button__inner']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//a[@href='/en/shoppingcart.html']")
    private WebElement continueToCartButton;

    public CartPage clickOnAddCartButton() {
        WaitUtils.waitForClickableElement(addToCartButton).click();
        WaitUtils.waitForClickableElement(continueToCartButton).click();
        return new CartPage(Page.getDriver());
    }
}
