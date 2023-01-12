package Pages;

import StepDefinition.Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P92_ShoppingCartPage {
    public WebElement Apple_MacBook() {

        return Mouse.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));
    }

    public WebElement Add_To_Cart_1() {

        return Mouse.driver.findElement(By.id("add-to-cart-button-4"));
    }


    public WebElement Laptop_Samsung() {

        return Mouse.driver.findElement(By.cssSelector("a[href=\"/samsung-series-9-np900x4c-premium-ultrabook\"]"));
    }

    public WebElement Add_To_Cart_2() {

        return Mouse.driver.findElement(By.id("add-to-cart-button-6"));

    }

    public WebElement Gift_card() {

        Mouse.driver.navigate().to("https://demo.nopcommerce.com/");
        return Mouse.driver.findElement(By.cssSelector("a[href=\"/25-virtual-gift-card\"]"));
    }

    public WebElement RecipientName() {

        return Mouse.driver.findElement(By.name("giftcard_43.RecipientName"));
    }

    public WebElement RecipientEmail() {

        return Mouse.driver.findElement(By.id("giftcard_43_RecipientEmail"));
    }

    public WebElement SenderName() {

        return Mouse.driver.findElement(By.id("giftcard_43_SenderName"));
    }

    public WebElement SenderEmail() {

        return Mouse.driver.findElement(By.id("giftcard_43_SenderEmail"));
    }
    public WebElement Add_To_Cart_3() {

        return Mouse.driver.findElement(By.id("add-to-cart-button-43"));

    }
}
