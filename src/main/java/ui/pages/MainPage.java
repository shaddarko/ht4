package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    @FindBy(xpath = "//p[contains(text(),'Shady')]")
    private WebElement elDropDown;

    @FindBy(xpath = "//b[contains(text(),'Shady Lovers')]")
    private WebElement elProfile;

    public void goToProfilePage() {
        clickOnDropDownProfileMenu();
        clickOnProfileInfo();

    }

    public void clickOnProfileInfo(){
        elProfile.click();
    }
    public void clickOnDropDownProfileMenu(){
        elDropDown.click();
    }
}
