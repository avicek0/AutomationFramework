package pages;
import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    private WebDriver driver;

    public CheckOutPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"main\"]/section/div/div[2]/div/div[1]/div/div/div[2]/div[3]/button/span")
    private WebElement addToCartFirstProduct;

    @FindBy(xpath = "//*[@id=\"main\"]/section/div/div[2]/div/div[2]/div/div/div[2]/div[3]/button/span")
    private WebElement addToCartSecondProduct;

    @FindBy(xpath = "//*[@id=\"navbar_top\"]/div/div/div[3]/div/div")
    private WebElement cart;

    @FindBy(xpath = "/html/body/main/div/form/div/div/div[1]/div[2]/a")
    private WebElement continueShopping;

    @FindBy(xpath = "//*[@id=\"main\"]/section/div/div[2]/div/div[3]/div/div/div[1]/a/img")
    private WebElement addToCartThirdProduct;

    @FindBy(xpath = "//*[@id=\"navbar_top\"]/div/div/div[3]/div/div")
    private WebElement cartAgain;

    @FindBy(xpath = "/html/body/main/div/form/div/div/div[2]/div/button")
    private WebElement proceedToPayment;

    @FindBy(xpath = "/html/body/main/div/form/div/div/div[1]/div/button")
    private WebElement billingAddressFormFillUp;

    @FindBy(xpath = "//*[@id=\"FullName\"]")
    private WebElement fullName;

    @FindBy(xpath = "//*[@id=\"PhoneNo\"]")
    private WebElement phNo;

    @FindBy(xpath = "//*[@id=\"Line1\"]")
    private WebElement addressFirst;

    @FindBy(xpath = "//*[@id=\"Line2\"]")
    private WebElement addressSecond;

    @FindBy(xpath = "//*[@id=\"LandMark\"]")
    private WebElement nearestPlace;

    @FindBy(xpath = "//*[@id=\"AppendAddress\"]/form/div/div[2]/div[6]/button[1]")
    private WebElement saveChanges;

    @FindBy(xpath = "//*[@id=\"dba2ad9e-dd2e-4b1b-810f-38339f7e6fd5\"]")
    private WebElement cashOnDelivery;

    @FindBy(xpath = "/html/body/main/div/form/div/div/div[2]/div[2]/button")
    private WebElement placeOrder;


    public void checkout(){
        addToCartFirstProduct.click();
        addToCartSecondProduct.click();
        cart.click();
        continueShopping.click();
        addToCartThirdProduct.click();
        cartAgain.click();
        proceedToPayment.click();
        billingAddressFormFillUp.click();
        fullName.sendKeys("Abh shoes");
        phNo.sendKeys("9860675061");
        addressFirst.sendKeys("Suryabinayak-4, Bhaktapur");
        addressSecond.sendKeys("Mid-Baneshwor-3, Kathmandu");
        nearestPlace.sendKeys("Loft Lounge");
        saveChanges.click();
        cashOnDelivery.click();
        placeOrder.click();

    }

}


