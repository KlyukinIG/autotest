package tests.ru.imgbb.com.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.ru.imgbb.com.config.BaseConfigTests;
import tests.ru.imgbb.com.pages.MainPage;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UploadFileTest extends BaseConfigTests {


    @Feature("Загрузка файла")
    @Story("Пользователь загружает файл без входа в аккаунт")
    @DisplayName("Успешная загрузка файла без логина")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Klyukin I.G.")
    @Test
    void successfulFileUploadWithOutLogin() {
        mainPage.openMainPage();
        mainPage.uploadPicture(PICTURE);
        mainPage.verificationResult();
    }

    @Feature("Загрузка файла")
    @Story("Пользователь загружает файл поcле входа в аккаунт")
    @DisplayName("Успешная загрузка файла после входа в аккаунт")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Klyukin I.G.")
    @Test
    void successfulFileUploadWithLogin() {
        String login = "sanya.volk.2008@mail.ru";
        String password = "Qq1@qweasdzxc";

        mainPage.openMainPage();
        mainPage.singInButton();
        loginPage.setUserName(login);
        loginPage.setPassword(password);
        loginPage.clickButtonEnterToAccount();
        userPage.verificationSuccessfulLogin("Hocaken355");
        mainPage.verificationTitle("Hocaken355 (hocaken355) — ImgBB");
        mainPage.uploadPicture(PICTURE);
        mainPage.verificationResult();
    }
}
