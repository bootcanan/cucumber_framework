Feature:US09_Koala_multiple parameters negative test

  Scenario Outline: TC user multiple negative parameters can not login



Given user is on koala Resort page
Then click Log in button
And write the "<wrong_username>"
And write the wrong "<wrong_password>"
And click the log in button
Then Verify the login is not success

    Examples:
    |wrong_username| |wrong_password|
    |admin3| |456|
    |admin4| |466|
    |admin6| |426|
