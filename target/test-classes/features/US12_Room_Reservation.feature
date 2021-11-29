Feature:Manager should create a reservation

  Scenario: TC01_manger_should_create_hotel_reservation
    Given user is on koala Resort page
    Then click Log in button
    And write the username
    And write the password
    And click the log in button
    And verify login page is displayed
    And user navigates create_room_page
    And user enters IDUser
    And user enters IDHotel
    And user enters the price
    And user enters  the date_starts
    And user enters the date_end
    And user enters  the adult_amount
    And user enters  the children_amount
    And user enters  the contact_name
    And user enters  the contact_phone
    And user enters  the contact_email
    And user enters  the notes
    And user clicks on the approved checkbox
    And user clicks on the is_paid checkbox
    And user clicks on the save_button
    Then user verifies the success_message
    Then close the application



