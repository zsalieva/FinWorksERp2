@solutions
Feature: Drop Down module options

  Scenario:   Viewing Solutions Module
    Given user is on the landing page
    When user clicks on "<Module>"
    Then user should able to see following menus:

      | Supply Chain Management             |
      | Customer Relationship Management    |
      | Process Manufacturing               |
      | Energy and Utilities                |
      | Enterprise Asset Management         |
      | Enterprise Service Management       |
      | High Tech Manufacturing             |
      | Enterprise Operational Intelligence |
      | Enterprise Project Management       |
      | Business Intelligence               |

# CMD+options+l for mac to make it look right