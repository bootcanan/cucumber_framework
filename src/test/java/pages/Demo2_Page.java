package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Demo2_Page {

    public Demo2_Page(){


        PageFactory.initElements(Driver.getDriver(), this);


    }

   public WebElement findCell(String row, String column){

       WebElement element= Driver.getDriver().findElement(By.xpath("//tbody//tr["+Integer.parseInt(row)+"]//td["+Integer.parseInt(column)+"]"));

        return element;



   }


}
