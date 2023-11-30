package testsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public void userShouldLoginSuccessfullyWithValidCredentials(){

        WebElement usernameField = driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']/div[2]/form/div[1]/div/div[2]/input"));
        usernameField.sendKeys("Admin");

        WebElement passwordField = driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']/div[2]/form/div[2]/div/div[2]/input"));
        passwordField.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/button"));
        loginButton.click();
    }

    @After
    public void endTest() {
        closeBrowser();
    }
}
