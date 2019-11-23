package stepDefinitions;

import cucumber.api.java.Before;
import utils.EnvironmentFactory;

public class Hooks {
    private EnvironmentFactory env = new EnvironmentFactory();

    @Before
    public void setEnvironment() {
        env.setEnvironment();
    }
}
