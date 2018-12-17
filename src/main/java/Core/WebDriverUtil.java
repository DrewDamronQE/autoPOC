package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class WebDriverUtil {

    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();

    private WebDriverUtil(){
        String test = "";
    }

    public static WebDriver createWebDriver(){
        return getWebDriver();
    }

    public static WebDriver getWebDriver(){
        return drivers.get();
    }

    public static void setWebDriver(WebDriver driver) {
        drivers.set(driver);
    }
}
