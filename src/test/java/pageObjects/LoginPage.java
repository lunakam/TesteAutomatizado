package pageObjects;

import cucumber.api.junit.Cucumber;
import drivers.MyDriver;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;


@RunWith(Cucumber.class)
public class LoginPage {


    public void fillUsername(String username) {
        MyDriver.driver.findElement(By.id("username")).clear();
        MyDriver.driver.findElement(By.id("username")).sendKeys(username);

    }

    public void fillPassword(String password) {

        MyDriver.driver.findElement(By.id("password")).clear();
        MyDriver.driver.findElement(By.id("password")).sendKeys(password);

    }

    public void clickLoginButton() {
        MyDriver.driver.findElement(By.className("radius")).click();

    }

    public void openSite(String url) {

        MyDriver.driver.get(url);

    }

    public void closeSite() {
        MyDriver.driver.close();

    }


    public boolean secureAreaMessage() {
        if ("Secure Area" == MyDriver.driver.findElement(By.className("example")).getAttribute("innerText").split("\n")[0] && "Welcome to the Secure Area. When you are done click logout below." == MyDriver.driver.findElement(By.className("example")).getAttribute("innerText").split("\n")[1])
            return true;
        else {
            return false;
        }
    }

}
