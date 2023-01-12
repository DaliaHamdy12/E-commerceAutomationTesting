package StepDefinition;

import Pages.P92_ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class SD92_ShoppingCart {
    P92_ShoppingCartPage ShopCart = new P92_ShoppingCartPage();

    @When("user add Apple MacBook to the cart")
    public void Apple_MacBook() {
        ShopCart.Apple_MacBook().click();
    }

    @And("user click on add to the cart button")
    public void Add_To_Cart_1() {
        ShopCart.Add_To_Cart_1().click();
    }
    @Then("success message appear")
    public void Success_message_1() {
        String ExpectedResult = "The product has been added to your shopping cart";
        String ActualResult = Mouse.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertEquals(ActualResult.contains(ExpectedResult),true);
        System.out.println("Apple MacBook Pro 13-inch: The product has been added to your shopping cart");
    }
    @When("user add Laptop Samsung to the cart")

    public void Laptop_Samsung() {
        ShopCart.Laptop_Samsung().click();
    }
    @And("user click on add to the cart button_2")
    public void Add_To_Cart_2() {
        ShopCart.Add_To_Cart_2().click();
    }
    @Then("success message appear_2")
    public void Success_message_2() {
        String ExpectedResult = "The product has been added to your shopping cart";
        String ActualResult = Mouse.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
        System.out.println("Samsung Series 9 Laptop: The product has been added to your shopping cart");
    }
    @When("user add gift card to the cart")
    public void Gift_card() {
        ShopCart.Gift_card().click();

    }
    @And("user fills the mandatory fields")
    public void user_fills_fields() {
        ShopCart.RecipientName().sendKeys("Noor");
        ShopCart.RecipientEmail().sendKeys("Noor@test.com");
        ShopCart.SenderName();
        ShopCart.SenderEmail();

    }
    @And("user click on add to tha cart button_3")
    public void Add_To_Cart_3() {
        ShopCart.Add_To_Cart_3().click();
    }

    @Then("success message appear_3")
    public void Success_message_3() {
        String ExpectedResult = "The product has been added to your shopping cart";
        String ActualResult = Mouse.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
        System.out.println("Gift Card: The product has been added to your shopping cart");
    }

}
