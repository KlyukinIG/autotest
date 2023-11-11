package auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class MainPage {
    WebDriver driver;
    protected String mainUrl = "https://advego.com";
    protected  By mainButtonForSingIn = By.className("login");


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    abstract void pressMainButtonForSingIn();

}
