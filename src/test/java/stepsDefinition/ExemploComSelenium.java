package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExemploComSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/luna/Documents/ProjetoAutomacaoJava/lunaticeu-TesteAutomatizado/src/test/resources/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");


        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        //comando abaixo somente para debug, não sobe para produção
        System.out.println("Page title is: " + driver.getTitle());

        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());

        //Close the browser
        driver.quit();
    }
}
