package Pages;

import StepDefinition.Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P90_WishlistPage {
    public WebElement Apple_MacBook() {

        return Mouse.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));
    }
    public WebElement Add_To_Wishlist_1() {

        return Mouse.driver.findElement(By.id("add-to-wishlist-button-4"));
    }

    public WebElement Laptop_Samsung() {

        return Mouse.driver.findElement(By.cssSelector("a[href=\"/samsung-series-9-np900x4c-premium-ultrabook\"]"));

    }
    public WebElement Add_To_Wishlist_2() {

        return Mouse.driver.findElement(By.id("add-to-wishlist-button-6"));
    }

    public WebElement HP_Laptop() {

        return Mouse.driver.findElement(By.cssSelector("a[href=\"/hp-spectre-xt-pro-ultrabook\"]"));
    }
    public WebElement Add_To_Wishlist_3() {

        return Mouse.driver.findElement(By.id("add-to-wishlist-button-7"));
    }
}
