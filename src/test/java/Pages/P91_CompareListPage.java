package Pages;

import StepDefinition.Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P91_CompareListPage {
    public WebElement Apple_MacBook() {
        return Mouse.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));
    }
    public WebElement Add_To_compare_List_1() {
        return Mouse.driver.findElement(By.cssSelector("div div[class=\"compare-products\"]"));
    }
    public WebElement HP_Spectre () {
        return Mouse.driver.findElement(By.cssSelector("a[href=\"/hp-spectre-xt-pro-ultrabook\"]"));
    }
    public WebElement Add_To_compare_List_2() {
        return Mouse.driver.findElement(By.cssSelector("div div[class=\"compare-products\"]"));
    }

    public WebElement lenovo_Laptop() {
        return Mouse.driver.findElement(By.cssSelector("a[href=\"/lenovo-thinkpad-x1-carbon-laptop\"]"));
    }
    public WebElement Add_To_compare_List_3() {
        return Mouse.driver.findElement(By.cssSelector("div div[class=\"compare-products\"]"));
    }
}
