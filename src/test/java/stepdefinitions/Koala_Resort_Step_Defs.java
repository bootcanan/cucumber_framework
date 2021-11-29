package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.KoalaResort_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class Koala_Resort_Step_Defs {
    KoalaResort_Page koalaResortPage=new KoalaResort_Page();
    @Given("user is on koala Resort page")
    public void user_is_on_koala_resort_page() {
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        koalaResortPage.advanceButton.click();
        koalaResortPage.proccedLinki.click();

    }

    @Then("click Log in button")
    public void click_log_in_button() {
        koalaResortPage.loginBtn.click();


    }

    @Then("write the username")
    public void write_the_username() {
        koalaResortPage.username.sendKeys(ConfigReader.getProperty("kr_valid_username"));

    }

    @Then("write the password")
    public void write_the_password() {
   koalaResortPage.password.sendKeys(ConfigReader.getProperty("kr_valid_password"));
    }

    @Then("click the log in button")
    public void click_the_log_in_button() {
     koalaResortPage.submit.click();
    }

    @Then("Verify the login is success")
    public void verify_the_login_is_success() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Admin"));

    }

    @Then("write the wrong username")
    public void write_the_wrong_username() {

        koalaResortPage.username.sendKeys(ConfigReader.getProperty("kr_wrong_username"));
    }

    @Then("write the wrong password")
    public void write_the_wrong_password() {
        koalaResortPage.password.sendKeys(ConfigReader.getProperty("kr_wrong_password"));

    }

    @Then("Verify the login is not success")
    public void verify_the_login_is_not_success() {
  Assert.assertTrue(koalaResortPage.invalidText.isDisplayed());

    }


    @Then("write the {string}")
    public void write_the(String string) {
      koalaResortPage.username.sendKeys(string);
    }

    @Then("write the wrong {string}")
    public void write_the_wrong(String string) {
        koalaResortPage.password.sendKeys(string);

    }

    @Given("user enters manager_username and manager_password")
    public void user_enters_manager_username_and_manager_password(DataTable dataTable) {
     List<String> data=dataTable.row(0);

        koalaResortPage.username.sendKeys(data.get(0));
        koalaResortPage.password.sendKeys(data.get(1));
    }

    @Given("user enters all required fields")
    public void user_enters_all_required_fields(DataTable dataTable) {
       List<String>allData=dataTable.row(1);

        Select select=new Select(koalaResortPage.IdUser);
        select.selectByIndex(Integer.parseInt(allData.get(0)));
        Select select1=new Select(koalaResortPage.SelectHotelRoom);
        select1.selectByIndex(Integer.parseInt(allData.get(1)));

        koalaResortPage.Price.sendKeys(allData.get(2));
        koalaResortPage.dateStart.sendKeys(allData.get(3));
        koalaResortPage.dateEnd.sendKeys(allData.get(4));
        koalaResortPage.adultAmount.sendKeys(allData.get(5));
        koalaResortPage.childrenAmount.sendKeys(allData.get(6));
        koalaResortPage.contactInfo.sendKeys(allData.get(7));
        koalaResortPage.contactPhone.sendKeys(allData.get(8));
        ReusableMethods.waitFor(2);
        koalaResortPage.contactEmail.sendKeys(allData.get(9));
        koalaResortPage.notes.sendKeys(allData.get(10));
        ReusableMethods.waitFor(2);


    }

    @Then("capture the screenshot")
    public void capture_the_screenshot() throws IOException {
        ReusableMethods.getScreenshot("taking screen shot");
        ReusableMethods.waitFor(2);
    }






}
