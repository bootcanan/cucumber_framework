package database_step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DB_Utils;

import java.sql.SQLException;

public class DB_Create_Step_Defs {

    @When("user creates a new hotel with a {string}")
    public void user_creates_a_new_hotel_with_a(String hotelData) throws SQLException {
        String query="INSERT INTO dbo.tHOTELROOM (Code,name, address,Phone,Email)"
                + "VALUES ('5500','jumping beans','building','3456','selenim@gmail.com')";
        DB_Utils.executeQuery(query);


    }

    @Then("verify the hotel created successfully")
    public void verify_the_hotel_created_successfully() {
          String query="SELECT name FROM dbo.tHOTELROOM";
        Assert.assertTrue(DB_Utils.getColumnData(query,"name").toString().contains("jumping beans"));

    }

    @Then("close the connection")
    public void close_the_connection() {
        DB_Utils.closeConnection();

    }


}
