@db_read2

Feature: Read_database

  Scenario: Read_hotel_Reservation
    Given  user connects the database
    And user gets "name" from "tHOTELROOM" table
     # And user gets Name from tHOTELROOM table
     # And user gets Code from tHOTELROOM table
    And user gets all rows from the "name" column
    And user gets the value in row 6 in "Name" column and verifies the value is "Twin room"


