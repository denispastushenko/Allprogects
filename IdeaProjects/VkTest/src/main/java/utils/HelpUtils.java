package utils;

import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getAndCheckWebDriver;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class HelpUtils {

    private static final int timeToScroll = 2000;

    public static void sleepMethod(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void goUpMethod() {
        $("#stl_bg").click();
    }

    public static void scrollMethod(int scrollStep, int increment) {
        int SCROLL = scrollStep;
        long curTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - curTime < timeToScroll) {
            ((JavascriptExecutor) getAndCheckWebDriver())
                    .executeScript(String
                            .format("scrollBy(0, %d)", SCROLL += increment));
        }
    }

    public static void refreshPage(){
        getWebDriver().navigate().refresh();
    }
}
