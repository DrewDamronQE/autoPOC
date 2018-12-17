package steps;

import Core.FeatureFetch;
import Core.WebDriverUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;


public class hooks {

    @Before
    public static void initialize(){
        FeatureFetch fetch = new FeatureFetch();
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        WebDriverUtil.setWebDriver(chromeDriver);
    }

    @After
    public void pushResultToJira(){
        WebDriverUtil.getWebDriver().close();
        WebDriverUtil.getWebDriver().quit();
    }
}
