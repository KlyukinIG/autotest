package tests.sberbank;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class FindCredits {

    @BeforeAll
    static void beforeALL(){
        Configuration.browserSize = "1920x1080";
    }


    @Test
    void findCredits(){
        open("http://www.sberbank.ru");
        $("[aria-label=Кредиты]").click();
        $x("//div/ul/li/a[@data-cga_click_top_menu='Кредиты_Кредит на любые цели_type_important']").click();
        $("div span").shouldHave(text("Рассчитать кредит")).click();
        sleep(5000);
    }
}
