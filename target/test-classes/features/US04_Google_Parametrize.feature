@wip
Feature: US04 Google Parameterize

  Background:
    Given user is on the google page

    Scenario: TC04 Google parametrize search
      When user search for "iphone"
      Then verify the result is "iphone"



