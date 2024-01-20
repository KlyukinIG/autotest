package tests.ru.imgbb.com.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainPage {

    @Step("Нажимает кнопку входа в аккаунт")
    public MainPage singInButton() {
        $("#top-bar-signin").click();
        $(".header").shouldHave(text("Войти"));
        return this;
    }


    @Step("Открывает главную страницу сайта")
    public MainPage openMainPage() {
        open("https://ru.imgbb.com");
        return this;
    }

    @Step("Загружает картинку")
    public MainPage uploadPicture(String path) {
        $("input#anywhere-upload-input.hidden-visibility").uploadFromClasspath(path);
        $("button[data-action=upload]").click();
        return this;
    }

    @Step("Проверяет что картинка успешно загружена")
    public MainPage verificationResult() {
        $x("//div[@class='heading'][text()='Загрузка завершена']").shouldHave(text("Загрузка завершена"));
        $("[for=uploaded-embed-toggle]").shouldHave(text("Коды для встраивания"));
        return this;
    }

    @Step("Проверяет заголовок страницы")
    public MainPage verificationTitle(String title) {
        String expectedTitle = title;
        String actualTitle = title();
        assertThat(actualTitle).isEqualTo(expectedTitle);
        return this;
    }

}
