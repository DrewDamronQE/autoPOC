package steps;

import Core.WebDriverUtil;
import cucumber.api.java.en.Given;

public class basesteps {

    @Given("^A user have navigated to Google$")
    public void a_user_have_navigated_to_Google() throws Throwable {
        WebDriverUtil.createWebDriver();
        WebDriverUtil.getWebDriver().navigate().to("https://google.com");
    }
}
