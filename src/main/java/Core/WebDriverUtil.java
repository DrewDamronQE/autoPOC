package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class WebDriverUtil {

    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();

    private WebDriverUtil(){
        String test = "";
    }

    public static WebDriver createWebDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        drivers.set(chromeDriver);
        return getWebDriver();
    }

    public static WebDriver getWebDriver(){
        return drivers.get();
    }
}
