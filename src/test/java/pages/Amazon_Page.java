package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Amazon_Page {

   public Amazon_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;


}
