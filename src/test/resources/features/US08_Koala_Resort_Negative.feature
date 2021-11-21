Feature:US08_Koala_Resort_Negative login

  Scenario: TC01 user can not login

    Given user is on koala Resort page
    Then click Log in button
    And write the wrong username
    And write the wrong password
    And click the log in button
    Then Verify the login is not success
