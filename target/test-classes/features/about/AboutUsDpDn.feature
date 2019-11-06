--strict
@about
Feature: Drop Down module options

  Scenario Outline:  Viewing AboutUs Module
    Given user is on the landing page
    When user clicks on AboutUs
    Then user should able to see "<Menu>"



    Examples:

      |       Menu         |
      | What is ERP?       |
      | Mission and Vision |