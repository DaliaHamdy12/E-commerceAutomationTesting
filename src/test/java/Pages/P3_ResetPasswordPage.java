package Pages;

import StepDefinition.Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P3_ResetPasswordPage {
    public WebElement ForgetPassword()
    {
        return Mouse.driver.findElement(By.className("forgot-password"));
    }

    public WebElement Email()
    {
        return Mouse.driver.findElement(By.id("Email"));
    }
    public WebElement RecoverBTN()
    {
        return Mouse.driver.findElement(By.name("send-email"));
    }
}