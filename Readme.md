# Java project for Desktop Web Automation

- Recommended IDE: [Intellij IDEA Community Edition](https://www.jetbrains.com/idea/download/)  
- Install Maven
- Install Java JDK
- Install GIT

## Clone the project

- Copy the link that is indicated under `clone or download` button, you can choose the https one.
- go to your intellij and choose `File - New - Project from Version Control - Git`
- Put the link and follow the instructions


## Running this project through terminal

- Navigate to project root folder `./SelenideClass`
- run the following command:
<pre>
    mvn clean test
</pre>

In order to run specific test cases from your feature files:

1- First put a tag in your desired scenario:
<pre>
Feature: automation practice landing page

  Background: open landing page
    Given I am in landing page

  Scenario: landing page is shown correctly
    Then I check that landing page is shown correctly
    
  @TestTag  
  Scenario: landing page is shown correctly
    Then I check that landing page is shown correctly
</pre>

2- Go to `src/java/testRunners/TestRunner.java` and put, in cucumber options the tag:

<pre>
...
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"pretty", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", "html:target" +
                "/cucumber-reports/report.html"},
        glue = "stepDefinitions",
        tag = {"@TestTag"}
)
...
</pre>

