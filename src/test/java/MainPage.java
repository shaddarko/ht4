import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    @FindBy(xpath = "//p[contains(text(),'Shady')]")
    WebElement dropDown;

    @FindBy(xpath = "//b[contains(text(),'Shady Lovers')]")
    WebElement profile;

    public void goToProfilePage() {
        dropDown.click();
        profile.click();
    }
}
