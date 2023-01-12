package Pages;

import StepDefinition.Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P1_RegistrationPage {
    public WebElement RegisterLink()
    {
        return Mouse.driver.findElement(By.className("ico-register"));

    }
    public WebElement FirstName()
    {
        return Mouse.driver.findElement(By.cssSelector("input[id^=\"FirstName\"]"));

    }
    public WebElement LastName()
    {
        return Mouse.driver.findElement(By.cssSelector("input[id^=\"LastName\"]"));

    }
    public WebElement Email()
    {
        return Mouse.driver.findElement(By.name("Email"));

    }
    public WebElement Password()
    {
        return Mouse.driver.findElement(By.id("Password"));

    }
    public WebElement ConfirmPassword()
    {
        return Mouse.driver.findElement(By.id("ConfirmPassword"));

    }
    public WebElement RegisterBTN()
    {
        return Mouse.driver.findElement(By.name("register-button"));

    }

}
