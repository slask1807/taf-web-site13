package by.itacademy.shlesin;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestPizzatempo {
    WebDriver driver;

    @BeforeEach
    public void start(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
            }
//    @AfterEach
//    public void finish() {
//        driver.quit();
//    }
}
