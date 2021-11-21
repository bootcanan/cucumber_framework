package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.KoalaResort_Page;
import utilities.ConfigReader;
import utilities.Driver;

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




}
