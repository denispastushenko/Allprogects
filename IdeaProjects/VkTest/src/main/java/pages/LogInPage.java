package pages;

import org.openqa.selenium.By;
import utils.PropertyConfiguration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LogInPage {
    public GroupsPage logIn() {
        $(By.id("email")).setValue(PropertyConfiguration.getInstance().getEmail());
        $(By.id("pass")).setValue(PropertyConfiguration.getInstance().getPassword());
        $(By.id("login_button")).click();
        return page(GroupsPage.class);
    }

}




