Feature: US@wip07_Koala_Resort_Positive_Login

  Scenario: TC01 user can login

    Given user is on koala Resort page
    Then click Log in button
    And write the username
    And write the password
    And click the log in button
    Then Verify the login is success
