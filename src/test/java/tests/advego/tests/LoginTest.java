package tests.advego.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.advego.pages.components.BasicConfig;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class LoginTest extends BasicConfig{


    @DisplayName("Тест на успешный логин пользователя")
    @Tag("Blocker")
    @Tag("Login")
    @Test
    void successfulLogin(){
        String name = "sanya.volk.2008@mail.ru";
        String password = "8hlkuet9Q@";

        loginform.openUrl()
                .ClickSingUpButtom()
                .setUserName(name)
                .setUserPassword(password)
                .ClickButtomForEnter();
        // Валидация успешного входа
        $("h3 .center").shouldHave(text("Рады приветствовать вас на Адвего!"));
    }

    @DisplayName("Тест на ввод некорреткного пароля")
    @Tag("Blocker")
    @Tag("Login")
    @Test
    void notSuccessfulLogin(){
        String name = "sanya.volk.2008@mail.ru";
        String password = "123123121";

        loginform.openUrl()
                .ClickSingUpButtom()
                .setUserName(name)
                .setUserPassword(password)
                .ClickButtomForEnter();
        // Валидация , что система не приняла данные
        $("div .error").shouldHave(text("Неверный e-mail или пароль"));
    }


}


