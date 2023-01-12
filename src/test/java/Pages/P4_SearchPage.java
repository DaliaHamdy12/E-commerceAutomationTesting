package Pages;

import StepDefinition.Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P4_SearchPage {
    public WebElement Search()
    {
        return Mouse.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement SearchProduct()
    {
        return Mouse.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement SearchBTN()
    {
        return Mouse.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

}
