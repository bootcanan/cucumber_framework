@db_first

  Feature: Read_database

    Scenario: Read_hotel_Reservation
    Given  user connects the database
      And user gets "Email" from "tHOTEL" table
     # And user gets Name from tHOTELROOM table
     # And user gets Code from tHOTELROOM table
     And user gets all rows from the "Email" column
     # And user gets the value in row 5 in "price" column and verifies the value is "470.0000"

      @db_update
      Scenario: User update email
        Given user connects the database
        Then updates the Email with "elveda@gmail.com" where the IDHotel value is 5
        #UPDATE table SET Email "elveda@gmail.com" WHERE IDHotel=5


