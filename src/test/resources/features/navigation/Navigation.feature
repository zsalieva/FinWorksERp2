@navigation
  Feature: navigate module options

  Scenario Outline:  Verify module title
    Given user is on the landing page
    When user clicks on "<Module>"
    Then the "<Title>" should be displayed

    Examples:
    |   Module  |      Title    |
    |   Home    |   FinWorksERP |
    |  Solutions|   FinWorksERP |
    |   Careers |    Careers    |
    |   Contact |    Contact    |
    |  Login    |    Login      |

