package tests.ru.imgbb.com.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.ru.imgbb.com.config.BaseConfig;

public class DownloadFile extends BaseConfig{


    @Feature("Загрузка файла")
    @Story("Пользователь загружает файл без входа в аккаунт")
    @DisplayName("Успешная загрузка файла без логина")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Мой")
    @Tag("Blocker")
    @Tag("Upload")
    @Tag("imgbb")
    @Test
    void successfulFileUploadWithOutLogin(){
        mainPage.openMainPage();
        mainPage.uploadPicture(PICTURE);
        mainPage.verificationResult();
    }

    @Feature("Загрузка файла")
    @Story("Пользователь загружает файл поле входа в аккаунт")
    @DisplayName("Успешная загрузка файла после входа в аккаунт")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Мой")
    @Tag("Blocker")
    @Tag("Upload")
    @Tag("imgbb")
    @Test
    void successfulFileUploadWithLogin(){
        String login = "sanya.volk.2008@mail.ru";
        String password = "Qq1@qweasdzxc";

        mainPage.openMainPage();
        loginPage.singInButton();
        loginPage.setUserName(login);
        loginPage.setPassword(password);
        loginPage.clickButtonEnterToAccount();
        loginPage.verificationSuccessfulLogin();
        mainPage.uploadPicture(PICTURE);
        mainPage.verificationResult();
    }
}
