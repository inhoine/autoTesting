import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Run  extends baseTest{
    WebDriver driver;


    @BeforeMethod
    void setUp() {
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        new Login(driver).login(userName, passWord);
    }
    @Test
    void homePage(){
        new goWallet(driver).eyesWallet();
    }
    @Test
    void createProduct() throws InterruptedException {
        new Product(driver).menuProduct();
        new Product(driver).createProduct();
        new Product(driver).stockProduct(stockBranch1, stockBranch2);
        new Product(driver).priceProduct();
    }
    @AfterClass
    void tearDown(){
//        driver.quit();
    }
}
