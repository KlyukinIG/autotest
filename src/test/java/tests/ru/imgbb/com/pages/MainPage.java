package tests.ru.imgbb.com.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

//    @Step("Открываем главную страницу")

    public MainPage openMainPage() {
        open("https://ru.imgbb.com");
        return this;
    }

//    @Step("Загружаем картинку")
//document.querySelectorAll("input[type=file]"); если элемент скрыт
    public MainPage uploadPicture(String path) {
        $("input#anywhere-upload-input.hidden-visibility").uploadFromClasspath(path);
        $("button[data-action=upload]").click();
        return this;
    }

//    @Step("Проверяем что картинка успешно загружена")
    public MainPage verificationResult() {
        $x("//div[@class='heading'][text()='Загрузка завершена']").shouldHave(text("Загрузка завершена"));
        $("[for=uploaded-embed-toggle]").shouldHave(text("Коды для встраивания"));
        return this;
    }

}
