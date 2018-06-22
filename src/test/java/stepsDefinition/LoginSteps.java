package stepsDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

import java.sql.Driver;


@RunWith(Cucumber.class)
public class LoginSteps {
    public static WebDriver driver;

    private LoginPage loginPage;
    public static String username = "tomsmith";
    public static String password = "SuperSecretPassword!";
    public static String url = "https://the-internet.herokuapp.com/login";

    @Before
    public void setUp() {
        loginPage = new LoginPage();
        loginPage.openSite(this.url);
    }

    @After
    public void byeBye() {
        driver.close();
    }

    @Given("^I have accessed the site$")
    public void i_have_accessed_the_site() throws Throwable {
    }

    @When("^I type a valid email in email field$")
    public void i_type_a_valid_email_in_email_field() throws Throwable {
        loginPage.fillUsername(this.username);
    }

    @And("^I type a valid password in password field$")
    public void i_type_a_valid_password_in_password_field() throws Throwable {
        loginPage.fillPassword(this.password);
    }

    @And("^I click 'Login'$")
    public void i_click_login() throws Throwable {
        loginPage.clickLoginButton();
    }

    @Then("^I should be redirect to the secure area$")
    public void i_should_be_redirect_to_the_secure_area() throws Throwable {
        loginPage.secureAreaMessage();
    }

}

