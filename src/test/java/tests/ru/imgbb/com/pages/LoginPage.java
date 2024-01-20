package tests.ru.imgbb.com.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginPage {


    @Step("Форма входа: Вводит имя пользователя")
    public LoginPage setUserName(String login) {
        $("#login-subject").setValue(login);
        return this;
    }

    @Step("Форма входа: Вводит пароль пользователя")
    public LoginPage setPassword(String password) {
        $("#login-password").setValue(password);
        return this;
    }

    @Step("Форма входа: Нажимает кнопку войти в аккаунт")
    public LoginPage clickButtonEnterToAccount() {
        $("[type=submit]").click();
        return this;
    }



}
