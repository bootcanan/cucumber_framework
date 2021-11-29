package pages;

import org.openqa.selenium.By;
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

    @FindBy(xpath = "//span[text()=\"Hotel Management\"]")
    public WebElement hotelManagement;
    @FindBy(xpath = "//a[@href=\"/admin/RoomReservationAdmin\"]")
    public WebElement roomReservation;
    @FindBy(xpath = "//span[text()=\"Add Room Reservation \"]")
    public WebElement addRoom;

    @FindBy(id="IDUser")
    public WebElement IdUser;
    @FindBy(id="IDHotelRoom")
    public WebElement SelectHotelRoom;
  @FindBy(xpath = "//input[@name=\"Price\"]")
    public WebElement Price;

 @FindBy(id="DateStart")
    public WebElement dateStart;
 @FindBy(id="DateEnd")
    public WebElement dateEnd;

@FindBy(id="AdultAmount")
    public WebElement adultAmount;

@FindBy(id="ChildrenAmount")
    public WebElement childrenAmount;
@FindBy(id="ContactNameSurname")
    public WebElement contactInfo;
@FindBy(id="ContactPhone")
    public WebElement contactPhone;

@FindBy(id="ContactEmail")
    public WebElement contactEmail;

@FindBy(id="Notes")
    public WebElement notes;
@FindBy(id="Approved")
    public WebElement Approved;
@FindBy(id="IsPaid")
    public WebElement isPaid;
@FindBy(id="btnSubmit")
    public WebElement save;
@FindBy(xpath = "//div[text()=\"RoomReservation was inserted successfully\"]")
    public WebElement successMessage;
@FindBy(xpath = "//button[@data-bb-handler=\"ok\"]")
    public WebElement okButton;


}

