package database_step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import utilities.DB_Utils;

import java.sql.*;

public class DB_first_Defs {
    String url= "jdbc:sqlserver://184.168.194.58:1433;databaseName=ph17934033561_fhctripdb; user=fhctipdb_user;password=P2s@rt65";
    String username="fhctipdb_user";
    String password="P2s@rt65";
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("user connects the database")
    public void user_connects_the_database() throws SQLException {
      DB_Utils.getConnection();
    }

    @Given("user gets {string} from {string} table")
    public void user_gets_from_table(String column, String table) throws SQLException {
        String query="SELECT "+column+" FROM dbo."+table;
       DB_Utils.executeQuery(query);


    }
    @Given("user gets all rows from the {string} column")
    public void user_gets_all_rows_from_the_column(String column) throws SQLException {
       DB_Utils.getResultset().next();
       DB_Utils.getResultset().absolute(2);
      Object secondRow= DB_Utils.getResultset().getObject(column);
        System.out.println(secondRow);
        DB_Utils.getResultset().absolute(5);
        Object fifthRow= DB_Utils.getResultset().getObject(column);
        System.out.println(fifthRow);
        DB_Utils.getResultset().next();
        Object sixthRow= DB_Utils.getResultset().getObject(column);
        System.out.println(sixthRow);

        DB_Utils.getResultset().first();
        while(DB_Utils.getResultset().next()){

            System.out.println(DB_Utils.getResultset().getObject(column));
        }
        DB_Utils.getResultset().last();
        Object lastRow= DB_Utils.getResultset().getObject(column);
        System.out.println(lastRow);
        }

    @Given("user gets the value in row {int} in {string} column and verifies the value is {string}")
    public void user_gets_the_value_in_row_in_column_and_verifies_the_value_is(Integer rowNo, String column, String value) throws SQLException {
         DB_Utils.getResultset().first();
         DB_Utils.getResultset().absolute(rowNo);
         String actualValue=DB_Utils.getResultset().getString(column);
        Assert.assertEquals(value,actualValue);


    }

    @Then("updates the Email with {string} where the IDHotel value is {int}")
    public void updates_the_email_with_where_the_id_hotel_value_is(String email, Integer id) {
       String updateQuery="UPDATE dbo.tHOTEL SET Email="+email+" WHERE IDHotel="+id;
       DB_Utils.executeQuery(updateQuery);
    }








}
