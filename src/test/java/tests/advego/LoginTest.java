package tests.advego;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class LoginTest {

    @Test
    void positiveLogin(){
        open("https://advego.com");
        $x("//div/ul/li/a[@class='login move_to_login']").click();
        $x("//div[@class='h2'][text()='Быстрый вход/регистрация']").shouldHave(text("Быстрый вход/регистрация"));
        $x("//input[@id='login-form-login']").setValue("sanya.volk.2008@mail.ru");
        $("[id=login-form-pwd]").setValue("Qq1@qweasdzxc@!!");
        $("a#login_ok").click();
    }

}


