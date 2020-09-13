import io.github.bonigarcia.wdm.WebDriverManager;
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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    LoginPage loginPage;
    private WebDriver driver;
    private Logger logger = LogManager.getLogger(LoginTest.class);

    @BeforeTest
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        LoginPage loginPage;
        logger.info("Initializing webdriver...");
        driver = new ChromeDriver();
        logger.info("Driver initialized...");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get(ConfProperties.getProperty("loginpage"));
        driver.get("https://otus.ru");

    }

    @Test
    public void logIn () {

        loginPage.clickLoginBtn();
       loginPage.inputLogin();
    }

}


