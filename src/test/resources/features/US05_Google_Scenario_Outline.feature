Feature: US05_Google Scenario outline
  Scenario Outline: TC 05 Google multiple search

    Given user is on the google page
    Then user search for "<fruits>"
    And verify the result is "<fruits>"
    Examples:
    |fruits|
    |apple|
    |pear|
