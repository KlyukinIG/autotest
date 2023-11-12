import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.class)
public class FirstTest {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    @Order(1)
    @DisplayName("Простое открытие страницы сайт")
    @Story("Открыть страницу")
    @Description("Открывается главная страница сайта")
    public void getUrl(){
        driver.get("https://advego.com");
    }

    @AfterEach
    public void closeWindows() {
        if (driver != null) {
            driver.quit();
        }
    }
}
