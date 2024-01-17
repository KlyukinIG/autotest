package tests.ru.imgbb.com.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


   public LoginPage singInButton() {
        $("#top-bar-signin").click();
        $(".header").shouldHave(text("Войти"));
       return this;
    }

    public LoginPage setUserName(String login) {
        $("#login-subject").setValue(login);
        return this;
    }

    public LoginPage setPassword(String password) {
        $("#login-password").setValue(password);
        return this;
    }

    public LoginPage clickButtonEnterToAccount() {
        $("[type=submit]").click();
        return this;
    }

    public LoginPage verificationSuccessfulLogin() {
        $("#top-user").shouldHave(text("Hocaken355"));
        return this;
    }

}
