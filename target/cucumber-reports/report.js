$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/resources/Features/search.feature");
formatter.feature({
  "name": "This feature file contains search verification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should see This field is required message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.step({
  "name": "User is on Google page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User search for \"Ducks\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User gets a proper result for required result",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});