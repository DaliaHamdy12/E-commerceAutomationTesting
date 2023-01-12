package Pages;

import StepDefinition.Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P5_SwitchCurrenciesPage {
    public WebElement USDollar()
    {
        return Mouse.driver.findElement(By.id("customerCurrency"));
    }
    public WebElement Euro()
    {
        return Mouse.driver.findElement(By.id("customerCurrency"));
    }

}
