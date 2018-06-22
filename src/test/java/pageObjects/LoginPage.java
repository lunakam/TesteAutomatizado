package pageObjects;

import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepsDefinition.LoginSteps;

import java.sql.Driver;


@RunWith(Cucumber.class)
public class LoginPage {



    public boolean fillUsername(String username) {

        LoginSteps.driver.findElement(By.id("username")).clear();
        LoginSteps.driver.findElement(By.id("username")).sendKeys(username);
        return true;
    }
    public boolean fillPassword(String password) {

        //@When("^I type a valid password in password field$")
        LoginSteps.driver.findElement(By.id("password")).clear();
        LoginSteps.driver.findElement(By.id("password")).sendKeys(password);
        return true;
    }

    public boolean clickLoginButton(){
        //@And("^I click 'Login'$")
        LoginSteps.driver.findElement(By.className("radius")).click();
        return true;
    }

    public boolean openSite(String url){

        LoginSteps.driver.get(url);

        return true;
    }

    //boolean dos Assert
    public boolean secureAreaMessage(){
        if("Secure Area"== LoginSteps.driver.findElement(By.className("example")).getAttribute("innerText").split("\n")[0] && "Welcome to the Secure Area. When you are done click logout below." == LoginSteps.driver.findElement(By.className("example")).getAttribute("innerText").split("\n")[1])
            return true;
        else{
            return  false;
        }
    }

}
