package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static utils.HelpUtils.goUpMethod;
import static utils.HelpUtils.scrollMethod;
import static utils.HelpUtils.sleepMethod;

public class GroupsPage {

    public WallPostsBlock addAllPosts() {
        $(By.xpath("//a[@href ='/groups']")).click();
        $(By.className("group_row_img")).click();
        sleepMethod(3000);
        addTwentyFifePosts();
        goUpMethod();
        return page(WallPostsBlock.class);
    }

    private static void addTwentyFifePosts() {
        for (int i = 0; i < 25; i++) {
            $$(By.xpath("//i[@class ='post_share_icon _icon']")).get(i).click();
            $(By.id("like_share_send")).click();
            sleepMethod(5500);
        }
    }

    public WallPostsBlock clickProfileAndScrollDown() {
        $(By.id("l_pr")).click();
        scrollMethod(250, 250);
        return page(WallPostsBlock.class);
    }
}
