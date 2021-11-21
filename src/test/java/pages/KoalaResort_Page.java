package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.lang.reflect.Field;

public class KoalaResort_Page {


  public  KoalaResort_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
 @FindBy(id="details-button")
    public WebElement advanceButton;

  @FindBy(id="proceed-link")
    public WebElement proccedLinki;

  @FindBy(xpath = "//a[text()=\"Log in\"]")
    public WebElement loginBtn;


    @FindBy(id="UserName")
    public WebElement username;

    @FindBy(id="Password")
    public WebElement password;
    @FindBy(id="btnSubmit")
    public WebElement submit;

    @FindBy(xpath = "//span[text()=\"Try again please\"]")
    public WebElement invalidText;

}

