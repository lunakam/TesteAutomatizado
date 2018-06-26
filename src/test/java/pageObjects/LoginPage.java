package pageObjects;

import cucumber.api.junit.Cucumber;
import drivers.MyDriver;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;


@RunWith(Cucumber.class)
public class LoginPage {


    public boolean fillUsername(String username) {

        MyDriver.driver.findElement(By.id("username")).clear();
        MyDriver.driver.findElement(By.id("username")).sendKeys(username);
        return true;
    }

    public boolean fillPassword(String password) {

        //@When("^I type a valid password in password field$")
        MyDriver.driver.findElement(By.id("password")).clear();
        MyDriver.driver.findElement(By.id("password")).sendKeys(password);
        return true;
    }

    public boolean clickLoginButton() {
        //@And("^I click 'Login'$")
        MyDriver.driver.findElement(By.className("radius")).click();
        return true;
    }

    public boolean openSite(String url) {

        MyDriver.driver.get(url);
        return true;
    }

    public boolean closeSite() {

        MyDriver.driver.close();
        return true;
    }

    //boolean dos Assert
    public boolean secureAreaMessage() {
        if ("Secure Area" == MyDriver.driver.findElement(By.className("example")).getAttribute("innerText").split("\n")[0] && "Welcome to the Secure Area. When you are done click logout below." == MyDriver.driver.findElement(By.className("example")).getAttribute("innerText").split("\n")[1])
            return true;
        else {
            return false;
        }
    }

}
