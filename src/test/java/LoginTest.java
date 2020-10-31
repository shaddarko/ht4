import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.layout.Priority;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static LoginPage loginPage;
    public static MainPage mainPage;
    public static ProfilePage profilePage;
    private WebDriver driver;
    private Logger logger = LogManager.getLogger(LoginTest.class);
    String baseUrl = "https://otus.ru";
    @BeforeMethod
    public void SetUp() {
        WebDriverManager.chromedriver().setup();

        logger.info("Initializing webdriver...");
        driver = new ChromeDriver();
        logger.info("Driver initialized...");
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        profilePage = new ProfilePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    @Test (priority = 1)
    public void inputData() {

        loginPage.logIn();
        mainPage.goToProfilePage();
        profilePage.inputData();


    }

    @Test (priority = 2)
    public void checkData() {
        loginPage.logIn();
        mainPage.goToProfilePage();
        profilePage.checkData();
    }

    @AfterMethod
    public void tearDown() {
          driver.quit();
    }


}


