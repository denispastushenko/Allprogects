package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
    public static WebDriver createDriver() {
        return new ChromeDriver();
    }
}

