package steps;

import PageObjects.GoogleHomePage;
import cucumber.api.java.en.When;

public class GooglePageSteps {

    //GoogleHomePage googleHomePage = new GoogleHomePage();
    @When("^\"([^\"]*)\" is searched$")
    public void is_searched(String searchText) {
        //googleHomePage.searchFor(searchText);
    }
}
