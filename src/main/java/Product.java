import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Product extends pathFile {
    WebDriver driver;
    WebDriverWait wait;

    public Product(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void menuProduct(){
        WebElement clickproduct = wait.until(ExpectedConditions.elementToBeClickable(selectMenuProdcut));
        clickproduct.click();
        WebElement clickClosePopupVideoProduct = wait.until(ExpectedConditions.elementToBeClickable(closePopupVideo));
        clickClosePopupVideoProduct.click();
    }
    public void createProduct () throws InterruptedException {
        //Click btn CreateProduct
        WebElement selectbtnProduct = wait.until(ExpectedConditions.elementToBeClickable(createProductbutton));
        selectbtnProduct.click();
        //Input ProductName
        WebElement inputProductName = wait.until(ExpectedConditions.visibilityOfElementLocated(productName));
        inputProductName.sendKeys("Auto Products");
        Thread.sleep(2000);
        //Input Img
        WebElement inputImg = driver.findElement(typeImg);
        inputImg.sendKeys("C://Users//admin//Desktop//MediaStep//cuahangtienloi//khoidong.png");
    }
    public void stockProduct (String stockBranch1, String stockBranch2) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement fieldstockBranch1 = wait.until(ExpectedConditions.elementToBeClickable(fieldstockProduct));
        try {
            actions.moveToElement(fieldstockBranch1).perform();
        }
        catch (StaleElementReferenceException e) {
            fieldstockBranch1 = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldstockProduct));
            actions.moveToElement(fieldstockBranch1).perform();
        }
        fieldstockBranch1.sendKeys(Keys.CONTROL + "A",Keys.BACK_SPACE);
        actions.click(fieldstockBranch1).perform();
        actions.sendKeys(stockBranch1).perform();
        //Input stock cho branch 2
        WebElement fieldstockBranch2 = wait.until(ExpectedConditions.elementToBeClickable(fieldstockProduct2));
        WebElement textNameBranch = wait.until(ExpectedConditions.elementToBeClickable(nameBranch1));
        textNameBranch.click();
        try {
            actions.moveToElement(fieldstockBranch2).perform();
        }
        catch (StaleElementReferenceException e) {
            fieldstockBranch2 = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldstockProduct2));
            actions.moveToElement(fieldstockBranch2).perform();
        }
        fieldstockBranch2.sendKeys(Keys.CONTROL + "A",Keys.BACK_SPACE);
        actions.click(fieldstockBranch2).perform();
        actions.sendKeys(stockBranch2).perform();
        WebElement textNameBranch2 = wait.until(ExpectedConditions.elementToBeClickable(nameBranch2));
        textNameBranch2.click();
    }
    public void priceProduct(){
        Actions actions = new Actions(driver);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(listingPrice));
        try {
            actions.moveToElement(element).perform();
        }catch (StaleElementReferenceException e){
            element = wait.until(ExpectedConditions.elementToBeClickable(listingPrice));
            actions.moveToElement(element).perform();
        }
        element.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        actions.click(element).perform();
        actions.sendKeys("450000").perform();

        //InputSellingPrice
        actions = new Actions(driver);
        element = wait.until(ExpectedConditions.elementToBeClickable(sellingPrice));
        try {
            actions.moveToElement(element).perform();
        }catch (StaleElementReferenceException e){
            element = wait.until(ExpectedConditions.elementToBeClickable(sellingPrice));
            actions.moveToElement(element).perform();
        }
        element.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        actions.click(element).perform();
        actions.sendKeys("450000").perform();
    }
    public void demension () throws InterruptedException {
        //Weight
        WebElement inputWeight = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldWeight));
        inputWeight.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        inputWeight.sendKeys("30");
        //Length
        WebElement inputLength = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldLength));
        inputLength.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        inputLength.sendKeys("5");
        //Width
        WebElement inputWidth = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldWidth));
        inputWidth.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        inputWidth.sendKeys("5");
        //Height
        WebElement inputHeight = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldHeight));
        inputHeight.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        inputHeight.sendKeys("10");
        Thread.sleep(1000);
        WebElement checkonApp = driver.findElement(onApp);
        checkonApp.click();

    }
//    public void platForm() {
//        String action = "check";
//        switch (action) {
//            case "check":
//
//
//        }
//    }
    public void SaveProduct () {
        WebElement clickSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveProduct));
        clickSave.click();
    }
    public void closePopupCreateProduct () {
        WebElement clickClosebtn = wait.until(ExpectedConditions.elementToBeClickable(btnClosePopupCreateProduct));
        clickClosebtn.click();
    }
}
