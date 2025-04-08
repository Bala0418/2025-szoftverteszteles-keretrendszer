package deik.pti.pageObjects;

import deik.pti.factory.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CommunitiesPage extends CommonPage {
    public CommunitiesPage(WebDriverFactory factory) {
        super(factory);
    }

    @FindBy(className = "evnt-sorting-dropdown")
    private WebElement sortingDropdown;

    @FindBy(className = "evnt-info-cell")
    private List<WebElement> cards;

    public WebElement getCard() {
        return cards.get(0);
    }
}
