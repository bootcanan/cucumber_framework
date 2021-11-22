@report1
Feature: US10_Amazon_product search

  Scenario: TC user search Mehmet on Amazon
    Given user is on "amazon_url" page
    Then user clicked on today's deal
    And user search "Mehmet" on Today's deal page
    Then verify the first result is "Mehmet"





