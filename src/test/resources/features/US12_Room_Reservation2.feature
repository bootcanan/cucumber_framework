@room_reservation

Feature: US12_User should be able reserve the room

  Scenario Outline:TC01_manger_should_create_hotel_reservation
    Given user is on koala Resort page
    Then click Log in button
    And user write the username "<username>"
    And user write the password "<password>"
    And click the log in button
    And verify login page is displayed
    And user navigates create_room_page
    And user enters IDUser "<IDUser>"
    And user enters IDHotel "<IDHotel>"
    And user enters the price "<price>"
    And user enters  the date_starts "<date_starts>"
    And user enters the date_end "<date_end>"
    And user enters  the  adult_amount "<adult_amount>"
    And user enters  the children_amount "<children_amount>"
    And user enters  the contact_name "<contact_name>"
    And user enters  the contact_phone "<contact_phone>"
    And user enters  the contact_email "<contact_email>"
    And user enters  the notes "<notes>"
    And user clicks on the approved checkbox
    And user clicks on the is_paid checkbox
    And user clicks on the save_button
    Then user verifies the success_message




    Examples:Test Data
    |username|password|IDUser|IDHotel|price|date_starts|date_end|adult_amount|children_amount|contact_name|contact_phone|contact_email|notes|
    | manager|Manager1!|5|  3|1000 |11/30/2021|11/30/2021|    2        |   2            |      test      |  5463456345           |   test2@gmail.com         | test    |
    | manager|Manager1!|3|  4|100 |12/04/2021|11/30/2021|    5       |     0         |      test      |  5463456345           |   test2@gmail.com         | test    |
