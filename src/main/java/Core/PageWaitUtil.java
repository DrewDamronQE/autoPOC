package Core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class PageWaitUtil {

    public static WebElement waitForElementClickable(WebElement element){
        try{
            WebDriverWait wait = new WebDriverWait(WebDriverUtil.getWebDriver(), 15);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return element;
        }
        catch (Exception ex){
            return null;
        }
    }
}
