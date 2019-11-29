package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class SignUpPage {
    // Elements
    private SelenideElement emailInput = $(byId("email_createR"));
    private SelenideElement submitEmail = $(byId("SubmitCreate"));

    // Methods
    public void setEmail() {
        emailInput.waitUntil(Condition.visible, 10000).sendKeys("asdjhdfj@yopmail.com");
        submitEmail.click();
    }
}
