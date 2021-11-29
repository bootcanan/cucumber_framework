package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.sl.Ko;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.KoalaResort_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class Room_Reservation_Step_Defs {
   KoalaResort_Page koalaResortPage=new KoalaResort_Page();
    @Then("verify login page is displayed")
    public void verify_login_page_is_displayed() {
     Assert.assertTrue(Driver.getDriver().getTitle().contains("Admin"));


    }

    @Then("user navigates create_room_page")
    public void user_navigates_create_room_page() {
       koalaResortPage.hotelManagement.click();
       koalaResortPage.roomReservation.click();
       koalaResortPage.addRoom.click();
    }

    @Then("user enters IDUser")
    public void user_enters_id_user() {
     Select select=new Select( koalaResortPage.IdUser);
  select.selectByIndex(2);
    }

    @Then("user enters IDHotel")
    public void user_enters_id_hotel() {
     Select select=new Select( koalaResortPage.SelectHotelRoom);
     select.selectByIndex(3);
    }

    @Then("user enters the price")
    public void user_enters_the_price() {
        koalaResortPage.Price.sendKeys("1000" );

    }

    @Then("user enters  the date_starts")
    public void user_enters_the_date_starts() {
     koalaResortPage.dateStart.sendKeys("12/01/2021");
    }

    @Then("user enters the date_end")
    public void user_enters_the_date_end() {
     koalaResortPage.dateEnd.sendKeys("12/04/2021");
    }

    @Then("user enters  the adult_amount")
    public void user_enters_the_adult_amount() {
     koalaResortPage.adultAmount.sendKeys("2");
    }

    @Then("user enters  the children_amount")
    public void user_enters_the_children_amount() {
    koalaResortPage.childrenAmount.sendKeys("2");
    }

    @Then("user enters  the contact_name")
    public void user_enters_the_contact_name() {
        koalaResortPage.contactInfo.sendKeys("canan ozdemir");

    }

    @Then("user enters  the contact_phone")
    public void user_enters_the_contact_phone() {

koalaResortPage.contactPhone.sendKeys("567 890 432 00");
        ReusableMethods.waitFor(3);
    }

    @Then("user enters  the contact_email")
    public void user_enters_the_contact_email() {
   koalaResortPage.contactEmail.sendKeys("jcdhkjfk@hotmail.com");
    }

    @Then("user enters  the notes")
    public void user_enters_the_notes() {
        koalaResortPage.notes.sendKeys("please se view room");

    }

    @Then("user clicks on the approved checkbox")
    public void user_clicks_on_the_approved_checkbox() {
   koalaResortPage.Approved.click();
    }

    @Then("user clicks on the is_paid checkbox")
    public void user_clicks_on_the_is_paid_checkbox() {        ReusableMethods.waitFor(2);

        koalaResortPage.isPaid.click();
    }

    @Then("user clicks on the save_button")
    public void user_clicks_on_the_save_button() {
       koalaResortPage.save.click();        ReusableMethods.waitFor(2);

    }

    @Then("user verifies the success_message")
    public void user_verifies_the_success_message() {
        ReusableMethods.waitFor(5);
     Assert.assertTrue(koalaResortPage.successMessage.isDisplayed());
     koalaResortPage.okButton.click();
     ReusableMethods.waitFor(1);
    }

//BELOW FOR SCENARIO OUTLINE

    @Then("user write the username {string}")
    public void user_write_the_username(String string) {
         koalaResortPage.username.sendKeys(string);
    }

    @Then("user write the password {string}")
    public void user_write_the_password(String string) {
        koalaResortPage.password.sendKeys(string);
    }


    @Then("user enters IDUser {string}")
    public void user_enters_id_user(String string) {
        Select select=new Select(koalaResortPage.IdUser);
        select.selectByIndex(Integer.parseInt(string));

    }

    @Then("user enters IDHotel {string}")
    public void user_enters_id_hotel(String string) {
        Select select=new Select(koalaResortPage.SelectHotelRoom);
        select.selectByIndex(Integer.parseInt(string));


    }

    @Then("user enters the price {string}")
    public void user_enters_the_price(String string) {
        koalaResortPage.Price.sendKeys(string);

    }

    @Then("user enters  the date_starts {string}")
    public void user_enters_the_date_starts(String string) {
      koalaResortPage.dateStart.sendKeys(string);
    }

    @Then("user enters the date_end {string}")
    public void user_enters_the_date_end(String string) {
     koalaResortPage.dateEnd.sendKeys(string);
    }

    @Then("user enters  the  adult_amount {string}")
    public void user_enters_the_adult_amount(String string) {
      koalaResortPage.adultAmount.sendKeys(string);
    }

    @Then("user enters  the children_amount {string}")
    public void user_enters_the_children_amount(String string) {
       koalaResortPage.childrenAmount.sendKeys(string);
    }

    @Then("user enters  the contact_name {string}")
    public void user_enters_the_contact_name(String string) {
        koalaResortPage.contactInfo.sendKeys(string);
    }

    @Then("user enters  the contact_phone {string}")
    public void user_enters_the_contact_phone(String string) {
      koalaResortPage.contactPhone.sendKeys(string);
        ReusableMethods.waitFor(3);
    }

    @Then("user enters  the contact_email {string}")
    public void user_enters_the_contact_email(String string) {
     koalaResortPage.contactEmail.sendKeys(string);
    }

    @Then("user enters  the notes {string}")
    public void user_enters_the_notes(String string) {
    koalaResortPage.notes.sendKeys(string);
    }




}
