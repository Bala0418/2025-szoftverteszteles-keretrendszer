package deik.pti.pageObjects;

import deik.pti.factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends CommonPage {
    public HomePage(WebDriverFactory factory) {
        super(factory);
    }

    private static final String HOME_PAGE_URL = "https://wearecommunity.io/";

    @FindBy(className = "communities-icon")
    private WebElement communitiesButton;

    @FindBy(className = "events-icon")
    private WebElement eventsButton;

    public void clickOnCommunitiesButton() {
        communitiesButton.click();
    }

    public void clickOnEventsButton() {
        eventsButton.click();
    }
}
