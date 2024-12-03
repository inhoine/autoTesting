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
    public void stockProduct (String[] stock) throws InterruptedException {
        //Manual Stock
//        Actions actions = new Actions(driver);
//        WebElement fieldstockBranch1 = wait.until(ExpectedConditions.elementToBeClickable(fieldstockProduct));
//        try {
//            actions.moveToElement(fieldstockBranch1).perform();
//        }
//        catch (StaleElementReferenceException e) {
//            fieldstockBranch1 = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldstockProduct));
//            actions.moveToElement(fieldstockBranch1).perform();
//        }
//        fieldstockBranch1.sendKeys(Keys.CONTROL + "A",Keys.BACK_SPACE);
//        actions.click(fieldstockBranch1).perform();
//        actions.sendKeys(stockBranch1).perform();
//        //Input stock cho branch 2
//        WebElement fieldstockBranch2 = wait.until(ExpectedConditions.elementToBeClickable(fieldstockProduct2));
//        WebElement textNameBranch = wait.until(ExpectedConditions.elementToBeClickable(nameBranch1));
//        textNameBranch.click();
//        try {
//            actions.moveToElement(fieldstockBranch2).perform();
//        }
//        catch (StaleElementReferenceException e) {
//            fieldstockBranch2 = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldstockProduct2));
//            actions.moveToElement(fieldstockBranch2).perform();
//        }
//        fieldstockBranch2.sendKeys(Keys.CONTROL + "A",Keys.BACK_SPACE);
//        actions.click(fieldstockBranch2).perform();
//        actions.sendKeys(stockBranch2).perform();
//        WebElement textNameBranch2 = wait.until(ExpectedConditions.elementToBeClickable(nameBranch2));
//        textNameBranch2.click();

        //AutoStock
        try {
            // Tìm tất cả các phần tử có class giống "form-control cur-input cur-input--non-unit"
            List<WebElement> inputFields = driver.findElements(allStockOfBranch);

            // Kiểm tra xem có bao nhiêu trường input
            System.out.println("---------------------------------");
            System.out.println("Field stock của Branch: " + inputFields.size());
            // Nhập các giá trị vào tất cả các trường
//            String[] values = {"10", "20", "30", "40", "50"};  // Các giá trị cần nhập vào

            // Duyệt qua danh sách các input và nhập giá trị tương ứng
            for (int i = 1; i < stock.length; i++) {
                System.out.println("Branch được nhập vào ở vị trí thứ: " + i);

                // Tìm lại tất cả các input field mỗi lần cần nhập
                inputFields = driver.findElements(allStockOfBranch);

                if (i < inputFields.size()) {
                    WebElement inputField = inputFields.get(i);  // Lấy trường input tương ứng

                    // Đợi phần tử có thể tương tác

                    inputField.click();
                    inputField.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);
                    // Làm sạch trường trước khi nhập giá trị mới
                    inputField.sendKeys(stock[i]);  // Nhập giá trị vào trường
                    System.out.println("Đã nhập: " + stock[i] + " vào Branch thứ " + i);
                    WebElement inputName = wait.until(ExpectedConditions.elementToBeClickable(nameBranch));
                    inputName.click();
                    Thread.sleep(1000);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void priceProduct(String[] prices){
        //Manual Input
//        Actions actions = new Actions(driver);
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(listingPrice));
//        try {
//            actions.moveToElement(element).perform();
//        }catch (StaleElementReferenceException e){
//            element = wait.until(ExpectedConditions.elementToBeClickable(listingPrice));
//            actions.moveToElement(element).perform();
//        }
//        element.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
//        actions.click(element).perform();
//        actions.sendKeys("450000").perform();
//
//        //InputSellingPrice
//        actions = new Actions(driver);
//        element = wait.until(ExpectedConditions.elementToBeClickable(sellingPrice));
//        try {
//            actions.moveToElement(element).perform();
//        }catch (StaleElementReferenceException e){
//            element = wait.until(ExpectedConditions.elementToBeClickable(sellingPrice));
//            actions.moveToElement(element).perform();
//        }
//        element.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
//        actions.click(element).perform();
//        actions.sendKeys("450000").perform();
        //Auto Input
        // Đợi cho trang web tải xong (tùy chỉnh thời gian hoặc sử dụng WebDriverWait để tối ưu hơn)
        try {
            // Tìm tất cả các phần tử có class giống "form-control cur-input cur-input--non-unit"
            List<WebElement> inputFields = driver.findElements(allPrice);

            // Kiểm tra xem có bao nhiêu trường input
            System.out.println("---------------------------------");
            System.out.println("Số trường Giá sản phẩm tìm thấy: " + inputFields.size());
            // Nhập các giá trị vào tất cả các trường


            // Duyệt qua danh sách các input và nhập giá trị tương ứng
            for (int i = 0; i < prices.length; i++) {
                // Tìm lại tất cả các input field mỗi lần cần nhập
                inputFields = driver.findElements(allPrice);
                System.out.println("Price được nhập vào ở vị trí thứ: " + i);
                if (i < inputFields.size()) {
                    WebElement inputField = inputFields.get(i);  // Lấy trường input tương ứng

                    // Đợi phần tử có thể tương tác
                    wait.until(ExpectedConditions.elementToBeClickable(inputField));

                    inputField.clear();  // Làm sạch trường trước khi nhập giá trị mới
                    inputField.sendKeys(prices[i]);  // Nhập giá trị vào trường
                    System.out.println("Đã nhập: " + prices[i] + " vào trường thứ " + i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
//        WebElement checkonApp = driver.findElement(onApp);
//        checkonApp.click();

    }
    public void SaveProduct () {
        WebElement clickSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveProduct));
        clickSave.click();
        if (clickSave != null) {
            System.out.println("Thêm/Sửa sản phẩm thành công");
        }
        else {
            System.out.println("Thêm/sửa sản phẩm thất bại");
        }
        System.out.println("-----------------------------------");
    }

    public void closePopupCreateProduct () {
        WebElement clickClosebtn = wait.until(ExpectedConditions.elementToBeClickable(btnClosePopupCreateProduct));
        clickClosebtn.click();
        if (clickClosebtn != null) {
            System.out.println("Tắt popup thành công");

        }
        else {
            System.out.println("Tắt popup thất bại");
        }
    }
}
