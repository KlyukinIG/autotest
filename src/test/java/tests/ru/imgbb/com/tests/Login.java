package tests.ru.imgbb.com.tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Login {


    @DisplayName("Успешный вход пользователя")
    @Tag("Blocker")
    @Tag("Login")
    @Test
    void successfulLogin(){
        String login = "";
        String password = "";
        String expectedUrl = "https://hocaken355.imgbb.com";

        open("https://ru.imgbb.com");
        $("#top-bar-signin").click();
        $(".header").shouldHave(text("Войти"));
        $("#login-subject").setValue("sanya.volk.2008@mail.ru");
        $("#login-password").setValue("Qq1@qweasdzxc");
        $("[type=submit]").click();
        $("#top-user").shouldHave(text("Hocaken355"));

    }

}
