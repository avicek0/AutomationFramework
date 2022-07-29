import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import pages.CheckOutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;
import utils.frameworkProperties;

import java.lang.String;

public class Main {
    public static void main(String[] args)
    {
        frameworkProperties frameworkPRoperties = new frameworkProperties();
        DriverSingleton.getInstance(frameworkPRoperties.getProperty("browser"));
        WebDriver driver = DriverSingleton.getDriver();

        driver.get("https://dreamsmultimart.com/");

        HomePage homePage = new HomePage();
        homePage.clickAccount();
        homePage.clickRegisterButton();

        SignUpPage signUpPage = new SignUpPage();
        signUpPage.signUp();

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        CheckOutPage checkoutPage = new CheckOutPage();
        checkoutPage.checkout();

    }
}
