import org.openqa.selenium.By;

public class pathFile {
    //Login Page
    By usernametxt = By.xpath("(//input[@name= 'username'])[1]");
    By pwdtxt = By.xpath("(//input[@name= 'password'])[1]");
    By login = By.xpath("(//button[@type= 'submit'])[1]");
    //Go Wallet
    By getText = By.xpath("//div[@class = 'title d-none d-lg-block d-md-block']");
    By icgoWallet = By.xpath("(//div[@id= 'wallet-balance']/div)[2]");
    By textGowallet = By.xpath("//span[@class= 'q68SgCTxTQYGNh1eF0j62w==']");
    By TotalgoWallet = By.xpath("//div[@class= ' C0pXmfKbDwobjSqDnn032Q== color-white']");
    //Create Product
    By selectMenuProdcut = By.xpath("(//div[@class= ' menu gs-atm__scrollbar-1']/div)[5]");
    By closePopupVideo = By.xpath("//div[@class = 'v5Um9Ms0fy+rVulr6jyrVQ==']");
    By createProductbutton = By.xpath("(//button[@class= 'gs-button  gs-button__green gs-button--undefined '])[1]");
    By productName = By.xpath("//input[@name = 'productName']");
    By typeImg = By.xpath("//input[@accept = 'image/jpeg,image/png,image/gif']");
    //Stock
    By fieldstockProduct = By.xpath("(//input[@class='form-control cur-input cur-input--non-unit'])[2]");
    By nameBranch1 = By.xpath("(//div[@class= 'font-weight-500 col-sm-7'])[1]");
    //AllFieldStock
    By allStockOfBranch = By.xpath("//input[@class= 'form-control cur-input cur-input--non-unit']");
    By fieldstockProduct2 = By.xpath("(//input[@class='form-control cur-input cur-input--non-unit'])[3]");
    By nameBranch2 = By.xpath("(//div[@class= 'font-weight-500 col-sm-7'])[2]");
    By nameBranch = By.xpath("(//div[@class= 'font-weight-500 col-sm-7'])[1]");
    //Price
    By listingPrice = By.xpath("(//input[@class ='form-control cur-input cur-input--unit'])[1]");
    By sellingPrice = By.xpath("(//input[@class ='form-control cur-input cur-input--unit'])[2]");
    //xPathAllPrice
    By allPrice = By.xpath("//input[@class = 'form-control cur-input cur-input--unit']");

    //Demension
    By fieldWeight = By.xpath("(//input[@class = 'form-control cur-input '])[1]");
    By fieldLength = By.xpath("(//input[@class = 'form-control cur-input '])[2]");
    By fieldWidth = By.xpath("(//input[@class = 'form-control cur-input '])[3]");
    By fieldHeight = By.xpath("(//input[@class = 'form-control cur-input '])[4]");
    //BtnSaveProduct
    By btnSaveProduct = By.xpath("//button[@data-testid = 'desktop-saveBtn']");
    //btnClosePopupCreateProduct
    By btnClosePopupCreateProduct = By.xpath("//button[@data-testid = 'closeBtn']");
    //First on Product List
    By firstItem = By.xpath("(//tr[@class = 'gs-table-body-items cursor--pointer gsa-hover--gray'])[1]");
    //Click add variations
    By textAddVariation = By.xpath("(//span[@class= 'gs-fake-link '])[1]");
    //Variation Name
    By fieldVariationName = By.xpath("//div[@class = 'row variation-item-row']/div[2]/div/div/input");
    //Variation value
    By fieldVariationValue = By.xpath("//input[@id= 'box-input-id']");
    //Select ImgVariation button
    By imgVariation = By.xpath("(//td[@class = 'align-middle'])[2]/img");
    // Img
    By imageVar = By.xpath("//div[@class = 'image-view image-widget__image-item ']/img");
    // Select Image
    By selectBtnImg = By.xpath("//div[@class = 'modal-content']/div[@class = 'image-widget__container modal-body']/div/div/div/button/span");
    // Button Select Img
    By btnSelectImg = By.xpath("//div[@class = 'modal-footer']/button[2]");
    // Stock Variation
    By stockVariation = By.xpath("(//td[@class = 'align-middle text-center']/span[@class = 'gs-fake-link '])[1]");
    // InputStockVar
    By inputStockField = By.xpath("//div[@class = 'd-flex form-group']/div/input[@type = 'text']");
    // UpdateStockVar
    By btnUpdateStockVar = By.xpath("//div[@class = 'modal-footer']/button[2]");
    // Loop Branch
    By fieldPrice = By.xpath("//input[@class= 'form-control cur-input cur-input--unit']");
    //Platform
    By onApp = By.xpath("//label[@class ='uik-checkbox__wrapper']/input[@name = 'onApp']");






}
