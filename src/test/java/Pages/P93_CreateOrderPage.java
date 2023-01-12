package Pages;

import StepDefinition.Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P93_CreateOrderPage {
    public WebElement Navigate_to_shopping_cart_page() {
        return Mouse.driver.findElement(By.cssSelector("a[href=\"/cart\"]"));
    }

    public WebElement choose_wrapped() {
        By checkout = By.name("checkout_attribute_1");
        WebElement choose_wrapped = Mouse.driver.findElement(checkout);
        Select drpCountry = new Select(choose_wrapped);
        drpCountry.selectByVisibleText("Yes [+$10.00]");
        return choose_wrapped;
    }

    public WebElement agreement_checkbox() {
        return Mouse.driver.findElement(By.id("termsofservice"));
    }

    public WebElement checkout_button() {
        return Mouse.driver.findElement(By.id("checkout"));
    }
    public WebElement Country() {
        By country = By.id("BillingNewAddress_CountryId");
        WebElement Country = Mouse.driver.findElement(country);
        Select selectObject2 = new Select(Country);
        selectObject2.selectByValue("123");
        return Country;
    }

    public WebElement City() {
        return Mouse.driver.findElement(By.name("BillingNewAddress.City"));
    }

    public WebElement Address() {
        return Mouse.driver.findElement(By.name("BillingNewAddress.Address1"));
    }

    public WebElement ZipCode() {
        return Mouse.driver.findElement(By.name("BillingNewAddress.ZipPostalCode"));
    }

    public WebElement PhoneNum() {
        return Mouse.driver.findElement(By.name("BillingNewAddress.PhoneNumber"));
    }

    public WebElement continue_Btn() {
        return Mouse.driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]"));
    }

    public WebElement continue_Btn2() {
        return Mouse.driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button"));
    }

    public WebElement continue_Btn3() {
        return Mouse.driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button"));
    }

    public WebElement continue_Btn4() {
        return Mouse.driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button"));
    }

    public WebElement confirm_Btn() {
        return Mouse.driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button"));
    }
}
