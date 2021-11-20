package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class Yandex_Page {

    public Yandex_Page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="text")
    public WebElement searchBox;



}
