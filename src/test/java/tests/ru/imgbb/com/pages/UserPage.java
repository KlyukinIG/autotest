package tests.ru.imgbb.com.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class UserPage {
    @Step("Проверяет, что на странице указан ник пользователя после успешного входа")
    public UserPage verificationSuccessfulLogin(String nickname) {
        $("#top-user").shouldHave(text(nickname));
        return this;
    }
}
