import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class goWallet extends pathFile {
    WebDriver driver;
    WebDriverWait wait;
    public goWallet(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void eyesWallet(){
        WebElement titlegetText = wait.until(ExpectedConditions.visibilityOfElementLocated(getText));
        String text = titlegetText.getText();
        System.out.println(text);

        WebElement clickIcon = wait.until(ExpectedConditions.elementToBeClickable(icgoWallet));
        clickIcon.click();


        WebElement textgetWallet = driver.findElement(textGowallet);
        String textgoWallet = textgetWallet.getText();

        WebElement getTextWallet = driver.findElement(TotalgoWallet);
        String goWallet = getTextWallet.getText();
        System.out.println(textgoWallet + goWallet);
    }
}
