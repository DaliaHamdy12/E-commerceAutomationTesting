package Pages;

import StepDefinition.Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P6_DifferentCategoryPage {
    public WebElement Computercategory()
    {
        By ComputerCategory = By.cssSelector("a[href=\"/computers\"]");
        WebElement Computercategory = Mouse.driver.findElement(ComputerCategory);
        Actions actionProvider = new Actions(Mouse.driver);
        actionProvider.moveToElement(Computercategory).click().build().perform();
        return Computercategory;

    }
    public WebElement SubCategory()
    {
        By subcategory = By.cssSelector("a[href=\"/electronics\"]");
        WebElement SubCategory = Mouse.driver.findElement(subcategory);
        Actions actionProvider = new Actions(Mouse.driver);
        actionProvider.moveToElement(SubCategory).build().perform();

        By CameraSubCategory = By.cssSelector("a[href=\"/camera-photo\"]");
        WebElement Electronics_SubCategory_Camera_photo = Mouse.driver.findElement(CameraSubCategory);
        actionProvider.moveToElement(Electronics_SubCategory_Camera_photo).click().build().perform();
        return SubCategory;
    }
    public WebElement CardCategory()
    {
        By giftCard = By.cssSelector("a[href=\"/gift-cards\"]");
        WebElement CardCategory = Mouse.driver.findElement(giftCard);
        Actions actionProvider = new Actions(Mouse.driver);
        actionProvider.moveToElement(CardCategory).click().build().perform();
        return CardCategory;
    }

}
