package pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;
import static utils.HelpUtils.*;

public class WallPostsBlock {

    public WallPostsBlock deleteAllPosts() {
        goUpMethod();
        for (int i = 0; i < getActionMenus().size(); i++) {
            deleteMethod(i);
        }
        refreshPage();
        return this;
    }

    public WallPostsBlock deleteLastFive() {
        goUpMethod();
        for (int i = getActionMenus().size() - 5; i < getActionMenus().size(); i++) {
            deleteMethod(i);
        }
        refreshPage();
        scrollMethod(250, 250);
        return this;
    }

    private void deleteMethod(int i) {
        getActionMenus().get(i).hover();
        getDeletePostButton().get(i).click();
        sleepMethod(500);
    }

    public ElementsCollection getActionMenus() {
        return $$(By.xpath("//div[@id='page_wall_posts']//div[starts-with(@onclick,'uiActionsMenu.keyToggle')]"));
    }

    private ElementsCollection getDeletePostButton() {
        return $$(By.xpath("//a[starts-with(@onclick,'wall.deletePost')]"));
    }
}

