package pages;

import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUpPage {
    private WebDriver driver;

    public SignUpPage(){
        this.driver = DriverSingleton.getDriver();

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"Name\"]")
    private WebElement fullNameField;

    @FindBy(xpath = "//*[@id=\"PhoneNo\"]")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"ConfirmPassword\"]")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "/html/body/main/div/section/form/div[2]/div[6]/button")
    private WebElement signUpButton;

    public void signUp(){
        fullNameField.sendKeys("Chrome Face".toString());
        phoneNumberField.sendKeys("9860675061".toString());
        emailField.sendKeys("arachnids.neupane@gmail.com".toString());
        passwordField.sendKeys("Don't know1".toString());
        confirmPasswordField.sendKeys("Don't know1".toString());

        signUpButton.click();
    }





}

