package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ui.pages.LoginPage;
import ui.pages.MainPage;
import ui.pages.ProfilePage;
import java.util.concurrent.TimeUnit;


public class BaseHooks {

    private WebDriver driver;
    protected LoginPage loginPage;
    protected MainPage mainPage;
    protected ProfilePage profilePage;
    private String baseUrl = "https://otus.ru";

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.createDriver(WebDriverType.CHROME);

        if (driver != null) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(baseUrl);
            mainPage = new MainPage(driver);
            loginPage = new LoginPage(driver);
            profilePage = new ProfilePage(driver);

        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}

