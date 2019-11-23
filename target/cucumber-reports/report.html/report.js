$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/simple.feature");
formatter.feature({
  "name": "automation practice landing page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "open landing page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageSteps.iAmInLandingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "landing page is shown correctly",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I check that landing page is shown correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingPageSteps.iCheckThatLandingPageIsShownCorrectly()"
});
formatter.result({
  "status": "passed"
});
});