package tests.mvideo;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
public class SearchItem {


    @Test
    void searchIpnone14(){
        open("https://www.mvideo.ru");
        $("div.input__container input").setValue("iphone14");
        $("div").$("[type=search").click();
        $x("//div[text()=' Понятно ']").click();
        $x("//div/a[text()=' Смартфон Apple iPhone 14 128GB nanoSim/eSim Starlight ']").click();
        $("button.cart-button").click();
        sleep(5000);


    }

}
