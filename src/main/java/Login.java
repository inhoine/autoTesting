import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    WebDriver driver;
    WebDriverWait wait;

    public Login(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    By usernametxt = By.xpath("(//input[@name= 'username'])[1]");
    By pwdtxt = By.xpath("(//input[@name= 'password'])[1]");
    By login = By.xpath("(//button[@type= 'submit'])[1]");

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
