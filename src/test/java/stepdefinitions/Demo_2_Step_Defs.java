package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.Demo2_Page;

public class Demo_2_Step_Defs {

     Demo2_Page demo2_page=new Demo2_Page();
    @Given("user is write the {string} and the {string}")
    public void user_is_write_the_and_the(String string, String string2) {
        System.out.println( demo2_page.findCell("3","3"));
    }
}
