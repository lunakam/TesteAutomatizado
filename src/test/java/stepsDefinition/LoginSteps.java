package stepsDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import drivers.MyDriver;
import org.junit.runner.RunWith;
import pageObjects.LoginPage;

@RunWith(Cucumber.class)
public class LoginSteps {
    private LoginPage loginPage;
    private MyDriver myDriver;

    public static String username = "tomsmith";
    public static String password = "SuperSecretPassword!";
    public static String url = "https://the-internet.herokuapp.com/login";

    public LoginSteps() {
    }

    @Before
    public void setUp() {
        myDriver = new MyDriver();
        myDriver.initialize();
        loginPage = new LoginPage();
        loginPage.openSite(this.url);
    }

    @After
    public void byeBye() {
        loginPage.closeSite();
    }

    @Given("^I have accessed the site$")
    public void i_have_accessed_the_site() {
        loginPage.secureAreaMessage();
    }

    @When("^I type a valid email in email field$")
    public void i_type_a_valid_email_in_email_field() {
        loginPage.fillUsername(this.username);
    }

    @And("^I type a valid password in password field$")
    public void i_type_a_valid_password_in_password_field() {
        loginPage.fillPassword(this.password);
    }

    @And("^I click 'Login'$")
    public void i_click_login() {
        loginPage.clickLoginButton();
    }

    @Then("^I should be redirect to the secure area$")
    public void i_should_be_redirect_to_the_secure_area() {
        loginPage.secureAreaMessage();
    }

}

