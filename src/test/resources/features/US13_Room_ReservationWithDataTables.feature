@Data_Tables
Feature: US13_Room_ReservationWithDataTables

  Background:
    Given user is on koala Resort page
    And click Log in button
    Then capture the screenshot

  Scenario: TC01_user should be able to login the page.

    Given user enters manager_username and manager_password
      |manager|Manager1!|
    And click the log in button
    Then capture the screenshot
    And verify login page is displayed
    And user navigates create_room_page
      Given user enters all required fields
        |IDUser|IDHotel|price|date_starts|date_end|adult_amount|children_amount|contact_name|contact_phone|contact_email|notes|
        |5|  3|1000 |11/30/2021|12/30/2021|2|2 |test |  5463456345 |test2@gmail.com | test  |
        And user clicks on the approved checkbox
        And user clicks on the is_paid checkbox
        And user clicks on the save_button
        Then user verifies the success_message
    Then capture the screenshot
        Then close the application
#
#    And user enters IDUser "<IDUser>"
#    And user enters IDHotel "<IDHotel>"
#    And user enters the price "<price>"
#    And user enters  the date_starts "<date_starts>"
#    And user enters the date_end "<date_end>"
#    And user enters  the  adult_amount "<adult_amount>"
#    And user enters  the children_amount "<children_amount>"
#    And user enters  the contact_name "<contact_name>"
#    And user enters  the contact_phone "<contact_phone>"
#    And user enters  the contact_email "<contact_email>"
#    And user enters  the notes "<notes>"
#    And user clicks on the approved checkbox
#    And user clicks on the is_paid checkbox
#    And user clicks on the save_button
#    Then user verifies the success_message
