import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

   // public static WebDriver driver = null;
    public static WebDriver driver;

    public void initialize() {

        System.setProperty("webdriver.chrome.driver", "/home/luna/Documents/ProjetoAutomacaoJava/chromedriver");


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
