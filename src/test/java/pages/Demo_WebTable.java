package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Demo_WebTable {

    public Demo_WebTable(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    public String data(int rowNo,int columnNo){
        String data="";
        //tbody//tr[2]//td[2]
        String dynamicXpath=" //tbody//tr["+rowNo+"]//td["+columnNo+"]";
       data=Driver.getDriver().findElement(By.xpath(dynamicXpath)).getText();
        return data;

    }
}
