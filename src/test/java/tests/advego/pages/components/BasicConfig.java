package tests.advego.pages.components;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import tests.advego.pages.LoginForm;

import static com.codeborne.selenide.Selenide.open;

public class BasicConfig {

    //Объекты элементов сайта
    protected LoginForm loginform = new LoginForm();

    @BeforeAll
    public static void beforALL(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://advego.com";
    }

}