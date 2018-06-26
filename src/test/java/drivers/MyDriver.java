package drivers;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MyDriver {
    public static WebDriver driver;

    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "/home/luna/Documents/ProjetoAutomacaoJava/chromedriver");
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
