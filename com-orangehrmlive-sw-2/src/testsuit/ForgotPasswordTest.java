package testsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl1 = "https://opensource-demo.orangehrmlive.com/";
    //String baseUrl2 = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";

    @Before

    public void setUp() {
        openBrowser(baseUrl1);
    }

    @Test

    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div[2]/div[2]/form/div[4]/p")).click();
        String actualText = driver.findElement(By.tagName("h6")).getText();
        String expectedText = "Reset Password";
        Assert.assertEquals(actualText, expectedText);

    }


    @After
    public void endTest() {
        closeBrowser();
    }
}
