import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class editProduct extends pathFile {
    WebDriver driver;
    WebDriverWait wait;

    public editProduct(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().refresh();
        String mainWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
    public void selectItem() {
//        WebElement clickproduct = wait.until(ExpectedConditions.elementToBeClickable(selectMenuProdcut));
//        clickproduct.click();
//        WebElement clickClosePopupVideoProduct = wait.until(ExpectedConditions.elementToBeClickable(closePopupVideo));
//        clickClosePopupVideoProduct.click();
        WebElement selectFristItem = wait.until(ExpectedConditions.elementToBeClickable(firstItem));
        selectFristItem.click();

    }
    public void editPrice() {
        String mainWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        Actions actions = new Actions(driver);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(listingPrice));
        try {
            actions.moveToElement(element).perform();
        }catch (StaleElementReferenceException e){
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(listingPrice));
            actions.moveToElement(element).perform();
        }
        element.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        actions.click(element).perform();
        actions.sendKeys("500000").perform();
    }
    public void addVariation () throws InterruptedException {
        WebElement selectAddVariation = wait.until(ExpectedConditions.elementToBeClickable(textAddVariation));
        selectAddVariation.click();
        WebElement inputNameVariation = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldVariationName));
        inputNameVariation.sendKeys("Color");
        WebElement inputValueVariation = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldVariationValue));
        inputValueVariation.sendKeys("Đen");
//        wait.until(ExpectedConditions.attributeToBe(fieldVariationValue, "value", "Đen"));
        Thread.sleep(1000);
        inputNameVariation.sendKeys(Keys.ENTER);
    }
    public void addImgVariation () {
        WebElement selectIconImg = wait.until(ExpectedConditions.elementToBeClickable(imgVariation));
        selectIconImg.click();
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(imageVar);
        try {
            actions.moveToElement(element).perform();
        }catch (StaleElementReferenceException e){
            element = driver.findElement(imageVar);
            actions.moveToElement(element).perform();
        }
        WebElement selectImg = wait.until(ExpectedConditions.elementToBeClickable(selectBtnImg));
        selectImg.click();

        WebElement btnSaveImgVar = wait.until(ExpectedConditions.elementToBeClickable(btnSelectImg));
        btnSaveImgVar.click();
    }
    public void addStockVariation() {
        WebElement stockVariationField = wait.until(ExpectedConditions.elementToBeClickable(stockVariation));
        stockVariationField.click();
        WebElement inputStockVariation = wait.until(ExpectedConditions.visibilityOfElementLocated(inputStockField));
        inputStockVariation.sendKeys("10");
        WebElement selectBtnUpdateStockVar = wait.until(ExpectedConditions.elementToBeClickable(btnUpdateStockVar));
        selectBtnUpdateStockVar.click();
    }
}
