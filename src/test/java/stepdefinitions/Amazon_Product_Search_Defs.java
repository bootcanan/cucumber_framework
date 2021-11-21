package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.Amazon_Page;

public class Amazon_Product_Search_Defs {
  Amazon_Page amazonPage=new Amazon_Page();

    @Then("user clicked on today's deal")
    public void user_clicked_on_today_s_deal() {
        amazonPage.blackFriday.click();

    }

    @Then("user search {string} on Today's deal page")
    public void user_search_on_today_s_deal_page(String string) {
     amazonPage.searchBox.sendKeys("Mehmet"+ Keys.ENTER);
    }
    @Then("verify the first result is {string}")
    public void verify_the_first_result_is(String string) {
        amazonPage.firstProduct.getText().contains("Mehmet");
    }

}
