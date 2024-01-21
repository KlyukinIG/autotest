package tests.ru.imgbb.com.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import tests.ru.imgbb.com.pages.LoginPage;
import tests.ru.imgbb.com.pages.MainPage;
import tests.ru.imgbb.com.pages.UserPage;

public class BaseConfigTests {

    protected MainPage mainPage = new MainPage();
    protected LoginPage loginPage = new LoginPage();
    protected UserPage userPage = new UserPage();
    public final String PICTURE = "imgbbfiles/test.jpg";


    @BeforeAll
    public static void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    @AfterEach
    public void afterTest() {
        Attach.screenshot("screen");
    }

}
