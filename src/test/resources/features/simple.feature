Feature: automation practice landing page

  Background: open landing page
    Given I am in landing page

  Scenario: landing page is shown correctly
    Then I check that landing page is shown correctly
    When I click on sign up
    And I intrude my email