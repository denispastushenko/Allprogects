import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyConfiguration;


import static pages.CheckCart.*;
import static pages.ChooseItemFromList.clearSearchField;
import static pages.Page.getDriver;
import static utils.LanguageCheckClass.setMainGreeting;

public class MainTestSignInTest extends BaseTest {

    @Test
    public void checkThatUserCanLoginWithCorrectCredentialsTest() {
        getDriver().get(PropertyConfiguration.getInstance().getStartUrl());
        signInPage = startPage.autorisation();
        chooseItem = signInPage.logIn(PropertyConfiguration.getInstance().getEmail(),
                PropertyConfiguration.getInstance().getPassword());
        Assert.assertEquals("Hello, Denys",setMainGreeting(chooseItem.getLogInAssert().getText())
                + "Denys"," Is success login");
    }

    @Test
    public void checkThatUserCanNotLoginWithInvalidCredentialsTest() {
        getDriver().get(PropertyConfiguration.getInstance().getStartUrl());
        signInPage = startPage.autorisation();
        chooseItem = signInPage.logIn(PropertyConfiguration.getInstance().getIncorrlogin(),
                PropertyConfiguration.getInstance().getIncorrpassword());
        Assert.assertEquals(isElementPresent(getDriver(),
                By.xpath("//span[@class='a-list-item']")), true," Is not success login");
    }

    @Test(dependsOnMethods = "checkThatUserCanLoginWithCorrectCredentialsTest")
    public void userCanBySomeStaffTest()  {
        getDriver().get(PropertyConfiguration.getInstance().getStartUrl());
        signInPage = startPage.autorisation();
        chooseItem = signInPage.logIn(PropertyConfiguration.getInstance().getEmail(),
                PropertyConfiguration.getInstance().getPassword());
        chooseItemFromList = chooseItem.chooseItemFrom("Spring framework ",chooseItem.getFindElementFIeld());
        chooseSecondItem = chooseItemFromList.addtoCartItem();
        chooseSecondItemFromList = chooseSecondItem.chooseSecondItemFrom("Cucumber bdd");
        checkCart = chooseSecondItemFromList.addtoCartAnotherItem();
        Assert.assertEquals(true, isElementPresent(getDriver(), new By.ByXPath(checkIsElementsPresent)),
                "Check is goods already in the cart");
        checkCart.getElements();
        checkCart.elementAmountCheck();
        Assert.assertEquals(chooseSecondItemFromList.getSecondAmount() - chooseItem.getAmount(), 2);
        checkCart.explanation();
    }
}
