package steps;

import PageObjects.GoogleHomePage;
import cucumber.api.java.en.When;

public class GooglePageSteps {

    @When("^\"([^\"]*)\" is searched$")
    public void is_searched(String searchText) {
        //GoogleHomePage google = PageFactory.initElements(WebDriverUtil.getWebDriver(), GoogleHomePage.class);
        GoogleHomePage google = new GoogleHomePage();
        google.searchFor(searchText);
    }
}
