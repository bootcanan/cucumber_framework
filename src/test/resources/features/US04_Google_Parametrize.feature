
Feature: US04 Google Parameterize

  Background:
    Given user is on the google page

    Scenario: TC04 Google parametrize search
      When user search for "iphone"
      Then verify the result is "iphone"



      Scenario: TC05 tea pot parametrized search
        When user search for "tea pot"
        Then verify the result is "tea pot"

  Scenario: TC06 flower parametrized search
    When user search for "flower"
    Then verify the result is "flower"
      And close the application



