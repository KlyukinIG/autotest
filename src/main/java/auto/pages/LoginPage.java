package auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends MainPage{

   private final WebDriver driver;
   private final By userEmailField = By.id("login-form-login");
   private final By userPasswordField = By.id("login-form-pwd");
   private final By enterButton = By.id("login_ok");

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void getUrl() {
        driver.get(mainUrl);
    }

    public void enterUserEmail(String usermail){
        WebElement emailField = driver.findElement(userEmailField);
        emailField.sendKeys(usermail);
    }

    public void enterUserPassword(String password) {
        WebElement passField = driver.findElement(userPasswordField);
        passField.sendKeys(password);

    }

    @Override
    public void pressMainButtonForSingIn() {
        WebElement buttonForSingUp = driver.findElement(mainButtonForSingIn);
        buttonForSingUp.click();
    }

    public void pressButtonForEnter() {
        WebElement buttonForEnter = driver.findElement(enterButton);
        buttonForEnter.click();
    }

}
