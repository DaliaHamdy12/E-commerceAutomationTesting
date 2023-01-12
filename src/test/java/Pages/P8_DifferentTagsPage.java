package Pages;

import StepDefinition.Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P8_DifferentTagsPage {
    public WebElement Electronics()
    {
        return Mouse.driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));
    }
    public WebElement CoolTags() {
        By cool = By.cssSelector("a[href=\"/cool\"]");
        WebElement CoolTags = Mouse.driver.findElement(cool);
        Actions actionProvider = new Actions(Mouse.driver);
        actionProvider.moveToElement(CoolTags).click().build().perform();
        return CoolTags;
    }
    public WebElement DigitalTags() {
        By Digital = By.cssSelector("a[href=\"/digital\"]");
        WebElement DigitalTags = Mouse.driver.findElement(Digital);
        Actions actionProvider = new Actions(Mouse.driver);
        actionProvider.moveToElement(DigitalTags).click().build().perform();
        return DigitalTags;
    }
    public WebElement GameTags() {
        By Game = By.cssSelector("a[href=\"/game\"]");
        WebElement GameTags = Mouse.driver.findElement(Game);
        Actions actionProvider = new Actions(Mouse.driver);
        actionProvider.moveToElement(GameTags).click().build().perform();
        return GameTags;
    }

    public WebElement ComputerTags() {
        By Computer = By.cssSelector("a[href=\"/computer\"]");
        WebElement  ComputerTags = Mouse.driver.findElement(Computer);
        Actions actionProvider = new Actions(Mouse.driver);
        actionProvider.moveToElement( ComputerTags).click().build().perform();
        return  ComputerTags;
    }

}
