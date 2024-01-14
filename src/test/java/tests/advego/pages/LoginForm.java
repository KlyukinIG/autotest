package tests.advego.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class LoginForm {

    private  SelenideElement SingUpButtom = $x("//div/ul/li/a[@class='login move_to_login']");
    private  SelenideElement userName = $x("//input[@id='login-form-login']");
    private  SelenideElement userPassword = $("[id=login-form-pwd]");
    private  SelenideElement buttomForEnter = $("a#login_ok");




   // URL сайта
    public LoginForm openUrl(){
        open("https://advego.com");
        return this;
    }

    // Кнопка входа в форму ввода пользовотельских данных
    public LoginForm ClickSingUpButtom() {
        SingUpButtom.click();
        return this;
    }

    // Поле логина
    public LoginForm setUserName(String name){
        userName.setValue(name);
        return this;
    }

    // Поле пароля
    public LoginForm setUserPassword(String password){
        userPassword.setValue(password);
        return this;
    }

    // Кнопка подверждения входа формы логина
    public LoginForm ClickButtomForEnter(){
        buttomForEnter.click();
        return this;
    }

}
