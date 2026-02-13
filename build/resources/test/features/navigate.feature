Feature: HomePage
  @navigate
  Scenario: Verify HomePage title is displayed
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    Then User verifiles HomePage title is displayed
    And User closes browser