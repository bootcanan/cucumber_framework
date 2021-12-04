@db_third
  Feature: Create hotel room
    Scenario: create hotel room test
      Given user connects the database
      When user creates a new hotel with a "dataHotel"
      Then verify the hotel created successfully
      Then close the connection
