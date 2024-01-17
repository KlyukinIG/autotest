package tests.ru.imgbb.com.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.ru.imgbb.com.baseconfig.BaseConfig;
import tests.ru.imgbb.com.pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DownloadFile extends BaseConfig{


    @DisplayName("Успешная загрузка файла без логина")
    @Tag("Blocker")
    @Tag("Upload")
    @Test
    void successfulFileUploadWithOutLogin(){
        mainPage.openMainPage();
        mainPage.uploadPicture(PICTURE);
        mainPage.verificationResult();
    }

    @DisplayName("Успешная загрузка файла после входа в аккаунт")
    @Tag("Blocker")
    @Tag("Upload")
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
