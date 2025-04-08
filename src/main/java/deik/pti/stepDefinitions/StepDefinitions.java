package deik.pti.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import deik.pti.factory.WebDriverFactory;
import deik.pti.pageObjects.HomePage;
import org.springframework.beans.factory.annotation.Autowired;

public class StepDefinitions {

    @Autowired
    private WebDriverFactory factory;

    @Autowired
    private HomePage homePage;

    @Given("The WeAreCommunity page is opened")
    public void theWeAreCommunityPageIsOpened() {
        factory.getWebDriver().get("http://www.wearecommunity.io");
    }

    @When("The Communities button is clicked")
    public void theCommunitiesButtonIsClicked() {
        homePage.clickOnCommunitiesButton();
    }

    @When("The {string} is typed in to the Search bar")
    public void theSearchBarIsTypedInToTheSearchBar(String value) {

    }

}
