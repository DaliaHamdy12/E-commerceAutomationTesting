package StepDefinition;

import Pages.P7_FilterWithColorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD7_FilterWithColor {
    P7_FilterWithColorPage FilterColor = new P7_FilterWithColorPage();

   /* @Given("logged user navigate to the home page")
    public void navigate_to_home() {
        String url = "https://demo.nopcommerce.com/";
        Mouse.driver.navigate().to(url);
    }*/
    @When("user select a Apparel category then hover to Shoes subcategory")
    public void Apparel() {
        FilterColor.Apparel();
    }
    @And("user select shoes subCategory")
    public void Shoes() {
        FilterColor.Shoes().click();
    }
    @Then("filter by blue color")
    public void Filter_Color() {
        FilterColor.FilterColor().click();
    }


}
