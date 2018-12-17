package PageObjects;

import Core.PageWaitUtil;
import Core.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
    public static String PAGEURL = "https://google.com";

    public GoogleHomePage(){
        PageFactory.initElements(WebDriverUtil.getWebDriver(), this);
    }

    @FindBy(name = "q")
    private WebElement txtSearch;

    @FindBy(name = "btnK")
    private WebElement btnSearch;

    public void searchFor(String text){
        PageWaitUtil.waitForElementClickable(txtSearch);
        txtSearch.sendKeys(text);
        PageWaitUtil.waitForElementClickable(btnSearch).click();
    }
}
