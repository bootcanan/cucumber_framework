@db_read
Feature: US can connect the Koala Resort database

  Scenario: TC_User can read the data
    Given user can connect the Koala database
    And user get the "price"  data  from "tHOTELROOM" table
    And  user read the data on "price" column