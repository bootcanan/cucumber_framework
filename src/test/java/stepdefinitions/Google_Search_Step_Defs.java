package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Google_Search_Step_Defs {
    GooglePage googlePage=new GooglePage();
    @Given("user is on the google page")
    public void user_is_on_the_google_page() {

        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        googlePage.agreeButton.click();
    }

    @When("user search for iphone")
    public void user_search_for_iphone() {
      googlePage.searchBox.sendKeys("iphone" + Keys.ENTER);
    }

    @Then("verify the result is iphone")
    public void verify_the_result_is_iphone() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));

    }


    @Given("user search for tea pot")
    public void user_search_for_tea_pot() {
        googlePage.searchBox.sendKeys("tea pot" +Keys.ENTER);
    }

    @Given("user search for flower")
    public void user_search_for_flower() {
      googlePage.searchBox.sendKeys("flower" + Keys.ENTER);

    }

    @Then("verify the result is flower")
    public void verify_the_result_is_flower() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("flower"));

    }

    @Given("user is on the google page2")
    public void user_is_on_the_google_page2() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }

    @Given("user search on the google page")
    public void user_search_on_the_google_page2() {
     googlePage.searchBox.sendKeys("tea pot" + Keys.ENTER);
    }
    @Then("verify the result is tea pot")
    public void verify_the_result_is_tea_pot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("tea pot"));
    }

    @Then("close the application")
    public void close_the_application() {
      Driver.getDriver().close();
    }
    @When("user search for {string}")
    public void user_search_for(String string) {
       googlePage.searchBox.sendKeys(string+Keys.ENTER);
    }

    @Then("verify the result is {string}")
    public void verify_the_result_is(String string) {
  Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }



}
