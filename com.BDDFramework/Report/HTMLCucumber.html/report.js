$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Ronak Kumar Singh/eclipse-workspace/com.BDDFramework/src/test/java/FeatureFiles/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check the Login Functionality with all sets of data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "launch login page",
  "keyword": "Given "
});
formatter.step({
  "name": "enters the \"\u003cusername\u003e\" and enters \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "click on the login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "adaewdw",
        "ygds"
      ]
    },
    {
      "cells": [
        "bxzhb",
        "abnjnxj"
      ]
    },
    {
      "cells": [
        "shhgsa",
        "snxknk"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check the Login Functionality with all sets of data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "launch login page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewLoginSteps.launch_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters the \"adaewdw\" and enters \"ygds\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewLoginSteps.enters_the_username_and_enters_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewLoginSteps.click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the Login Functionality with all sets of data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "launch login page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewLoginSteps.launch_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters the \"bxzhb\" and enters \"abnjnxj\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewLoginSteps.enters_the_username_and_enters_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewLoginSteps.click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the Login Functionality with all sets of data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "launch login page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewLoginSteps.launch_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters the \"shhgsa\" and enters \"snxknk\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewLoginSteps.enters_the_username_and_enters_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewLoginSteps.click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the Login Functionality with all sets of data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "launch login page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewLoginSteps.launch_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters the \"Admin\" and enters \"admin123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewLoginSteps.enters_the_username_and_enters_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewLoginSteps.click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
});