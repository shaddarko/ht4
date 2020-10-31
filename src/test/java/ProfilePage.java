import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public WebDriver driver;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@name='fname_latin']")
    WebElement inputName;

    @FindBy(xpath = "//input[@name='lname_latin']")
    WebElement inputLname;

    @FindBy(xpath = "//button[@title='Сохранить и продолжить']")
    WebElement saveButton;

    @FindBy(xpath = "//input[@value='Shady'][@name='fname_latin']")
    WebElement filledName;

    @FindBy(xpath = "//input[@value='Lovers'][@name='lname_latin']")
    WebElement filledLname;

  /*  @FindBy(xpath = "//span[@class='placeholder']/ancestor::label/input[@name='country']")
    WebElement selectCountry;

    @FindBy(xpath = "//button[@title='Россия']")
    WebElement selectRussia;

    @FindBy(xpath = "//span[@class='placeholder']/ancestor::label/input[@name='city']")
    WebElement selectCity;

    @FindBy(xpath = "//button[@title='Москва']")
    WebElement selectMoscow;*/



    public void inputData() {
        inputLname.sendKeys("Lovers");
        inputName.sendKeys("Shady");

        saveButton.click();
    }

    public void checkData() {
        filledName.isDisplayed();
        filledLname.isDisplayed();


    }



}
