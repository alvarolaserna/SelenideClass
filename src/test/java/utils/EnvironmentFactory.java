package utils;


import com.codeborne.selenide.Configuration;

import static java.lang.System.getProperty;

public class EnvironmentFactory {
    public void setEnvironment() {
        // Valid browsers: chrome, safari, ie, edge, opera, firefox, phantomjs
        if (getProperty("BROWSER") != null) {
            Configuration.browser = getProperty("BROWSER").toLowerCase();
            return;
        }
        Configuration.browser = "chrome";
    }
}
