package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[contains(text(),'Вход')]")
    private WebElement elLoginButton;

    @FindBy(xpath = "//input[contains(@class,'js-email-input')]")
    private WebElement elEmailInput;

    @FindBy(xpath = "//input[contains(@class,'js-psw-input')]")
    private WebElement elPasswordInput;

    @FindBy(xpath = "//button[contains(text(),'Войти')]")
    private WebElement elConfirmButton;

   /* public void logIn() {
        loginButton.click();
        emailInput.sendKeys(login);
        passwordInput.sendKeys(password);
        confirmButton.click();
    }*/

    public void inputUserLogin (String userLogin) {
        elEmailInput.sendKeys(userLogin);
    }
    public void inputUserPassword (String userPassword) {
        elPasswordInput.sendKeys(userPassword);
    }
    public void clickOnLoginButton() { elLoginButton.click(); }
    public void clickOnConfirmButton()  {
        elConfirmButton.click();
    }

    public void inputData (String userLogin, String userPassword) {
        clickOnLoginButton();
        inputUserLogin(userLogin);
        inputUserPassword(userPassword);
        clickOnConfirmButton();
    }

}

