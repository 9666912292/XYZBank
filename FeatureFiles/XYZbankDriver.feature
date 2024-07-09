Feature: XYZ Bank Driver Login

  Scenario: Opening Website Functionality Exists
    Given I have open a chrome browser
    When user navigates to the website XYZ Bank
    And there user logs in through by clicking "Home"
    Then login must be successful.
