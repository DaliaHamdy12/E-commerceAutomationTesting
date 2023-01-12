package Pages;

import StepDefinition.Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P7_FilterWithColorPage {
    public WebElement Apparel()
    {
        By ApparelCategory = By.cssSelector("a[href=\"/apparel\"]");
        WebElement Apparel_subcategory = Mouse.driver.findElement(ApparelCategory);
        Actions actionProvider = new Actions(Mouse.driver);
        actionProvider.moveToElement(Apparel_subcategory).build().perform();
        return Apparel_subcategory;
    }
    public WebElement Shoes()
    {
        By ShoesCategory = By.cssSelector("a[href=\"/shoes\"]");
        WebElement shoesCategory = Mouse.driver.findElement(ShoesCategory);
        Actions actionProvider = new Actions(Mouse.driver);
        actionProvider.moveToElement(shoesCategory).build().perform();
        return shoesCategory;
    }
    public WebElement FilterColor()
    {
        return Mouse.driver.findElement(By.id("attribute-option-16"));
    }


}
