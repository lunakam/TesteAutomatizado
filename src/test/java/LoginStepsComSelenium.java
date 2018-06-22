import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class LoginStepsComSelenium {

    private WebDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/luna/Documents/ProjetoAutomacaoJava/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void byeBye() {
        driver.close();
    }

    @Test
    public void loginValido() {

        //@Given("^I have accessed the site$")
        driver.get("https://the-internet.herokuapp.com/login");

        //@When("^I type a valid email in email field$")
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("tomsmith");

        //@When("^I type a valid password in password field$")
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        // @When("^I click 'Continue'$")
        driver.findElement(By.className("radius")).click();

        //@Then("^I should be redirect to the secure area$")
        String secureArea = driver.findElement(By.className("example")).getAttribute("innerText");

        Assert.assertEquals("Secure Area", secureArea.split("\n")[0]);
        Assert.assertEquals("Welcome to the Secure Area. When you are done click logout below.", secureArea.split("\n")[1]);

    }

    @Test
    public void insertWrongPassword() {
        //@Given("^I have accessed the site$")
        driver.get("https://the-internet.herokuapp.com/login");

        //@When("^I type a valid email in email field$")
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("tomsmith");

        //@When("^I type an invalid password in password field$")
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("SenhaErradíssima!");

        // @When("^I click 'Continue'$")
        driver.findElement(By.className("radius")).click();

        //@Then("^I should see an error message$")
        Assert.assertEquals("Your password is invalid!", driver.findElement(By.id("flash")).getText().trim().split("\n")[0]);

        //@Then("^I shouldn't see the page redirect$")
        Assert.assertEquals("https://the-internet.herokuapp.com/login", driver.getCurrentUrl());

    }

    @Test
    public void insertWrongLogin() {
        //@Given("^I have accessed the site$")
        driver.get("https://the-internet.herokuapp.com/login");

        //@When("^I type an invalid email in email field$")
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("login erradíssimo");

        //Continue esse teste
        //Faça os próximos: inserWrongEmailAndPassword, insertnoData.

    }
}
