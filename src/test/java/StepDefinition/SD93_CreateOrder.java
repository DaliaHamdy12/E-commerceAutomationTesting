package StepDefinition;

import Pages.P93_CreateOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD93_CreateOrder {
    P93_CreateOrderPage Order = new P93_CreateOrderPage();

    @And("user click on shopping cart link")
    public void Navigate_to_shopping_cart_page() {
        Order.Navigate_to_shopping_cart_page().click();
    }

    @And("user choose to wrapped his order as a gift")
    public void choose_wrapped() {
        Order.choose_wrapped();
    }

    @And("user check on the agreement checkBox")
    public void agreement_checkbox() {
        Order.agreement_checkbox().click();
    }

    @When("user click on checkout button")
    public void checkout_button() {
        Order.checkout_button().click();

    }

    @And("user fills all mandatory fields")
    public void fills_data() {
        Order.Country();
        Order.City().sendKeys("Cairo");
        Order.Address().sendKeys("12 st Cairo Egypt");
        Order.ZipCode().sendKeys("1121999");
        Order.PhoneNum().sendKeys("01004567891");

    }

    @Then("user click on continue button")
    public void continue_Btn() {
        Order.continue_Btn().click();
    }

    @And("user select ground option and click continue button")
    public void continue_Btn2() {
        Order.continue_Btn2().click();

    }

    @And("user select money option and click continue")
    public void continue_Btn3() {
        Order.continue_Btn3().click();

    }

    @And("user click continue button4")
    public void continue_Btn4() {
        Order.continue_Btn4().click();

    }

    @And("user click confirm button")
    public void confirm_Btn() {
        Order.confirm_Btn().click();

    }
}
