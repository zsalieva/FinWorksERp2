$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/about/AboutUsDpDn.feature");
formatter.feature({
  "name": "Drop Down module options",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@about"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Viewing AboutUs Module",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on AboutUs",
  "keyword": "When "
});
formatter.step({
  "name": "user should able to see \"\u003cMenu\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Menu"
      ]
    },
    {
      "cells": [
        "What is ERP?"
      ]
    },
    {
      "cells": [
        "Mission and Vision"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Viewing AboutUs Module",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@about"
    }
  ]
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on AboutUs",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should able to see \"What is ERP?\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Viewing AboutUs Module",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@about"
    }
  ]
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on AboutUs",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should able to see \"Mission and Vision\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});