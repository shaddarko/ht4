
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {

    public WebDriver driver;
    private String login = "ollynnommapp-6141@yopmail.com";
    private String password = "121232asd";

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[contains(text(),'Вход')]")
    WebElement loginButton;

    @FindBy(xpath = "//input[contains(@class,'js-email-input')]")
    WebElement emailInput;

    @FindBy(xpath = "//input[contains(@class,'js-psw-input')]")
    WebElement passwordInput;

    @FindBy(xpath = "//button[contains(text(),'Войти')]")
    WebElement confirmButton;

    public void logIn() {
        loginButton.click();
        emailInput.sendKeys(login);
        passwordInput.sendKeys(password);
        confirmButton.click();

    }
}

