import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Product {
    WebDriver driver;
    WebDriverWait wait;

    public Product(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    By selectMenuProdcut = By.xpath("(//div[@class= ' menu gs-atm__scrollbar-1']/div)[5]");
    By closePopupVideo = By.xpath("//div[@class = 'v5Um9Ms0fy+rVulr6jyrVQ==']");
    By createProductbutton = By.xpath("(//button[@class= 'gs-button  gs-button__green gs-button--undefined '])[1]");
    By productName = By.xpath("//input[@name = 'productName']");
    By typeImg = By.xpath("//input[@accept = 'image/jpeg,image/png,image/gif']");
    By fieldstockProduct = By.xpath("(//input[@class='form-control cur-input cur-input--non-unit'])[2]");
    By nameBranch1 = By.xpath("(//div[@class= 'font-weight-500 col-sm-7'])[1]");
    By fieldstockProduct2 = By.xpath("(//input[@class='form-control cur-input cur-input--non-unit'])[3]");
    By nameBranch2 = By.xpath("(//div[@class= 'font-weight-500 col-sm-7'])[2]");
    By listingPrice = By.xpath("(//input[@class ='form-control cur-input cur-input--unit'])[1]");
    By sellingPrice = By.xpath("(//input[@class ='form-control cur-input cur-input--unit'])[2]");




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
}
