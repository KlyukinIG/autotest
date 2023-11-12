package ru.study.autotest;

import auto.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Login {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeEach
    public void setUP() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.getUrl();
    }

    @Test
    @Order(2)
    @DisplayName("Тест логина1")
    @Story("Успешное лагирование пользователя")
    @Description("Тест проверки функциональности логирования")
    public void loginTest() {
        loginPage.pressMainButtonForSingIn();
        loginPage.enterUserEmail("samanoch@bk.ru");
        loginPage.enterUserPassword("Qq1@qweasdzxc");
        loginPage.pressButtonForEnter();
    }


    @Test
    @Order(1)
    @DisplayName("Тест логина2")
    @Story("Успешное лагирование пользователя")
    @Description("Тест проверки функциональности логирования")
    public void loginTest2() {
        loginPage.pressMainButtonForSingIn();
        loginPage.enterUserEmail("samanoch@bk.ru");

    }


    @AfterEach
    public void tearDown(){
        if(driver != null) {
            driver.quit();
        }
    }

}
