package tests.ru.imgbb.com.tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.ru.imgbb.com.baseconfig.BaseConfig;

public class Login extends BaseConfig {


    @DisplayName("Успешный вход пользователя")
    @Tag("Blocker")
    @Tag("Login")
    @Test
    void successfulLogin(){
        String login = "sanya.volk.2008@mail.ru";
        String password = "Qq1@qweasdzxc";

        mainPage.openMainPage();
        loginPage.singInButton();
        loginPage.setUserName(login);
        loginPage.setPassword(password);
        loginPage.clickButtonEnterToAccount();
        loginPage.verificationSuccessfulLogin();
    }
}
