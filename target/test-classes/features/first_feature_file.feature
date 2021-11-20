@google_search

Feature: All feature files must start with Feature keyword
  Scenario: this is used to create test cases

    Given  user is on the google page
    When  user search for iphone
    Then  verify the result is iphone


    Scenario: tea pot search
      Given user is on the google page2
      And user search on the google page
      Then verify the result is tea pot
      Then close the application

