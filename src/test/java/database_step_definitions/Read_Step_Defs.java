package database_step_definitions;

import io.cucumber.java.en.Given;

import java.sql.*;
import java.util.List;

public class Read_Step_Defs {
    String url= "jdbc:sqlserver://184.168.194.58:1433;databaseName=ph17934033561_fhctripdb; user=fhctipdb_user;password=P2s@rt65";
    String username="fhctipdb_user";
    String password="P2s@rt65";
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Given("user can connect the Koala database")
    public void user_can_connect_the_koala_database() throws SQLException {
      connection= DriverManager.getConnection(url,username,password);
        statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);


    }
    @Given("user get the {string}  data  from {string} table")
    public void user_get_the_data_from_table(String price, String table) throws SQLException {
        String readQuery="SELECT "+price+" FROM dbo."+table;
        resultSet=statement.executeQuery(readQuery);
    }
    @Given("user read the data on {string} column")
    public void user_read_the_data_on_column(String price) throws SQLException {
      resultSet.first();
      Object firstRowObj=resultSet.getObject(price);
        System.out.println(firstRowObj.toString());
        resultSet.next();
        Object secondRowObj=resultSet.getObject(price);
        System.out.println(secondRowObj.toString());

        //5. element
        resultSet.absolute(5);
        Object fifthRowObj=resultSet.getObject(price);
        System.out.println(fifthRowObj.toString());
        System.out.println();
        resultSet.absolute(0);
        Object object=null;
        while (resultSet.next()){
            object=resultSet.getObject(price);
            System.out.println(object.toString());
        }
    }


}
