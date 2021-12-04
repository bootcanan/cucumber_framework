package database_step_definitions;

import io.cucumber.java.en.Given;
import utilities.DB_Utils;

import java.sql.SQLException;

public class DB_utls_Defs {


    @Given("user can connect the DB Koala database")
    public void user_can_connect_the_db_koala_database() {
        DB_Utils.getConnection();
    }
    @Given("user get DB  the {string}  data  from {string} table")
    public void user_get_db_the_data_from_table(String price, String table) {
        String readQuery="SELECT "+price+" FROM dbo."+table;
        DB_Utils.executeQuery(readQuery);
    }
    @Given("user read the data DB on {string} column")
    public void user_read_the_data_db_on_column(String price) throws SQLException {
       DB_Utils.getResultset().first();
       Object firtsrowObj=DB_Utils.getResultset().getObject(price);
        System.out.println(firtsrowObj.toString());

    }
    @Given("user list {string} data from {string} table")
    public void user_list_data_from_table(String string, String string2) {

    }


}
