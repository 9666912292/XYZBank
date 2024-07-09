Feature: To check the dealspage functionality

  @Regression
  Scenario: check whether the user able to access the deals
    Given user is on deals page
    When user clicks on  particular product
    Then user should able to see the offers on particular product

  @Important
  Scenario: check whether the user able to access the deals
    Given user is on deals page
    When user clicks on Italian Basil
    Then user should able to see the offers on Italian Basil

  @smoke
  Scenario: check whether the user able to access the deals
    Given user is on deals page
    When user clicks on Yellow Zucchini - Sliced
    Then user should able to see the offers on Yellow Zucchini - Sliced

  @Regression1
  Scenario: check whether the user able to access the deals
    Given user is on deals page
    When user clicks on A2 Gir Cow Ghee
    Then user should able to see the offers on A2 Gir Cow Ghee
