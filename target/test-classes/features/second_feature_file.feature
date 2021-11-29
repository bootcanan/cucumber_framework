Feature:Google_Search
@smoke
  Scenario: Search_iphone
    Given user is on the google page
    And   user search for iphone
    Then verify the result is iphone

    Scenario: Search_tea_pot
      Given user is on the google page2
      And   user search for tea pot
      Then verify the result is tea pot

  Scenario: Search_flower
    Given user is on the google page2
    And   user search for flower
    Then verify the result is flower
    And close the application
