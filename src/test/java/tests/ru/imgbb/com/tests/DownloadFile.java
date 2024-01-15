package tests.ru.imgbb.com.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DownloadFile {


    @DisplayName("Успешная загрузка файла без логина")
    @Tag("Blocker")
    @Tag("Upload")
    @Test
    void successfulFileUploadWhithOutLogin(){
        open("https://ru.imgbb.com");
        //document.querySelectorAll("input[type=file]"); если элемент скрыт
        $("input#anywhere-upload-input.hidden-visibility").uploadFromClasspath("imgbbfiles/test.jpg");
        $("button[data-action=upload]").click();
        $x("//div[@class='heading'][text()='Загрузка завершена']").shouldHave(text("Загрузка завершена"));
        $("[for=uploaded-embed-toggle]").shouldHave(text("Коды для встраивания"));

    }

    @DisplayName("Успешная загрузка файла после входа в аккаунт")
    @Tag("Blocker")
    @Tag("Upload")
    @Test
    void successfulFileUploadWithLogin(){
        String login = "sanya.volk.2008@mail.ru";
        String password = "Qq1@qweasdzxc";

        open("https://ru.imgbb.com");
        $("#top-bar-signin").click();
        $(".header").shouldHave(text("Войти"));
        $("#login-subject").setValue(login);
        $("#login-password").setValue(password);
        $("[type=submit]").click();
        $("#top-user").shouldHave(text("Hocaken355"));
        //document.querySelectorAll("input[type=file]"); если элемент скрыт
        $("input#anywhere-upload-input.hidden-visibility").uploadFromClasspath("imgbbfiles/test.jpg");
        $("button[data-action=upload]").click();
        $x("//div[@class='heading'][text()='Загрузка завершена']").shouldHave(text("Загрузка завершена"));
        $("[for=uploaded-embed-toggle]").shouldHave(text("Коды для встраивания"));

    }
}
