package tests.ru.imgbb.com.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import tests.ru.imgbb.com.pages.LoginPage;
import tests.ru.imgbb.com.pages.MainPage;

public class BaseConfig {

    protected MainPage mainPage = new MainPage();
    protected LoginPage loginPage = new LoginPage();
    public final String PICTURE = "imgbbfiles/test.jpg";


    @BeforeAll
    public static void beforeALL() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.browserSize = "1920x1080";

    }
}
