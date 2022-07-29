package pages;

import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "/html/body/main/div/div[1]/div/div/div/div/ul/li[1]/a")
    private WebElement redirectToHome;

    @FindBy(xpath = "//*[@id=\"userinfodropdown\"]")
    private WebElement myAccountButton;

    @FindBy(xpath = "//*[@id=\"loginLink\"]")
    private WebElement nowLogin;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    private WebElement emailAddressField;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    private WebElement passwordLoginField;

    @FindBy(xpath = "/html/body/main/div/section/form/div[2]/div[4]/button")
    private WebElement signInButton;

    public void login(){

        redirectToHome.click();
        myAccountButton.click();
        nowLogin.click();
        emailAddressField.sendKeys("arachnids.neupane@gmail.com".toString());
        passwordLoginField.sendKeys("Don't know1".toString());
        signInButton.click();

        WebDriverWait wait = new WebDriverWait(driver,30);
    }





}


