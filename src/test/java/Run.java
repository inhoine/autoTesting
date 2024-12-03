import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Run  extends baseTest{
    WebDriver driver;



    @BeforeClass
    void setUp() {
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        new Login(driver).login(userName, passWord);
    }
//    @Test
//    void homePage(){
//        new goWallet(driver).eyesWallet();
//    }
    @Test
    void createProduct() throws InterruptedException {
        Product product = new Product(driver);
        product.menuProduct();
        product.createProduct();
        product.stockProduct(stock);
//        System.out.println("Thêm stock thành công");
        product.priceProduct(prices);
//        System.out.println("Thêm giá thành công");
        product.demension();
        product.SaveProduct();
        product.closePopupCreateProduct();
//        System.out.println("---------------------------------");
//        System.out.println("Tạo sản phẩm thành công");
    }
    @Test
    void editProductNormal() throws InterruptedException {
        editProduct editProduct = new editProduct(driver);
        editProduct.selectItem();
        editProduct.editPrice();
        editProduct.addVariation();
        editProduct.addImgVariation();
        editProduct.addStockVariation();
        new Product(driver).SaveProduct();
        new Product(driver).closePopupCreateProduct();
    }
    @AfterClass
    void tearDown() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.quit();
    }
}
