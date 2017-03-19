import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTestVkTest extends BaseTest {

    @Test(priority = 1)
    public void addPostsTest() {
        groupsPage = loginPage.logIn();
        wallPostsBlock = groupsPage.addAllPosts();
        wallPostsBlock = groupsPage.clickProfileAndScrollDown();
        Assert.assertEquals(wallPostsBlock.getActionMenus().size(), 25);
    }


    @Test(dependsOnMethods = "deleteLastFiveElementsTest", priority = 3)
    public void deleteAllPostsTest() {
        groupsPage = loginPage.logIn();
        wallPostsBlock = groupsPage.clickProfileAndScrollDown();
        wallPostsBlock.deleteAllPosts();
        Assert.assertTrue(wallPostsBlock.getActionMenus().isEmpty());
    }

    @Test(priority = 2)
    public void deleteLastFiveElementsTest() {
        groupsPage = loginPage.logIn();
        wallPostsBlock = groupsPage.clickProfileAndScrollDown();
        wallPostsBlock.deleteLastFive();
        Assert.assertEquals(wallPostsBlock.getActionMenus().size(), 20);
    }


}
