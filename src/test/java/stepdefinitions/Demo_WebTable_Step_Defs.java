package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.Demo_WebTable;
import utilities.ConfigReader;
import utilities.Driver;

public class Demo_WebTable_Step_Defs {

    Demo_WebTable demo_webTable=new Demo_WebTable();

    @Given("user can write the data on row number {string} and column  number {string}")
    public void user_can_write_the_data_on_row_number_and_column_number(String rowNo, String columnNo) {

       int rownum=Integer.parseInt(ConfigReader.getProperty("Demo_rowNo"));
        int columnnum=Integer.parseInt(ConfigReader.getProperty("Demo_columnNo"));
        System.out.println(demo_webTable.data(rownum,columnnum));


    }


}
