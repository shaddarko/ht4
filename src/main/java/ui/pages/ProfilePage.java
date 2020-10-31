package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProfilePage {

    private WebDriver driver;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@name='fname_latin']")
    private WebElement elInputName;

    @FindBy(xpath = "//input[@name='lname_latin']")
    private WebElement elInputLname;

    @FindBy(xpath = "//button[@title='Сохранить и продолжить']")
    private WebElement elSaveButton;

    @FindBy(xpath = "//input[@value='Shady'][@name='fname_latin']")
    private WebElement elFilledName;

    @FindBy(xpath = "//input[@value='Lovers'][@name='lname_latin']")
    private WebElement elFilledLname;

  /*  @FindBy(xpath = "//span[@class='placeholder']/ancestor::label/input[@name='country']")
    WebElement selectCountry;

    @FindBy(xpath = "//button[@title='Россия']")
    WebElement selectRussia;

    @FindBy(xpath = "//span[@class='placeholder']/ancestor::label/input[@name='city']")
    WebElement selectCity;

    @FindBy(xpath = "//button[@title='Москва']")
    WebElement selectMoscow;*/


    public void inputUsersDataInPersonalInfo(String userName, String userLastName) {
        elInputName.sendKeys(userName);
        elInputLname.sendKeys(userLastName);
        elSaveButton.click();
    }

    public void checkPresenceOfUsersData() {
        Assert.assertTrue(elFilledLname.isDisplayed(), "Element is not visible");
        Assert.assertTrue(elFilledName.isDisplayed(), "Element is not visible");

    }
}




