import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login extends pathFile {
    WebDriver driver;
    WebDriverWait wait;

    public Login(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    public void login(String userName, String passWord) {
        driver.get("https://admin.unisell.vn/login.html#/");
        WebElement inputUsername = wait.until(ExpectedConditions.presenceOfElementLocated(usernametxt));
        WebElement inputPassword = wait.until(ExpectedConditions.presenceOfElementLocated(pwdtxt));
        WebElement clickLogin = wait.until(ExpectedConditions.elementToBeClickable(login));

        inputUsername.sendKeys(userName);
        inputPassword.sendKeys(passWord);
        clickLogin.click();
    }
}
