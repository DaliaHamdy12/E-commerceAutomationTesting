package Pages;

import StepDefinition.Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P2_LoginPage {
    public WebElement LoginLink()
    {
        return Mouse.driver.findElement(By.className("ico-login"));

    }
    public WebElement Email()
    {
        return Mouse.driver.findElement(By.name("Email"));

    }
    public WebElement Password()
    {
        return Mouse.driver.findElement(By.id("Password"));

    }
    public WebElement LoginBTN()
    {
        return Mouse.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));

    }
}
