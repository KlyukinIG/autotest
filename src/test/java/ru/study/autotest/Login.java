package ru.study.autotest;

import auto.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.AllureJunit4;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(AllureJunit4.class)
public class Login {

    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setUP() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.getUrl();
    }

    @Test
    @DisplayName("=Тест логина")
    @Story("Успешное лагирование пользователя")
    @Description("Тест проверки функциональности логирования")
    public void loginTest() {
        loginPage.pressMainButtonForSingIn();
        loginPage.enterUserEmail("samanoch@bk.ru");
        loginPage.enterUserPassword("Qq1@qweasdzxc");
        loginPage.pressButtonForEnter();
    }



    @After
    public void tearDown(){
        if(driver != null) {
            driver.quit();
        }
    }

}
