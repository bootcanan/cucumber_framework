package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Yandex_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class Yandex_Step_Defs {
  Yandex_Page yandex_page=new Yandex_Page();
    @Given("user is on the yandex page")
    public void user_is_on_the_yandex_page() {
        Driver.getDriver().get(ConfigReader.getProperty("yandex_url"));
    }

    @When("user search for iphone on yandex")
    public void user_search_for_iphone_on_yandex() {
        yandex_page.searchBox.sendKeys("iphone" + Keys.ENTER);
    }

    @Then("verify the result is iphone on yandex")
    public void verify_the_result_is_iphone_on_yandex() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));

    }

    @When("user search tea pot on yandex")
    public void user_search_tea_pot_on_yandex() {
        yandex_page.searchBox.sendKeys("tea pot" +Keys.ENTER);

    }

    @Then("verify the result is tea pot on yandex")
    public void verify_the_result_is_tea_pot_on_yandex() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("tea pot"));

    }



}
