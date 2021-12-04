@DB_Utils
Feature: DB with DB_utils

  Scenario:  Scenario: TC_User can read the data
    Given user can connect the DB Koala database
    And user get DB  the "price"  data  from "tHOTELROOM" table
    And  user read the data DB on "price" column

    @List


    Scenario:  Scenario: TC_User can read the data
      Given user can connect the DB Koala database
      And user get DB  the "Email"  data  from "tHOTEL" table
      And  user list "Email" data from "tHOTEL" table