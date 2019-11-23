package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import utils.Helpers;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LandingPage {
    private Helpers helpers = new Helpers();

    // Elements
    private SelenideElement logo = $(byCssSelector("#header_logo img"));
    private SelenideElement searchInput = $(byCssSelector("#searchbox input.search_query"));


    // Methods
    public void navigateToLandingPage() {
        open(helpers.getLandingPageUrl());
    }

    public void checkIAmInLandingPage() {
        logo.waitUntil(Condition.visible, 10000);
        searchInput.waitUntil(Condition.visible, 2000);
    }

}
