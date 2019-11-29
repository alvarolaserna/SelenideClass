package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LandingPage;

public class LandingPageSteps {
    private LandingPage page = new LandingPage();

    @Given("I am in landing page")
    public void iAmInLandingPage() {
        page.navigateToLandingPage();
    }

    @Then("I check that landing page is shown correctly")
    public void iCheckThatLandingPageIsShownCorrectly() {

    }

    @When("I click on sign up")
    public void iClickOnSignUp() {
        page.clickOnLoginButton();
    }
}
