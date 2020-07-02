$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Sainsburys website Register and login page",
  "description": "",
  "id": "sainsburys-website-register-and-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Register and login page",
  "description": "",
  "id": "sainsburys-website-register-and-login-page;register-and-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on register link and enters details",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user clicks on login link enters username and password and home page displays",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.userOnLoginPage()"
});
formatter.result({
  "duration": 14110058700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.userClicksOnRegisterLinkAndEntersDetails()"
});
formatter.result({
  "duration": 2684149900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.userClicksOnLoginLinkEntersUsernameAndPasswordAndHomePageDisplays()"
});
formatter.result({
  "duration": 2429552500,
  "status": "passed"
});
});