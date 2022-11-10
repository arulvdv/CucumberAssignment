$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/Login.feature");
formatter.feature({
  "name": "Validate Sign Up and Email compose",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate Sign up",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "name": "User should click on Sing up link",
  "keyword": "And "
});
formatter.step({
  "name": "User enters First name \"\u003cFirst name\u003e\" and \"\u003cLast name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters Email \"\u003ce-mail\u003e\" and Username \"\u003cUsername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters Password \"\u003cpass\u003e\" and \"\u003cConfirm password\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should click on Register button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to Sign up",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First name",
        "Last name",
        "e-mail",
        "Username",
        "pass",
        "Confirm password"
      ]
    },
    {
      "cells": [
        "arul1",
        "vadivu1",
        "arulvadivu1@gmail.com",
        "arulvadivu1",
        "arul123",
        "arul123"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to navigate to demo url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginValidation.user_should_be_able_to_navigate_to_demo_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Sign up",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "name": "User should click on Sing up link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginValidation.user_should_click_on_Sing_up_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters First name \"arul1\" and \"vadivu1\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginValidation.user_enters_First_name_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email \"arulvadivu1@gmail.com\" and Username \"arulvadivu1\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginValidation.user_enters_Email_and_Username(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Password \"arul123\" and \"arul123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginValidation.user_enters_Password_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on Register button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginValidation.user_should_click_on_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to Sign up",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginValidation.user_should_be_able_to_Sign_up()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});