package stepDefinitions;

import cucumber.api.java.en.And;
import pages.SignUpPage;

public class SignUpSteps {
    private SignUpPage page = new SignUpPage();

    @And("I intrude my email")
    public void iIntrudeMyEmail() {
        page.setEmail();
    }
}
