@about
Feature: Drop Down module options

  Scenario Outline :  Viewing AboutUs Module
    Given user is on the home page
    When user select "<Module>"
    Then user selects from dropDown "<Menu>"
    And the  "<Title>" should be displayed

    Examples:

    | Module|Menu|Title|
    |       |    |     |
    |       |    |     |